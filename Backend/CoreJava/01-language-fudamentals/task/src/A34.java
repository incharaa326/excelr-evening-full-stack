class A34	
{
	public static void main(String[] args) 
	{
		int rows = 5;
		int i, j , k;
		for (i = 0; i < rows; i++)
		{
				for (j = 0; j < rows-i-1; j++)
			{
				System.out.print(" ");
			}
			    for (k = 0; k < 2 * i + 1; k++)
			{
                System.out.print("*");
			}
		 System.out.println();
		}
	}
}
