package q614;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String schoolName = sc.next();
		int grade = sc.nextInt();
		sc.close();

//		System.out.println(schoolName + " " + grade);
		
		Student st1 = new Student();
		st1.setSchoolName("Jejuelementary");
		st1.setGrade(6);
		Student st2 = new Student();
		st2.setSchoolName(schoolName);
		st2.setGrade(grade);
		
		st1.print();
		st2.print();
	}
}
