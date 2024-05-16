package GarbageCollection;
import java.util.List;
import java.util.ArrayList;
class Course {
	String name;
	Course(String name) {
		this.name = name;
	}
}
class Student {
	private String name;
	private List<Course> courses;
	Student(String name) {
		this.name = name;
		this.courses = new ArrayList<>();
	}
	void enroll(Course course) {
		courses.add(course);
	}
	void drop(Course course) {
		courses.remove(course);
	}
	String getName() {
		return name;
	}
	List<Course> getCourses() {
		return courses;
	}
	@Override
	public void finalize() throws Throwable {
		System.out.println("Garbage collecting student: " + name);
	}
}
public class Q7 {
	public static void main(String[] args) {
		Runtime runtime = Runtime.getRuntime();
		
		System.out.println("Initial total memory: " + runtime.totalMemory() + " bytes.");
		System.out.println("Initial free memory: " + runtime.freeMemory() + " bytes.");
		
		Student s1 = new Student("hakimi");
		Student s2 = new Student("barcola");
		
		Course c1 = new Course("IAS");
		Course c2 = new Course("OAS");
		
		student1.enroll(c1);
		student1.enroll(c2);
		student2.enroll(c1);
		
		student1 = null;
		student2 = null;
		
		runtime.gc();
		
		System.out.println("Final total memory: " + runtime.totalMemory() + " bytes.");
		System.out.println("Final free memory: " + runtime.freeMemory() + " bytes.");
	}
}
