import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int v=sc.nextInt();
		int result=1;
		while(v!=0)
		{
			result*=n;
			--v;
		}
		System.out.println(result);
	}
}
