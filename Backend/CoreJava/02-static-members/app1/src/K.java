class K 
{
	static int x = 100;//global variable
	
	public static void main(String[] args) 
	{
		System.out.println(x);
		int x = 10;//local variable
		System.out.println(x);
		x = 20;
		System.out.println(x);
	}
}
//local or global is same name its preferance to local only