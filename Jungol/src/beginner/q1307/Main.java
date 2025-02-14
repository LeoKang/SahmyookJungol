package beginner.q1307;

import java.util.Scanner;

/*
 * 3 3
 * 2 3
 * 1 3
 * 0 3
 * 3 2
 * 2 2
 * 1 2
 * 0 2
 * ...
 */

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();

//		System.out.println(n);

		char[][] ar = new char[n][n];
		char c = 'A';
		for (int i = n - 1; i >= 0; i--) {
			for (int j = n - 1; j >= 0; j--) {
				if (c > 'Z') {
					c = 'A';
				}
				ar[j][i] = c++;
			}
		}

		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				System.out.print(ar[i][j] + " ");
			}
			System.out.println();
		}
	}
}
