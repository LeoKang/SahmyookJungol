package q519;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		sc.close();

		System.out.println(num1 + " " + num2);

		num1 = num1 + 100;
		num2 = num2 % 10; // num2 %= 10;

		System.out.println(num1 + " " + num2);
	}
}
