import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc =new Scanner(System.in);
		String n=sc.nextLine();
		boolean numeric=true;
		try
		{
			Double v=Double.parseDouble(n);
			
		}
		
		catch(NumberFormatException e){
			 numeric = false;
			}	
		if(numeric)
		{
			System.out.print("yes");
		}
		else
		{
			System.out.print("no");
		}
	}
}
