import java.util.Scanner;

public class DifferenceBetweenMaxAndMin {
	public static void main(String[] args) {
		
		System.out.println("Please, enter a value for lenght of the array:");
		Scanner sc=new Scanner(System.in);
		int lenght=sc.nextInt();
		System.out.println("Please, enter values for the array: ");
		int[] masiv =new int[lenght];
		for (int i = 0; i < masiv.length; i++) {
			masiv[i]=sc.nextInt();
		}

		int result = findDifference(masiv, 0, masiv[0], masiv[0]);
		System.out.println("The difference between the max and the min element of the array is: "+result);
	}
	static int findDifference(int[] array, int current, int min, int max) {

		if (current == array.length) {
			return max - min;
		}
		if (array[current] < min) {
			return findDifference(array, current + 1, array[current], max);
		}
		if (array[current] > max) {
			return findDifference(array, current + 1, min, array[current]);
		}
		return findDifference(array, current + 1, min, max);
	}

}
