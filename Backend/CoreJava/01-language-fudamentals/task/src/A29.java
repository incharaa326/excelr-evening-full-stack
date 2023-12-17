class A29	
{
	public static void main(String[] args) 
	{
		int i, j, k;
		int rows = 5;
		for (i = 0; i < rows; i++)
		{
				for (j = 0; j < i; j++)
			{
				System.out.print(" ");
			}
			    for (k = 0; k < rows - i; k++)
			{
                System.out.print("*");
			}
		 System.out.println();
		}
	}
}
