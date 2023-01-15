import java.util.Scanner;

public class Code02 {
	
	public static void main(String[] args) {
		
		int number = 123;
		
		Scanner key = new Scanner(System.in);
		
		System.out.println("Please enter integer: ");
		
		int input = key.nextInt();
		
		if(input == number) {
			System.out.println("Numbers match!!");
		}else {
			System.out.println("Numbers do not match!!");
		}
		
		key.close();
		
	}
}
