package Q2;

public class Main {
	@SuppressWarnings({"rawtypes", "unchecked"})
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Book b1=new Book(250,"Human consciousness",500);
		Book b2=new Book("60a","Artificial Intelligence",1800);
		
		System.out.println(b1);
		System.out.println(b2);
		
		System.out.println(b1.equals(b2));
	}

}
