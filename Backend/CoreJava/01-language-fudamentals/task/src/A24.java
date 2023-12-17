class A24	
{
	public static void main(String[] args) 
	{
		int i, j, k;
		int rows = 5;
		for (i = 0; i < rows; i++)
		{
				for (j = 0; j < rows - i - 1; j++)
			{
				System.out.print(" ");
			}
			    for (k = 0; k < i + 1; k++)
			{
                System.out.print("*");
			}
		 System.out.println();
		}
	}
}
