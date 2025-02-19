package q618;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Person[] person = new Person[5];

		for (int i = 0; i < person.length; i++) {
			String name = sc.next();
			int height = sc.nextInt();
			double weight = sc.nextDouble();

			person[i] = new Person(name, height, weight);
		}
		sc.close();

		for (int i = 0; i < person.length; i++) {
			person[i].print();
		}

		System.out.println("name");
		Arrays.sort(person, new Comparator<Person>() {
			@Override
			public int compare(Person o1, Person o2) {
				// TODO Auto-generated method stub
				return o1.getName().compareTo(o2.getName());
			}
		});
		for (int i = 0; i < person.length; i++) {
			person[i].print();
		}

		System.out.println("weight");
		Arrays.sort(person, new Comparator<Person>() {
			@Override
			public int compare(Person o1, Person o2) {
				// TODO Auto-generated method stub
				return (int) (o2.getWeight() - o1.getWeight());
			}
		});
		for (int i = 0; i < person.length; i++) {
			person[i].print();
		}
	}
}

class Person {
	private String name;
	private int height;
	private double weight;

	public Person(String name, int height, double weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
	}

	public double getWeight() {
		return weight;
	}

	public String getName() {
		return name;
	}

	public void print() {
		System.out.println(name + " " + height + " " + weight);
	}
}