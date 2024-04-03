class Odd extends Thread{
    public void run(){
        int ch='1';
        for(int i=1;i<=5;i++)
        {
            try{
                System.out.println(ch);
                ch=ch+2;
                sleep(1500);

            }catch(Exception e){}
        }
    }
}

class Even extends Thread{
    public void run(){
        int c='2';
        for(int j=2;j<=5;j++)
        {
            try{
                System.out.println(c);
                c=c+2;
                sleep(2000);
              }catch(Exception e){}
        }
    }
}

class ThreadExy{
     public static void main(String args[])
     {
        Odd threadA=new Odd();
        Even threadB=new Even();
        threadA.start();
        threadB.start();
        System.out.println("end of main thread");
     }
}