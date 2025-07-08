import java.util.Scanner;

public class CustomerGreetings{
	
	public void printName(){
	 String name ="What is your name: ";
	 System.out.println(name);
	}

	public void printSurname(){
	 String surname = "What is your surname: ";
	 System.out.println(surname);
	}

	public void printAge(){
	 String age = "What is your age: ";
	 System.out.println(age);
	}

	public static void main(String [] args){
		CustomerGreetings obj = new CustomerGreetings();
		Scanner scan = new Scanner(System.in);
		obj.printName();
		String name = scan.nextLine();

		obj.printSurname();
		String surname = scan.nextLine();

		obj.printAge();
		int age = scan.nextInt();

		System.out.println("Hello "+ name + " " + surname + ", your age is "+ age + " years old.");
	}
}