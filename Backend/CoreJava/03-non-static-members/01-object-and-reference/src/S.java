class S 
{
	int i;

	static void test(int i)
	{
		System.out.println("from test(int): begin" +s1 i);
		i = 20;
		System.out.println("from test(int): end " +s1 i);
	}

	public static void main(String[] args) 
	{
		S s1 = new S();
		System.out.println("main begin:" + s1.i);
		s1.i = 10;
		System.out.println("before test(int):" + s1.i);
		test(s1);
		System.out.println("after test(int):" + s1.i);
	}
}
/*
call by value/pass by value

-changes in the destination would not be refecting to the source
-because we are not sending the reference instead we are sending the value
-value is not a key to object(reference is a key to the object)
-we are sending only value not the key,so there is of 0% of object modification
*/