class A13
{
	public static void main(String[] args) 
	{
		int n=5;
		int  i,j;
		for (i = 1; i <= n; i++)
	{
		System.out.print((char) ('A' + i - 1) + " ");
		for (j = 1; j < i; j++)
			{
		     System.out.print((char) ('A' + i - 1));
	     }
		 System.out.println();

       }
	}

}
