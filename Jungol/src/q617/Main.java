package q617;

import java.util.Arrays;
import java.util.Scanner;

class Person implements Comparable<Person>{
	private String name;
	private int height;

	public Person(String name, int height) {
		this.name = name;
		this.height = height;
	}

	public int getHight() {
		return height;
	}

	public void print() {
		System.out.println(name + " " + height);
	}

	@Override
	public int compareTo(Person o) {
		// TODO Auto-generated method stub
		if(this.height < o.height) {
			return -1;
		}else 
			return 1;
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Person[] p = new Person[5];
		for (int i = 0; i < p.length; i++) {
			String name = sc.next();
			int height = sc.nextInt();
			p[i] = new Person(name, height);
		}
		sc.close();

//		for (int i = 0; i < p.length; i++) {
//			p[i].print();
//		}

		// 2.----------------------------
		Arrays.sort(p);
//		System.out.println("----------------------");
//		for (int i = 0; i < p.length; i++) {
//			p[i].print();
//		}
		p[0].print();
		
		// 1.----------------------------
//		Person min = p[0];
//		for (int i = 1; i < p.length; i++) {
//			if(min.getHight() > p[i].getHight()) {
//				min = p[i];
//			}
//		}
//		min.print();
	}
}
