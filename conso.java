import java.io.Console;
class user
{
public static void main(String args[])
{
   
   Console C=System.console();
   System.out.println("Enter your name:");
   String n=C.readLine();
   System.out.println("Welcome"+ n);
}

}