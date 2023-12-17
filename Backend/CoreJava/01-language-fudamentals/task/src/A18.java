class A18	
{
	public static void main(String[] args) 
	{
		int n=5;
		int i,j;
		for (i = 0; i < n; i++)
		{
             for (j = 0; j < n - i; j++)
			{
                System.out.print((char) ('A' + i));
			}
		 System.out.println();
		}
	}
}
