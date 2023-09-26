import java.util.Scanner;
public class idvalidity{
public static void main(String[] args){
System.out.println("checking the validity of the user id");
System.out.println("enter the id");
Scanner i=new Scanner(System.in);
String id=i.nextLine();
String con=i.nextLine();
if(id.equals(con))
{
System.out.println("password confirmed");
}
else
{
System.out.println("incorrect password");
}
}
}