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
public class GraduateStudent extends Student{
    private String gradDate;
    private String gradProjectTitle;
    
    public GraduateStudent(String name, int age, String major, String gradDate, String gradProjectTitle){
        setName(name);
        setAge(age);
        setMajor(major);
        this.gradDate = gradDate;
        this.gradProjectTitle = gradProjectTitle;
    }

    public String getGradDate() {
        return gradDate;
    }

    public void setGradDate(String gradDate) {
        this.gradDate = gradDate;
    }

    public String getGradProjectTitle() {
        return gradProjectTitle;
    }

    public void setGradProjectTitle(String gradProjectTitle) {
        this.gradProjectTitle = gradProjectTitle;
    }
    
    @Override
    public void displayInfo(){
        System.out.println("Name: "+getName());
        System.out.println("Age: "+getAge());
        System.out.println("Major: "+getMajor());
        System.out.println("Grad Date: "+this.getGradDate());
        System.out.println("Project Title: "+this.getGradProjectTitle());
    }
}
