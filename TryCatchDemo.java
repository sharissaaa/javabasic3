class TryCatchDemo{
public static void main(String args[])
{
 int a=10,b=5,c=5;
int x,y;
try{
x=a/(b-c);
}catch(ArithmeticException e)
{
 System.out.println("divion by 0");
}
}
}