import java.util.Scanner;


public class Input
{
	public static void main(String[] args)
	{
		int age;
		String name;
		System.out.println("Enter your age.");
		Scanner scanner = new Scanner(System.in);
		age = scanner.nextInt();
		System.out.println("Enter your full name");
		Scanner scanner2 = new Scanner(System.in);
		name = scanner2.nextLine();
		name = name.toUpperCase();
		scanner.close();
		System.out.println("Your name in uppercase is " + name + " and you are " + age + " years old");
	}

		
}
