class A 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i = 0;
		do
		{
            System.out.println("body:" + i);
			i++;
		}
		while (i < 5);
		System.out.println("main end");
	}
}
//in do while loop body executes first and next check the condition