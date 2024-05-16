package Q03;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CarApp {
	public static void main(String[] args) {
		ArrayList<Car> list=new ArrayList<>();
		list.add(new Car("lambo",240,100));
		list.add(new Car("Audi",125,50));
		list.add(new Car("lotus",1225,77));
		list.add(new Car("mclauren",568,28));
		list.add(new Car("ntorq",111,10));
		
		Collections.sort(list,Comparator.comparingInt(Car::getStock));
		
		for(Car car:list) {
			System.out.println(car);
		}
	}
}
