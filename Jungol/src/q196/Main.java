package q196;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Person[] inp = new Person[3];
		for (int i = 0; i < inp.length; i++) {
			String name = sc.next();
			String tel = sc.next();
			String adrs = sc.next();
			inp[i] = new Person(name, tel, adrs);
		}
		sc.close();

//		for (int i = 0; i < inp.length; i++) {
//			inp[i].print();
//		}

		Person min = inp[0];
		for (int i = 1; i < inp.length; i++) {
			int ret = min.getName().compareTo(inp[i].getName());
			// System.out.println(ret);

			if (ret > 0) {
				min = inp[i];
			}
		}
		min.print();
	}
}

class Person {
	private String name;
	private String tel;
	private String adrs;

	public Person(String name, String tel, String adrs) {
		this.name = name;
		this.tel = tel;
		this.adrs = adrs;
	}

	public String getName() {
		return name;
	}

	public void print() {
		System.out.println("name : " + name);
		System.out.println("tel : " + tel);
		System.out.println("addr : " + adrs);
	}
}