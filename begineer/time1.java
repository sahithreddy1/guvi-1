import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int p1=n%60;
		int p2=n/60;
		int p3=p2%60;
		System.out.println(p3+" "+p1);
	}
}
