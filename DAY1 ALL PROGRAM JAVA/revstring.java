public class revstring{
public static void main(String[] args){
String a="vardhani";
char str[]=a.toCharArray();
int n=str.length;
int i;
for(i=n-1;i>=0;--i)
{
System.out.println(str[i]);
}
}
}