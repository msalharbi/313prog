
package methods;


class Car{
    
    static int carNo = 0;
    
    // properties 
    String color = "blue";
    int clynders = 6;
    String model = "Van";
    String make = "Toyota";
    boolean isUsed = false;
    
    
    // methods
    public void info(){
        System.out.println("Make: "+make);
        System.out.println("Color: "+color);
        System.out.println("Clynders: "+clynders);
        System.out.println("Model: "+model);
        System.out.println("Is used: "+isUsed);
    }
    
    public void horn(){
        System.out.println("Taaaat");
    }
    
    static void addCarCreated(){
        carNo++;
    }
}

public class Main {

    public static void main(String[] args) {
        Car newcar = new Car();
        Car.addCarCreated();
        Car anotherCar = new Car();
        Car.addCarCreated();
        System.out.println(Car.carNo);
    }
}
