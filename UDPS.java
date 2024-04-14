//UDP server
import java.io.*;
import java.net.*;
class UDPS
{
    public static void main(String args[])
    {
        DatagramSocket ds=null;
        DatagramPacket dp=null,reply;
        try{
            ds=new DatagramSocket(1234);
            byte[] buffer=new byte[1000];
            dp=new DatagramPacket(buffer,buffer.length);
            ds.receive(dp);
            System.out.println("from client"+(new String(dp.getData())).trim());
            System.out.println("client port"+dp.getPort());
            reply=new DatagramPacket("from server ok".getBytes(),"from server ok".length(),dp.getAddress(),dp.getPort());
            ds.send(reply);

        }catch(Exception e)
        {
            System.out.println(e);
        }
    }
}