class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner Sc=new Scanner(System.in);
		System.out.println("enter the character");
		char ch=Sc.next().charAt(0);
		if((ch>='a'&&ch<='z') || (ch>='A'&&ch<='Z'))
		{
			System.out.println("its is alphabets");
		}
		else
		{
			System.out.println("its not a alphabet");
		}
	}
}
