import java.util.Scanner;
public class Frequency
{
public static void main(String[] args)
{
int i=0,count=0,len=0;
Scanner sc= new Scanner(System.in);
System.out.println("enter the string");
String str=sc.nextLine().toUpperCase();
System.out.println("enter the character");
char ch=sc.nextLine().toUpperCase().charAt(0);
 len=str.length();
while(i < len)
{
if(str.charAt(i)==ch)
{
count++;
}
i++;
}
System.out.println("count of occurance of" + ch + "=" + count);
}
}





