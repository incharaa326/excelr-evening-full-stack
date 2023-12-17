class L
{
	static int x = 100;//global variable
	
	public static void main(String[] args) 
	{
		System.out.println(x);//local variable
		int x = 10;
		System.out.println(x);//local variable
		System.out.println(L.x);//global variable
		x = 20;
		System.out.println(x);//local variable
		System.out.println(L.x);//global variable
		L.x = 200;
		System.out.println(x);//local variable
		System.out.println(L.x);//global variable
	}
}
//we can use the global variable along the class name reference