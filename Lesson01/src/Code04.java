import java.util.Scanner;

public class Code04 {

	public static void main(String[] args) {

		String name = null;
		int age;
		String gender;
		
		Scanner key = new Scanner(System.in);
		System.out.println("Please your type name, type age, type gender: ");
		
		name = key.next();
		age = key.nextInt();
		gender = key.next();
		
		if(gender.equals("male")) {
			System.out.println(name + ", " + age + "years old man.");
		}else if(gender.equals("female")) {
			System.out.println(name + ", " + age + "years old woman.");
		}else {
			System.out.println("hmmmm...interesting.");
		}

		key.close();
		
	}

}
