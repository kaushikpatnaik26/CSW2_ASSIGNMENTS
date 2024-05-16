package Q1;
public class Student<T> {
	String name;
	int age;
	T rollNo;
	
	public Student(String name,T rollNo,int age) {
		this.name=name;
		this.rollNo=rollNo;
		this.age=age;
	}
	
	public String toString() {
		return "Name: "+name+", Roll No: "+rollNo+", Age: "+age;
	}
}
