package ErrorHandling;
public class Q01 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s=null;
		try {
			int size=s.length();
			System.out.println("Size of string :"+size);
		}catch(NullPointerException e) {
			System.err.println(e.getMessage());
		}
	}
}
