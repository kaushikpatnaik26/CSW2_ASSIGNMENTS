package Q02;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ArrayListUser {
	private ArrayList<User> users;
	
	public ArrayListUser() {
		this.users=new ArrayList<>();
	}
	
	void add(User user) {
		users.add(user);
	}
	
	void printUsers() {
		for(User user:users) {
			System.out.println("Name:"+user.getName()+", Age:"+user.getAge());
		}
	}
	
	void sortByAge() {
		Collections.sort(users, Comparator.comparingInt(User::getAge));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayListUser users=new ArrayListUser();
		
		users.add(new User("naveen babu",(byte)26));
		users.add(new User("narendra modululi",(byte)45));
		users.add(new User("amit sheesh",(byte)18));
		users.add(new User("aparjita ias",(byte)77));
		users.add(new User("the local band",(byte)99));
		
		System.out.println("Before Sorting:");
		users.printUsers();
		
		users.sortByAge();
		System.out.println();
		
		System.out.println("After Sorting:");
		users.printUsers();
		
	}

}
