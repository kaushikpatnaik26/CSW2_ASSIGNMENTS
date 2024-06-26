package Q05;
import java.util.HashMap;

public class Library {
	
	public static boolean isPresent(HashMap<Integer,Book> list,String name) {
		for(Book book:list.values()) {
			return book.name.equals(name);
		}
		return false;
	}
	
	public static void removeBook(HashMap<Integer,Book> list,int key) {
		list.remove(key);
	}
	
	public static void main(String[] args) {
		
		Book b1=new Book("Book1","Author1",999,450);
		Book b2=new Book("Book2","Author2",4974,811);
		Book b3=new Book("Book3","Author3",1200,2566);
		Book b4=new Book("Book4","Author4",98784,6546);
		Book b5=new Book("Book5","Author5",865768,684687);
		
		HashMap<Integer,Book> list=new HashMap<>();
		list.put(b1.id, b1);
		list.put(b2.id, b2);
		list.put(b3.id, b3);
		list.put(b4.id, b4);
		
		System.out.println(isPresent(list,b5.name));
		removeBook(list,b3.id);
		
		for(int key:list.keySet()) {
			System.out.println("Id:"+key+" Book:"+list.get(key).name);
		}
	}
}
