          package com.techzenure.java.arrays;

          import java.util.Scanner;

          public class StudentReportCard {

          public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);

          System.out.print("Enter the student name: ");
          String studentName = scanner.nextLine();

          int numSubjects;
          while (true) {
          try {
          System.out.print("Enter the number of subjects: ");
          numSubjects = Integer.parseInt(scanner.nextLine());
          break;
         } catch (NumberFormatException e) {
         System.out.println("Invalid input. Please enter a valid number.");
         }
         }

         String[] subjectNames = new String[numSubjects];
         int[] grades = new int[numSubjects];

         for (int i = 0; i < numSubjects; i++) {
         System.out.print("Enter the mark for subject " + (i + 1) + ": ");
         while (true) {
         try {
         grades[i] = Integer.parseInt(scanner.nextLine());
         break;
         } catch (NumberFormatException e) {
         System.out.println("Invalid input. Please enter a valid number.");
        }
        }
        }

        // Calculate total marks and average marks
        int totalMarks = 0;
        for (int grade : grades) {
            totalMarks += grade;
        }
        double averageMarks = (double) totalMarks / numSubjects;

        // Print the report card
        System.out.println("\nReport Card");
        System.out.println("--------------------------------------------------");
        System.out.println("Student Name: " + studentName);
        System.out.println("--------------------------------------------------");
        System.out.println("Subject\t\tGrade");
        System.out.println("--------------------------------------------------");
        for (int i = 0; i < numSubjects; i++) {
        System.out.println("Subject " + (i + 1) + "\t\t" + grades[i]);
        }
        System.out.println("--------------------------------------------------");
        System.out.println("Total Marks: " + totalMarks);
        System.out.printf("Average Marks:  %.2f%n", averageMarks);
        System.out.println("--------------------------------------------------");

        scanner.close();
    }
}
