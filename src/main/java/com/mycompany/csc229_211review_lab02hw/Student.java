package com.mycompany.csc229_211review_lab02hw;

/**
 *
 * @author MoaathAlrajab
 */
// ToDo 1: Make this class a child of Person
public class Student extends Person {
    
    private double GPA;
    
    // ToDo 6: Fix the constructor of Student class
    //Default constructor
    public Student(String name, short age){
        super(name, age);
        GPA = 0;
    }
    // ToDo 2: Fix the resulting errors
    //Override abstract method
    @Override
    public String getAddress() {
        return address;
    }
    //Override abstract method
    @Override
    public void setAddress(String address) {
        this.address = address;
    }
    
    // ToDo 3: Add a field for GPA and create setter and getter
    //returns GPA
    public double getGPA(){
        return GPA;
    }
    
    //changes GPA
    public void setGPA(double gpa){
        GPA = gpa;
    }
    
    // ToDo 7: Add a toString method for Student class
    //Print the student's name, age, and GPA
    @Override
    public String toString(){
        String str = String.format("%s\nAge: %d\nGPA = %.1f", super.getName(), super.getAge(), GPA);
        return str;
    }
	
	// ToDo 4: Add comments to your code

}