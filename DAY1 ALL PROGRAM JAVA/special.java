
import java.util.Scanner;
public class special{
public static void main(String[] args){
System.out.println("enter the string");
Scanner str=new Scanner(System.in);
String s=str.nextLine();
char []ch=s.toCharArray();
int i,counter=0;
for(i=0;i<ch.length;i++)
{
if(ch[i]=='!'||ch[i]=='@'||ch[i]=='#'||ch[i]=='$'||ch[i]=='%'||ch[i]=='^'||ch[i]=='&'||ch[i]=='*')
{
counter=counter+1;
System.out.println(ch[i]);
}
else
{
continue;
}
}
System.out.println(counter);
System.out.println("the special characters are");
}
}

