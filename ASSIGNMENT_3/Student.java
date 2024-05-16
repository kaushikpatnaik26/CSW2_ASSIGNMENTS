package Q04;
import java.util.LinkedList;

public class Student {
	private String name;
	private int age,mark;
	
	public Student(String name,int age,int mark) {
		this.name=name;
		this.age=age;
		this.mark=mark;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age=age;
	}
	
	public int getMark() {
		return mark;
	}
	public void setMark(int mark) {
		this.mark=mark;
	}
	
	public static void displayList(LinkedList<Student> list) {
		System.out.println("List of students:");
		for(Student individual:list) {
			System.out.println("Name:"+individual.getName()+", Age:"+individual.getAge()+", Mark:"+individual.getMark());
		}
	}
	
	public static boolean isPresent(LinkedList<Student> list,Student target) {
		return list.contains(target);
	}
	
	public static void removeStudent(LinkedList<Student> list,Student target) {
		if(!isPresent(list,target)) {
			System.out.println("Student is not present");
		}else {
			list.remove(target);
		}
	}
	
	public static int numberOfStudents(LinkedList<Student> list) {
		return list.size();
	}
	
	@Override
	public boolean equals(Object o) {
		if(o instanceof Student) {
			Student stud=(Student) o;
			return this.getName().equals(stud.getName()) && this.getAge()==stud.getAge() && this.getMark()==stud.getMark();
		}
		return false;
	}
	
	public static void main(String[] args) {
		
		LinkedList<Student> list=new LinkedList<>();
		list.add(new Student("selmon",19,27));
		list.add(new Student("chooo lo",35,26));
		list.add(new Student("aoge tum kabbhi",37,30));
		list.add(new Student("dekh lena",21,28));
		list.add(new Student("FE!N",23,29));
		displayList(list);
		Student target=new Student("selmon",19,27)	
		
		displayList(list);
		System.out.println(numberOfStudents(list));
		
		System.out.println(list.get(0).equals(target));
		
		
	}
		
}
