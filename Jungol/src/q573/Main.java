package q573;

import java.util.Scanner;

public class Main {
	public static void print(int p) {
		int r = 1;

		for (int i = 0; i < p; i++) {
			for (int j = 0; j < p; j++) {
				System.out.print(r++ + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();

		print(n);
	}
}
