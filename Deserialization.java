//Deserialization
import java.io.*;
class Deserialization{
        public static void main(String args[])
        {
            try{

            
            FileInputStream fin=new FileInputStream("f.txt");
            ObjectInputStream in =new ObjectInputStream(fin);
            Student_serial s=(Student_serial)in.readObject();
            s.disp();
            in.close();
        }catch(Exception e)
        {
            
        }
        }
}