class H
{
	public static void main(String[] args) 
	{
		int firstNum = 10;
		int secondNum = 5;
		int thirdNum = -5;
		
	    
		int min = (firstNum < secondNum && firstNum < thirdNum) ? firstNum : (secondNum < thirdNum) ? secondNum : thirdNum);
		System.out.println(min);
	}
}
