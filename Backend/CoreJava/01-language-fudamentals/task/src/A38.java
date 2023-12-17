class A38
{
	public static void main(String[] args) 
	{
		int i, j, k;
		char startChar = 'A';
		int rows = 5;
		for (i = 0; i < rows; i++)
	{
		for (j = 0; j < rows - i - 1; j++)
	{
		System.out.print(" ");
	}
	    for (k = 0; k < 2 * i + 1; k++)
	{
		System.out.print((char) (startChar + 2 * i));
	}
		 System.out.println();
		}
	}
}
