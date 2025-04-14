package myfirstapp;

public class MyFirstApp {

    public static void main(String[] args) {
        
        Student s1 = new Student();
        s1.displayInfo();
        
        Student s2 = new Student("Ali Alali", 30, "Technical Support");
        s2.displayInfo();
        
        System.out.println("----------------");
        GraduateStudent g1 = new GraduateStudent("Sultan Alshammari", 23, "CS", "1/12/1446", "Pentration Test Page");
        g1.displayInfo();
    }
}