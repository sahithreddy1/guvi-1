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
		int array[]=new int[n];
		
	
		for(int i=0;i<n;i++)
		{
			array[i]=sc.nextInt();
			
		}
		int larg=array[0];
		int i=0;
		while( i<n)
		{
			if(larg<array[i])
			{
				larg=array[i];
			}
			i++;
		}
		System.out.print(larg);
	}
}
