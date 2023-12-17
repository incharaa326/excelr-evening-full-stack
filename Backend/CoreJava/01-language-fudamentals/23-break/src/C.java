class C
{
	public static void main(String[] args) 
	{
		int i;
		for (i=0;i<10;i++)
		{
		System.out.println("loop begin:" + i);
		if(i>5)
			{
			    break;
				System.out.println("some statements");
			}
			System.out.println("loop end:" + i);
		}
		System.out.println("main end:" + i);
	}
}
//break must be end of the current block
//after break statement will unreachable