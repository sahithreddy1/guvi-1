import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int t1=0,t2=1;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;++i)
		{
		int sum=t1+t2;
		t1=t2;
		t2=sum;
		System.out.print(t1+" ");
		}
	}
}
