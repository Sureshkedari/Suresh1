
package com.techzenure.java.arrays;

import java.util.Scanner;

                public class StudentMarks {
		        public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Enter the number of students: ");
		        int numStudents = scanner.nextInt();

		        Student[] students = new Student[numStudents];

		        for (int i = 0; i < numStudents; i++) {
		            System.out.print("Enter the student's name: ");
		            String name = scanner.next();
		            System.out.print("Enter the number of subjects: ");
		            int numSubjects = scanner.nextInt();

		            double[] marks = new double[numSubjects];
		            for (int j = 0; j < numSubjects; j++) {
		                System.out.print("Enter the mark for subject " + (j + 1) + ": ");
		                marks[j] = scanner.nextDouble();
		            }

		            students[i] = new Student(name, marks);
		        }

		        System.out.println("\nStudent Data:");
		        for (Student student : students) {
		            System.out.println("Name: " + student.getName() + ", Marks: " + student.getMarksString());
		        }
		    }
		}

		class Student {
		    private String name;
		    private double[] marks;

		    public Student(String name, double[] marks) {
		        this.name = name;
		        this.marks = marks;
		    }

		    public String getName() {
		        return name;
		    }

		    public double[] getMarks() {
		        return marks;
		    }

		    public String getMarksString() {
		        StringBuilder sb = new StringBuilder();
		        for (double mark : marks) {
		            sb.append(mark).append(", ");
		        }
		        sb.setLength(sb.length() - 2); // Remove the last ", "
		        return sb.toString();
		    }	


	}


