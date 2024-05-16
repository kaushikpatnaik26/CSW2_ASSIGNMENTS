package Q6;

public class Animal {
	String name,color,type;
	
	Animal(String name,String color,String type){
		this.name=name;
		this.color=color;
		this.type=type;
	}
	
	@Override
	public int hashCode() {
        int prime = 31;
        int result = 1;
        result = prime * result + ((color == null) ? 0 : color.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((type == null) ? 0 : type.hashCode());
        return result;
    }	
	
	public static void main(String[] args) {
		
		Animal a1=new Animal("panther","rgb(0,0,0)","wild");
		Animal a2=new Animal("rabbit","white","pet");
		Animal a3=new Animal("Dog","golden retriever","pet");
		Animal a4=new Animal("my sister","brown","wild");
		
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		System.out.println(c.hashCode());
		System.out.println(d.hashCode());
		System.out.println(new Animal("rabbit","white","wild").hashCode());
	}
}
