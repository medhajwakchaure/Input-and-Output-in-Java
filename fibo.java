import java.io.*;
class Fibo
{
	public static void main(String args[]) throws IOException
	{
		InputStreamReader obj=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(obj);
		System.out.println("Enter the fibonacci :");
		int n=Integer.parseInt(br.readLine());
		
		long f1=0;
		long f2=1;
		long f=f1+f2;
		System.out.println(f1);
		System.out.println(f2);
		System.out.println(f);
		
		int count=3;
		while(count<n)
		{
			f1=f2;
			f2=f;
			f=f1+f2;
			System.out.println(f);
			count++;
		}
	}
}