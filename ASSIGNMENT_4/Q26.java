package ErrorHandling;
public class Q26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			throw new ClassNotFoundException("Class not found exception occurred.");
		} catch (ClassNotFoundException e) {
			System.err.println("ClassNotFoundException caught: " + e.getMessage());
		} finally {
			System.out.println("Inside finally block. This block always executes.");
		}
		
	}
}
