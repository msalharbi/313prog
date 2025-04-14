/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myfirstapp;

/**
 *
 * @author msalharbi
 */
public class Student {
    // properties (variables)
    private String name;
    private int age;
    private String major;
    
    public Student(){
        this.name = "Ahmed Alahmed";
        this.age = 22;
        this.major = "Programming";
    }
    
    public Student(String name, int age, String major){
        this.name = name;
        this.age = age;
        this.major = major;
    }
    
    // get and set for name
    public String getName(){
        return this.name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
    
    // display method ..
    public void displayInfo(){
        System.out.println("Name: "+this.getName());
        System.out.println("Age: "+this.getAge());
        System.out.println("Major: "+this.getMajor());
    }
}
