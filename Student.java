import java.util.Scanner;


//Scanner method question 4
public class Student
{
    public void studentDetails()
  {
	Scanner s=new Scanner(System.in);
	Scanner s1=new Scanner(System.in);
	System.out.println("Enter the Student id:");
	int nextInt = s.nextInt();
	System.out.println("Student id:"+nextInt);
	System.out.println("Enter the student name:");
	String next = s.next();
	System.out.println("Student name:"+next);
	System.out.println("Enter the student Email id:");
	String next2 = s.next();
	System.out.println("Student email id :"+next2);
	System.out.println("Enter the phone no.");
	long nextLong = s.nextLong();
	System.out.println("Student phone no.:"+nextLong);
	System.out.println("Enter the department:");
	String nextLine = s1.nextLine();
	System.out.println("Student Department:"+nextLine);
	System.out.println("Enter the Gender of the student");
	String next3 = s.next();
	System.out.println("Student Gender:"+next3);
	System.out.println("Enter the student City:");
	String nextLine2 = s1.nextLine();
    System.out.println("Student City :"+nextLine2);
  }
    public static void main(String args[])
    {
    	Student u=new Student();
    	u.studentDetails();
    }
}