import java.util.*;
import java.io.*;
class oen
{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
int N;
N=sc.nextInt();
if(N>=1&&N<=100000)
{
if(N%2==0)
{
System.out.print("Even");
}
else
{
System.out.print("Odd");
}
}
}
}
