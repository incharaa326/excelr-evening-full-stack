class I
{
	public static void main(String[] args) 
	{
		int firstNum = 10;
		int secondNum = 5;
		int thirdNum = -5;
		int fourthNum = 9;
        
		int min = (firstNum < secondNum && firstNum < thirdNum && firstNum < fourthNum ) ? firstNum : ( secondNum < thirdNum && secondNum < fourthNum ) secondNum : ( thirdNum < fourthNum ) ? thirdNum : fourthNum; 
		System.out.println(min);
	}
}
