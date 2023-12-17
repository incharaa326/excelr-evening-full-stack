import java.util.Scanner;
class Facebook
{
	public static void main(String[] args) 
	{
		System.out.println("welcome to facebook! please register");
		Scanner sc = new Scanner(System.in);
         
		System.out.println("enter your first name");
		String firstName = sc.next();

		System.out.println("enter your sir name");
		String sirName = sc.next();

		System.out.println("enter your mobile number");
		long mobileNumber= sc.nextLong();

		System.out.println("enter your email id");
		String emailId = sc.next();

		System.out.println("enter new password");
		String newPassword= sc.next();

		System.out.println("enter your DOB");
		String dateOfBirth = sc.next();

		System.out.println("enter your gender");
		String gender = sc.next();

		System.out.println("enter your salary");
		double salary = sc.nextDouble();

		System.out.println("enter your first initials");
		String firstInitials = sc.next();

		System.out.println("enter your favorite qoute");
        sc.nextLine();
		String qoute = sc.nextLine();

		System.out.println("are you alive?");
		boolean status = sc.nextBoolean();


		System.out.println("\n_________________________\n your details are listed below\n" + 
		"firstname:" + firstName + "\n" + 
		"sir name:" + sirName + "\n" +
		"mobile number:" + mobileNumber + "\n" +
		"email id:" + emailId + "\n" +
		"new password:" + newPassword + "\n" +
		"DOB:" + dateOfBirth + "\n" +
		"gender:" + gender + "\n" +
		"mobile number:" + mobileNumber + "\n" +
		"salary:" + salary + "\n" +
		"first initials:" + firstInitials + "\n" +
		"qoute:" + qoute + "\n" +
		"are you alive?:" + status);

		sc.close();
	}
}