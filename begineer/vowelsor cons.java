/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner Sc =new Scanner(System.in);
	    System.out.println("enter the words");
	    char v=Sc.next().charAt(0);
	    if(v=='a'||v=='e'||v=='i'||v=='o'||v=='u')
	    {
	    		System.out.println("the given words are vowels");	
	    }
	    else
	    {
	    	System.out.println("the given words are consonents");
	    }
	}  
	

}
