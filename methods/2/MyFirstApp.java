
package myfirstapp;

public class MyFirstApp {

    public static void main(String[] args) {

        Shape s = new Shape();
        s.setName("circle");
        s.setColor("yellow");
        System.out.println(s.getName() +" "+ s.getColor());
        
        Shape m = new Shape();
        m.setName("Square");
        m.setColor("blue");
        
        System.out.println(m.getName() +" "+ m.getColor());
        
    }
}
