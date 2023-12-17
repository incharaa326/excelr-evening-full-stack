class G 
{
	public static void main(String[] args) 
	{
		System.out.println("from G main begin");
		System.out.println(F.i);
		System.out.println(F.test());
		System.out.println("from G main end");
	}
}
//accessing other class members from the current class
//it should be in the same folder