package Q8;

public class Car implements Vehicle{

	@Override
	public void accelerate() {
		System.out.println("The Car is accelerating.");
	}
	
	public void accelerate(String model) {
		System.out.println(model+"The car is accelerating.");
	}
	
	@Override
	public void brake() {
		System.out.println("The Car has been slowed.");
	}
}
