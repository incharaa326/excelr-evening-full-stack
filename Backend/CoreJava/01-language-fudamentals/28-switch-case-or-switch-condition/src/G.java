class G
{
	public static void main(String[] args) 
	{
		int i = 10;
		switch(i)
		{
			default:
				System.out.println("from case default");
			case 2:
		        System.out.println("from case 2");
			    break;
			case 3:
		        System.out.println("from case 3");
			    break;
			case 5:
		        System.out.println("from case 5");
			    break;
		}
	}
}
//we can keep default anywhere top middle or end
//by default there is no break it will execute full prgm