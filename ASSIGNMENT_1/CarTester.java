package Q1;

public class CarTester {
    public static void main(String[] args) {
        
        Car myCar1=new Car("4 Wheels", "AUDIII");
        Car myCar2=new Car(null,null);

        System.out.println("Car make: "+myCar1.getMake()+","+"Car model: "+myCar1.getModel());
        System.out.println("Car make: "+myCar2.getMake()+","+"Car model: "+myCar2.getModel());

        myCar2.setMake("8 Wheels");
        myCar2.setModel("lemodghini");


        System.out.println("Car make: "+myCar2.getMake()+","+"Car model: "+myCar2.getModel());
    }
}
