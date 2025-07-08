import java.util.Scanner;

public class file{ 
	public static void main(String [] args){
		Scanner scan = new Scanner(System.in);

		System.out.println("What is your name? ");
		String name = scan.next();

		System.out.println("What is your surname? ");
		String surname = scan.next();

		System.out.println("What is your age? ");
		int age = scan.nextInt();
	}
}