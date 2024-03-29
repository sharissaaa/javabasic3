import java.io.DataInputStream;
class Hostel
{
	String hname;
	String hlocation;
	int nrooms;
      void readData(String x,String y,int z)
      {
       hname=x;
       hlocation=y;
	 nrooms=z;
	}
	void printData()
	{
	 System.out.println("Hostel name="+hname);
	 System.out.println("Hostel location="+hlocation);
	 System.out.println("Hostel no of rooms="+nrooms);
	}
}

interface Department
{
	final String deptname="BCA";
	final String depthead="kurain";
	abstract void showData();
}

class Student extends Hostel implements Department
{	public void showData()
	{
	 System.out.println("dept name:"+deptname);
       System.out.println("dept head:"+depthead); 
      }
	 String studename;
	 String regno;
	 int avgmarks;
	 String subject;
 
	 void getData(String x,String y,int z,String c)
	 {
	  studename=x;
	  regno=y;
	  avgmarks=z;
        subject=c;
	 }

      void displayData()
	{
	 System.out.println("studentname="+studename);
	 System.out.println("studentregno="+regno);
	 System.out.println("student marks="+avgmarks);
	 System.out.println("studen main sub="+subject);
      }
}

class interfaceStudentDemo
{
 public static void main(String args[])
 {
  try{
	DataInputStream in=new DataInputStream(System.in);
	Student s=new Student();
	System.out.println("enter hostelname,location,no of rooms");
	String hn=in.readLine();
	String hl=in.readLine();
	int hr=Integer.parseInt(in.readLine());
	System.out.println("enter studentname,regno,avg marks,subject");
	String name=in.readLine();
	String reg=in.readLine();
	int mark=Integer.parseInt(in.readLine());
	String mainsub=in.readLine();
s.readData(hn,hl,hr);
s.getData(name,reg,mark,mainsub);
s.showData();
s.printData();
s.displayData();
      }catch(Exception e){}
}
}

	
	

	
	

