package com.example;

import java.util.Scanner;

public class StudentGradeEvaluation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter their name
        System.out.print("Enter your name: ");
        String name =sc.nextLine();

        // Prompt the user to enter their age
        System.out.println("Enter your age: ");
        int age = sc.nextInt();

        // Prompt the user to enter their exam score
        System.out.println("Enter your score: ");
        double score=sc.nextDouble();

        // Determine the grade
        String grade;
        

        // Print the student's details
        if (score >= 90) {
            grade = "A";
        } else if (score >= 80) {
            grade = "B";
        } else if (score >= 70) {
            grade = "C";
        } else if (score >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Score: "+score);
        System.out.println("Grade: "+grade);
       
    }
}
