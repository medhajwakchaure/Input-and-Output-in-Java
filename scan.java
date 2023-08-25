import java.util.Scanner;
class Student
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name rollno percent");
		String name=sc.next();
		int rollno=sc.nextInt();
		float percent=sc.nextFloat();
		System.out.println("Your name: " +name);
		System.out.println("Your Roll no: " +rollno);
		System.out.println("Your percentage : " +percent);
	}
}