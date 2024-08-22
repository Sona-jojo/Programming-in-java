import java.util.Scanner;
public class average
{
public static void main (String[] args)
{
Scanner sc = new Scanner (System.in);
System.out.println("enter three numbers");
int a = sc.nextInt();
int b = sc.nextInt();
int c = sc.nextInt();
int sum=a+b+c;
double average =sum/3.0;
System.out.println("average="+average);
}
}
