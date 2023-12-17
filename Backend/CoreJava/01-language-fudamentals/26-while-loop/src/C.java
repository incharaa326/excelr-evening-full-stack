class C
{
	public static void main(String[] args) 
	{
		int i = 0;
		while((i = 2) < 5)//i=2 always reinitializing
		{
			System.out.println(i);
			i++;
		}
		
	}
}