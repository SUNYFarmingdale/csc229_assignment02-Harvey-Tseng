package com.mycompany.csc229_211review_lab02hw;
import java.util.Scanner;

/**
 *
 * @author MoaathAlrajab
 */
public class DriverClass {
	
	public static void main(String[] args) {
		
                 /*ToDo 5: Fix the error
                casted short to age (default literal is int)
                Preventing demotion error from int -> short
                 */
		Student std1= new Student("James", (short)20);
		
		// ToDo 8: Set the gpa of the student using the scanner and user input and then print the output.
                Scanner scnr = new Scanner(System.in);
                System.out.println("What is the student's GPA?");
                std1.setGPA(scnr.nextDouble());
                
		
		System.out.println(std1);
		
		// ToDo 9: add comments and explain your code
		
		// ToDo 10: submit using a pull request.
	}

}