/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package methods;

/**
 *
 * @author msalharbi
 */
public class Emp {
    private String name ;
    private String dept;
    private double sal;
    
    // constructor
    public Emp(){
        this.name = "Ahmed";
        this.dept = "Accounting";
        this.sal = 4530.50;
    }
    
    // constructor 2
    public Emp(String name, String dept, double sal){
        this.name = name;
        this.dept = dept;
        this.sal = sal;
    }
    
    
    public String getDept() {
        return dept;
    }
 
    public void setDept(String dept) {
        this.dept = dept;
    }
    
 
    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
    
 
    public double getSal() {
        return sal;
    }
 
    public void setSal(double sal) {
        this.sal = sal;
    }
    
    public void printInfo(){
        System.out.println("Emp name: "+this.name);
        System.out.println("Emp Dept: "+this.dept);
        System.out.println("Emp Salary: "+this.sal+" SR.");
    }
}
