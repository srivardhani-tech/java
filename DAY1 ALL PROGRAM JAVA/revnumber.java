public class revnumber{
public static void main(String[] args){
System.out.println("the reverse og the given number is");
int n=1234;
int rem,num=0;
while(n!=0)
{
rem=n%10;
num=num*10+rem;
n=n/10;
}
System.out.println(num);
}
}