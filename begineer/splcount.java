import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	int special=0;		
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        
            for(int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z')
            {
            }
            else if (ch >= 'a' && ch <= 'z')
            {
            	
            }
            else if (ch >= '0' && ch <= '9')
             {
             }  
            else{
                special++;
            }
        }
 
       
        System.out.println(special);
	}
}
