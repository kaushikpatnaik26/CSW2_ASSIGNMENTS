package GarbageCollection;
class NullifiedReference{
	String name;
	
	NullifiedReference(String name){
		this.name=name;
	}
	
	@Override
	public void finalize() throws Throwable {
		System.out.println(name+" garbage collected successfully.");
	}
}

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NullifiedReference o1 = new NullifiedReference("Obj1");
		o1 = null;
		
		System.gc();	
	}
}
