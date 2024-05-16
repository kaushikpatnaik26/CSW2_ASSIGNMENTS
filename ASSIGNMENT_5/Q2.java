package GarbageCollection;
class ReassigningReference{
	String name;
	
	ReassigningReference(String name){
		this.name=name;
	}
	
	@Override
	public void finalize() throws Throwable {
		System.out.println(name + " successfully garbage collected.");
	}
}
public class Q2 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ReassigningReference o1 = new ReassigningReference("Obj-1");
		ReassigningReference o2 = new ReassigningReference("Obj-2");
		
		o2=o1;

		System.gc();
	}

}
