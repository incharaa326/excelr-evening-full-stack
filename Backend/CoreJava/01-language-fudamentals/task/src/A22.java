class A22	
{
	public static void main(String[] args) 
	{
		int n=5;
		int i,j;
		for (i = n; i >= 1; i--)
		{
             for (j = 0; j < i; j++)
			{
                System.out.print((char) ('A' + i - 1) + " ");
			}
		 System.out.println();
		}
	}
}
