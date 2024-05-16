package ErrorHandling;

public class Q20 {

	public static void traverseArray(int[] array, int index) {
		if (index >= array.length) {
			System.out.println("Traversal complete.");
			return;
		}
		try {
			System.out.println("Element at index " + index + ": " + array[index]);
			traverseArray(array, index + 1);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException: " + e.getMessage());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = {0, 6, 7, 9, 4};
		traverseArray(array,0);
	}

}
