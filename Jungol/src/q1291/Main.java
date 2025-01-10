package q1291;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s, e;
		do {
			s = sc.nextInt();
			e = sc.nextInt();

//			System.out.println(s + " " + e);

			if ((2 > s || s > 9) || (2 > e || e > 9)) {
				System.out.println("INPUT ERROR!");
			} else {
				if (s > e) {
					for (int i = 1; i <= 9; i++) {
						for (int j = s; j >= e; j--) {
							System.out.print(j + " * " + i + " = ");
							System.out.printf("%2d   ", j * i);
						}
						System.out.println();
					}
				} else {
					for (int i = 1; i <= 9; i++) {
						for (int j = s; j <= e; j++) {
							System.out.print(j + " * " + i + " = ");
							System.out.printf("%2d   ", j * i);
						}
						System.out.println();
					}
				}
			}
		} while ((2 > s || s > 9) || (2 > e || e > 9));
		sc.close();
	}
}
