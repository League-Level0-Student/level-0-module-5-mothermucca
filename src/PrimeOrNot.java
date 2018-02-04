import java.util.Scanner;


public class PrimeOrNot {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		for (int i = 0; i < 100; i++) {
			System.out.println("Give me a number.");
			int number = Integer.parseInt(scanner.next());
			
			if (isPrime(number)) {
				System.out.println("It's prime.");
			} else {
				System.out.println("Not prime.");
			}
		}
		
		scanner.close();
	}
	
	static boolean isPrime(int number) {
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				System.out.println("" + i + " * " + number/i + " = " + number);
				return false;
			}				
		}
		return true;
	}
}
