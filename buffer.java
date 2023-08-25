import java.io.*;
class student
{
	public static void main(String args[]) throws IOException
	{
		InputStreamReader obj=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(obj);
		
		System.out.println("Enter your name:");
		String name=br.readLine();
		
		
		//Accepting Integer value
		
		System.out.println("Enter your Roll No. :");
		int rollno=Integer.parseInt(br.readLine());
		
		
		//Accepting float value
		
		System.out.println("Enter your CGPA:");
		float cgpa=Float.parseFloat(br.readLine());
		
		
		System.out.println("Hello" + name);
		System.out.println("Your Roll No. is: "+ rollno);
		System.out.println("Your percentage is : " +cgpa);
	}
}