import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner Sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num1=Sc.nextInt();
		System.out.println("enter the number");
		int num2=Sc.nextInt();
		System.out.println("enter the number");
		int num3=Sc.nextInt();
		System.out.println("enter the number");
		if ((num1>=num2) && (num1>=num3))
		{
			System.out.println("num1 is large");
		}
		else
			if((num2>=num1)&&(num2>=num3))
		{	
		
				System.out.println("num2 is large");
			
		}
		else
		{
			System.out.println("num3 is large");
		}
	}
	
}
