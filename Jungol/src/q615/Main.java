package q615;

import java.util.Scanner;

class Student {
	private String name;
	private int kor;
	private int eng;

	public Student(String name, int kor, int eng) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
	}

	public void print() {
		System.out.println(name + " " + kor + " " + eng);
	}

	public int getKor() {
		return kor;
	}

	public int getEng() {
		return eng;
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int N = sc.nextInt();
		int N = 2;
		Student[] stu = new Student[N];
		for (int i = 0; i < stu.length; i++) {
			String name = sc.next();
			int kor = sc.nextInt();
			int eng = sc.nextInt();

			stu[i] = new Student(name, kor, eng);
		}
		sc.close();

		for (int i = 0; i < stu.length; i++) {
			stu[i].print();
		}

		int avgKor = 0, avgEng = 0;
		for (int i = 0; i < stu.length; i++) {
			avgKor += stu[i].getKor();
			avgEng += stu[i].getEng();
		}
		avgKor /= stu.length;
		avgEng /= stu.length;

		System.out.println("avg " + avgKor + " " + avgEng);
	}
}
