
public class NumberOfNegativeElements {

	// Write a method that takes a sorted array of numbers and retrieves the
	// number of negative elements in the array
	public static void main(String[] args) {
		int[] newArray = { -6,-3, -2, -1, 0, 5, 2 };
		System.out.println(numberOfNegatives(newArray));
	}

	static int numberOfNegatives(int[] array) {
		int negatives = 0;
		int i = 0;
		while (array[i] < 0) {
			if (array[i] < 0) {
				negatives++;
			}
			i++;
		}
		return negatives;
	}
}
