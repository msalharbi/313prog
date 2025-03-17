
package methods;


public class Main {

    public static void main(String[] args) {
        Shape dd = new Shape();
        
        System.out.println(dd.getName()+" "+dd.getColor());
        
        Shape xx = new Shape("Square", "Yellow");
        System.out.println(xx.getName()+" "+xx.getColor());
        
        xx.setName("Rectangle");
        xx.setColor("Red");
        System.out.println(xx.getName()+" "+xx.getColor());
        
        
        Emp a = new Emp("Saleh", "Sales", 7000);
        a.printInfo();
    }
}
