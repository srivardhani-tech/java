
import java.util.Scanner;
public class vowels{
public static void main(String[] args){
System.out.println("enter the string");
Scanner str=new Scanner(System.in);
String s=str.nextLine();
char []ch=s.toCharArray();
int i,counter=0;
for(i=0;i<ch.length;i++)
{
if(ch[i]=='A'||ch[i]=='E'||ch[i]=='I'||ch[i]=='O'||ch[i]=='U'||ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
{
counter=counter+1;
}
else
{
continue;
}
}
System.out.println(counter);
}
}

