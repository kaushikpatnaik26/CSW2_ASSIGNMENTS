package Q3;

public class Driver {
	public static void main(String[] args) {
		
		Car car1=new Car("ferrari","red",20000);
		Car car2=new Car("buggati","andrew tate",1500000);
		
		if(car1.compareTo(car2)==1) {
			System.out.println(car1);
		}else if(car1.compareTo(car2)==-1) {
			System.out.println(car2);
		}else {
			System.out.println("Both the cars have the same speed.");
		}
	}
}
