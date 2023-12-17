class O 
{
	static int i = 100;//global variable

	public static void main(String[] args) 
	{
		double i = 20.0;//local variable
		System.out.println(i);//local variable
		System.out.println(O.i);//glabal variable
	}
}
