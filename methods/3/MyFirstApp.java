
package myfirstapp;

public class Shape {
    // properties
    String name;
    String color;
    
    //constructor #1
    public Shape(){
        this.name = "Rectangle";
        this.color = "Red";
    }
    //constructor #2
    public Shape(String name, String color){
        this.name = name;
        this.color = color;
    }
    
   // methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
 
}

