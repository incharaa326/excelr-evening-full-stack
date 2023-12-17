import java.util.Scanner;
class A
{
	public static void main(String[] args) 
	{
		System.out.println("enter a complete token or word or a character");
		Scanner sc = new Scanner(System.in);
		String token = sc.nextLine();
		System.out.println("the token that you have entered is: |" + token +"| ");
		sc.close();

	}
}
