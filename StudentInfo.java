
public class StudentInfo 
{
  public void studentDetails(String Name)
  {
	  System.out.println("student name is:"+Name);
  }
  public void studentDetails(char Gender,int id,long registerid,long phoneno)
  {
	  System.out.println("student gender is:"+Gender);
	  System.out.println("student id:"+id);
	  System.out.println("student register id :"+registerid);
	  System.out.println("student phoneno is:"+phoneno);
  }
  public void studentDetails(String Fathername,String Mothername,String Surname)
  {
	  System.out.println("Student Father name is:"+Fathername);
	  System.out.println("Student Mother name is:"+Mothername);
	  System.out.println("Student Surname is:"+Surname);
  }
  public void  studentDetails(int sciencemarks,int socialmarks,float mathsmarks,int englishmarks,float sanskritmarks )
  {
	  System.out.println("student science marks:"+sciencemarks);
	  System.out.println("student social marks:"+socialmarks);
	  System.out.println("student maths marks:"+mathsmarks);
	  System.out.println("student english marks:"+englishmarks);
	  System.out.println("student sanskrit marks:"+sanskritmarks);
  }
  public void studentDetails(boolean volleyball,boolean throwball,boolean cricket)
  {
	  System.out.println("Krishna plays volleyball:"+volleyball);
	  System.out.println("Krishna plays throwball:"+throwball);
      System.out.println("Krishna plays cricket:"+cricket);  
  }
 public void studentDetails(char department,long landlineno,int labno,long emergencycontact)
 {
	 System.out.println("student department is:"+department);
	 System.out.println("student landlineno:"+landlineno);
	 System.out.println("student labno:"+labno);
	 System.out.println("student emergencycontact:"+emergencycontact);
 }
 
  public static void main(String args[])
  {
	  StudentInfo s=new StudentInfo();
	  s.studentDetails("Krishna");
	  s.studentDetails('m',100,25645l,1254685l);
	  s.studentDetails("vasudev", "Yashoda", "Yadav");
	  s.studentDetails('p',8915475l, 20, 152468755l);
	  s.studentDetails(98,95,96.75f,94,99.99f);
	  s.studentDetails(true, true, false);
	  
	  
  }
  
 
} 

