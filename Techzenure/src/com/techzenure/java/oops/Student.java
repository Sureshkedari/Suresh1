package com.techzenure.java.oops;

import java.util.Scanner;

public class Student {

	public static void main(String[] args)	
		    private int studentId;
		    private String studentName;
		    private String studentAddress;
		    private String collegeName;

		    // 3-argument constructor for NIT students
		    public Student(int studentId, String studentName, String studentAddress) {
		        this.studentId = studentId;
		        this.studentName = studentName;
		        this.studentAddress = studentAddress;
		        this.collegeName = "NIT";
		    }

		    // 4-argument constructor for other college students
		    public Student(int studentId, String studentName, String studentAddress, String collegeName) {
		        this.studentId = studentId;
		        this.studentName = studentName;
		        this.studentAddress = studentAddress;
		        this.collegeName = collegeName;
		    }

		    // Getter methods
		    public int getStudentId() {
		        return studentId;
		    }

		    public String getStudentName() {
		        return studentName;
		    }

		    public String getStudentAddress() {
		        return studentAddress;
		    }

		    public String getCollegeName() {
		        return collegeName;
		    
		}

		class StudentMain {
		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);

		        // Get Student details
		        System.out.print("Enter Student's Id: ");
		        int studentId = scanner.nextInt();
		        scanner.nextLine();

		        System.out.print("Enter Student's Name: ");
		        String studentName = scanner.nextLine();

		        System.out.print("Enter Student's address: ");
		        String studentAddress = scanner.nextLine();

		        // Get college information
		        String collegeInput;
		        String collegeName;

		        do {
		            System.out.print("Whether the student is from NIT(Yes/No): ");
		            collegeInput = scanner.nextLine();
		            collegeName = collegeInput.equalsIgnoreCase("yes") ? "NIT" : collegeInput.equalsIgnoreCase("no") ? "other" : null;

		            if (collegeName == null) {
		                System.out.println("Wrong Input");
		            }
		        } while (collegeName == null);

		        // Create the appropriate Student object
		        if (collegeName.equals("NIT")) {
		            Student student = new Student(studentId, studentName, studentAddress);
		            System.out.println("Student id: " + student.getStudentId());
		            System.out.println("Student name: " + student.getStudentName());
		            System.out.println("Address: " + student.getStudentAddress());
		            System.out.println("College Name: " + student.getCollegeName());
		        } else {
		            System.out.print("Enter the college name: ");
		            String otherCollegeName = scanner.nextLine();
		            Student student = new Student(studentId, studentName, studentAddress, otherCollegeName);
		            System.out.println("Student id: " + student.getStudentId());
		            System.out.println("Student name: " + student.getStudentName());
		            System.out.println("Address: " + student.getStudentAddress());
		            System.out.println("College Name: " + student.getCollegeName());
		        }
		        scanner.close();
		    }
		
		}
	}


