class A35	
{
	public static void main(String[] args) 
	{
		int rows = 5;
		int i, j , k;
		for (i = 1; i <= rows; i++)
		{
				for (j = 0; j < rows-i; j++)
			{
				System.out.print(" ");
			}
			    for (k = 1; k <= 2 * i - 1; k++)
			{
                System.out.print(i);
			}
		 System.out.println();
		}
	}
}
