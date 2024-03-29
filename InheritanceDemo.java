class ClassA
{
 void dispA()
{
 System.out.println("disp() method of classA");
}
}
class ClassB extends ClassA
{
 void dispB()
 {
  System.out.println("disp() method of classB");
 }
}
class ClassC extends ClassA
{
 void dispC()
 {
  System.out.println("disp() method of classc");
 }
}
public class InheritanceDemo
{
 public static void main(String args[])
{
 ClassB b=new ClassB();
 b.dispB();
 ClassA a=new ClassA();
 a.dispA();
 
}
}


