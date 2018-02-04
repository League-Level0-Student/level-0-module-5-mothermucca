public class ForLoopGauntlet {
	public static void main(String[] args) {
		System.out.println("Display all numbers from 0 to 100");
		for (int i = 0; i < 101; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println();
		
		System.out.println("Display all numbers from 100 to 0");
		for (int i = 100; i >= 0; i--) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println();
		
		System.out.println("Display all even numbers from 2 to 100");
		for (int i = 2; i < 101; i+=2) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println();
		
		System.out.println("Display all odd numbers from 1 to 99");
		for (int i = 1; i < 100; i+=2) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println();
		
		System.out.println("Display all numbers from 1 to 500. If the number is odd, print “odd” next to the number. If the number is even, print “even” next to the number.");
		for (int i = 1; i <= 500; i++) {
			if (i % 2 == 0) {
				System.out.println(i + " is even");
			} else {
				System.out.println(i + " is odd");
			}
		}
		System.out.println();
		
		System.out.println("Display all multiples of 7 from 0 to 777.");
		for (int i = 7; i <= 777; i+=7) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println();

		System.out.println("Print all the years you were alive and how old you were in each. e.g. “In 1979, i was 2 years old.” (for a really old person)");
		for (int i = 1963; i <= 2018; i++) {
			System.out.println("In " + i + " I was " + (i - 1963) + " years old." );
		}
		System.out.println();
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println("" + i + " " + j);
			}
		}
		System.out.println();
		
		System.out.println("Display the numbers 1 through 9 in a 3x3 square grid.");
		for (int i = 0; i < 3; i++) {
			for (int j = 1; j <= 3; j++) {
				System.out.print("" + ((i * 3) + j) + " ");
			}
			System.out.println();
		}
		System.out.println();

		System.out.println("Display the numbers 1 through 100 in a 10x10 square grid.");
		for (int i = 0; i < 10; i++) {
			for (int j = 1; j <= 10; j++) {
				System.out.print("" + ((i * 10) + j) + " ");
			}
			System.out.println();
		}
		System.out.println();
		
		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();
		
		System.out.println("Write a for loop that counts down from 100 to 0. However, the for loop must start with for(int i = 0; and you may NOT have any code ABOVE your for loop.");
		for (int i = 0; i < 100; i++) {
			System.out.print("" + (100-i) + " ");
		}
		System.out.println();
	}
}
