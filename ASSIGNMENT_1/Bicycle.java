package Q8;

public class Bicycle implements Vehicle{

	@Override
	public void accelerate() {
		System.out.println("The Bicycle is speeding up.");
	}
	
	public void accelerate(String model) {
		System.out.println(model +"The cycle is accelerating.");
	}
	
	@Override
	public void brake() {
		System.out.println("The Bicycle is now applying brakes.");
	}
	
}
