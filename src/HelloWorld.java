import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
<<<<<<< HEAD
		// TODO Auto-generated method stub
		System.out.println("Hello ASE2017 - How are you? :)");
=======
		// TODO Auto-generated method stub
		System.out.println("Hello ASE2017 - How are you? :)");
		
		System.out.println("Please enter your name: ");
		
		Scanner in = new Scanner (System.in);
		String userName = in.nextLine();
		
		HelloUser hu = new HelloUser(userName);
		hu.greetUser();
		
>>>>>>> refs/heads/HelloUser
	}

}
