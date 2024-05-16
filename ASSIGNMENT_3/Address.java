package Q07;
import java.util.TreeMap;
import java.util.Iterator;
import java.util.Map;

public class Address {
	String at,post;
	int plotNo;
	
	public Address(String at,String post,int plotNo) {
		this.at=at;
		this.post=post;
		this.plotNo=plotNo;
	}
	
	@Override
	public String toString() {
		return "Address: "+this.at+" "+this.plotNo+" "+this.post;
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		
		Address add1=new Address("A","B",23);
		Address add2=new Address("C","D",28);
		Address add3=new Address("E","F",13);
		Address add4=new Address("G","H",37);
		Address add5=new Address("I","J",77);
		
		TreeMap<String,Address> list=new TreeMap<>();
		list.put("messi", add5);
		list.put("rolando bhai", add1);
		list.put("dybala", add2);
		list.put("van dijk", add3);
		list.put("mac allister", add4);
		
		
		Iterator iterate = list.entrySet().iterator();
		while(iterate .hasNext()) {
			Map.Entry<String,Address> ment= (Map.Entry)iterate.next();
			System.out.println(ment.getKey()+"--> "+ment.getValue().at+" "+ment.getValue().plotNo+" "+ment.getValue().post);
		}
		
	}
}
