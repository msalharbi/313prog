/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package methods;

/**
 *
 * @author msalharbi
 */
public class Shape {
    
    private String name;
    private String color;
    
    private double borderWidth;


    // Constructors
    public Shape(){
        this.name = "Circle";
        this.color = "Blue";
    }
    
    public Shape(String name, String color){
        this.name = name;
        this.color = color;
    }
    
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
    
    public double getBorderWidth() {
        return borderWidth;
    }

    public void setBorderWidth(double borderWidth) {
        this.borderWidth = borderWidth;
    }
    
}
