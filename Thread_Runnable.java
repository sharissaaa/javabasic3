//thread using Runnable
import java.io.*;
class Cthread implements Runnable
{
        int n;
        public Cthread(int a)
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
class Thread_Runnable
{
    public static void main(String args[])
    {
                Cthread c1,c2;
                Thread t1,t2;
                try
                {
                    c1=new Cthread(100);
                    c2=new Cthread(50);
                    t1=new Thread(c1);
                    t2=new Thread(c2);
                    System.out.println("starting thread");
                    t1.start();
                    System.out.println("after thread 1");
                    t2.start();
                    
                }catch(Exception e)
                {

                }
    }
}