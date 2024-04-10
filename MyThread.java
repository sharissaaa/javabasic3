//implementation of thread using extends
import java.io.*;
class Cthread extends Thread
{
    int n;
    public  Cthread(int a)
    {
        n=a;
    }
    public void run()
    {
        int i;
        for(i=0;i<n;i++)
        {
            System.out.println("\ti="+i);
        }
    }
}
class MyThread{
    public static void main(String args[])
    {
        try{
        Cthread C1,C2;
         C1=new Cthread(100);
         C2=new Cthread(50);
        System.out.println("B thread");
        C1.start();

        System.out.println("inside b");
        C2.start();
        

    }catch(Exception e)
    {
        
    }

    }
}