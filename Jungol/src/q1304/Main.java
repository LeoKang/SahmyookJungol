package q1304;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();

		for (int row = 1; row <= n; row++) {
			for (int col = 0, prt = row; col < n; col++, prt += n) {
				System.out.print(prt + " ");
			}
			System.out.println();
		}
	}
}
