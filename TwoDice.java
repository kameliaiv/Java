import java.util.Random;

public class TwoDice {
	
	// Write a program that asks you to roll two dice
	// and checks the sum of their values.
	// The program asks you to throw the dice until you achieve seven
	// consecutive sums of value '7'.
	// After that the program must tell you how many total tries you have
	// done to achieve this result.
	
	
	public static void main(String[] args) {
		int countSevens = 0;
		int countTries = 0;
		while (true) {
			Random r = new Random();
			int zar1 = r.nextInt(6) + 1;
			System.out.print(zar1 + ", ");
			int zar2 = r.nextInt(6) + 1;
			System.out.println(zar2);

			int sum = zar1 + zar2;
			if (sum == 7) {
				countSevens++;
				if (countSevens == 7) {
					break;
				}
			} else {
				countSevens = 0;
			}
			countTries++;
		}
		System.out.println("Uspeh na: " + countTries + " opit");
	}
}
