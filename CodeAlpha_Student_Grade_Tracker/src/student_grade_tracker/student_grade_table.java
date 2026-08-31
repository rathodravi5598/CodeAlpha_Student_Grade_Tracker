package student_grade_tracker;

import java.util.ArrayList;
import java.util.Scanner;

class student {
	String name;
	double grade;

	public student(String name, double grade) {
		this.name = name;
		this.grade = grade;
	}
}

public class student_grade_table {
	
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		ArrayList<student> studentList = new ArrayList<>();
		
		System.out.println("----------------------------");
		System.out.println("   Student Grade Tracker    ");
		System.out.println("----------------------------");
		System.out.println("Enter Total Numbers Of a Student Of Numbers: ");
		int totalStudents = scanner.nextInt();
		scanner.nextLine();
		
		for(int i = 0; i < totalStudents; i++) {
			System.out.println("\n--- ENTER STUDENT DETAILS #" + (i + 1) +"---");
			System.out.println("\n Enter Name");
			String name = scanner.next();
			scanner.nextLine();
			
			System.out.println("\n Enter Grade (0 / 100):");
			double grade = scanner.nextDouble();
			scanner.nextLine();
			
				studentList.add(new student( name , grade));
			}
		if(!studentList.isEmpty()) {
			double totalSum = 0;
			double highestGrade = studentList.get(0).grade;
			double lowestGrade = studentList.get(0).grade;
			String topStudent = studentList.get(0).name;
			String lowStudent = studentList.get(0).name;
			for (student s : studentList) {
                totalSum += s.grade;

                if (s.grade > highestGrade) {
                    highestGrade = s.grade;
                    topStudent = s.name;
                }

                if (s.grade < lowestGrade) {
                    lowestGrade = s.grade;
                    lowStudent = s.name;
                }
            }

            double averageGrade = totalSum / studentList.size();

            System.out.println("\n-----------------------------------");
            System.out.println("       STUDENT SUMMARY REPORT     ");
            System.out.println("-------------------------------------");
            System.out.printf("%-15s %-10s\n", "Name", "Grade");
            System.out.println("----------------------------------");
            for (student s : studentList) {
                System.out.printf("%-15s %-10.2f\n", s.name, s.grade);
            }
            System.out.println("----------------------------------");
            System.out.printf("Average Score : %.2f\n", averageGrade);
            System.out.printf("Highest Score : %.2f (Student: %s)\n", highestGrade, topStudent);
            System.out.printf("Lowest Score  : %.2f (Student: %s)\n", lowestGrade, lowStudent);
            System.out.println("==================================");
        }

        scanner.close();
    }
}
			
			
			
			
			
	