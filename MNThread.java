//display from m to n and n to m using 2 thread
import java.io.*;
class cthread extends Thread{
    int n;
    class cthread(int m,int n)
    {
        this.m=m;
        this.n=n;
    }
    void run()
    {
        int i;
        if(m>n)
        {
            for(i=n;i<m;i++)
            {
                    System.out.println("\ti="+i);

            }
         } else
                for(i=m;i<n;i++)
                 System.out.println("\ti="+i);

        }
    }
class MNThread
{
    public static void main(String args[])
    {
        int m,n;
        try
        {
                System.out.println("enter the value of m");
                m=Integer.parseInt(din.readLine());
                System.out.println("enter vale of n");
                n=m=Integer.parseInt(din.readLine());
                MNThread M=new MNThread();
                MNThread N=new MNThread();
                M.start(m,n);
                N.start(n,m);
        }catch(Exception e)
        {

        }
    }
}