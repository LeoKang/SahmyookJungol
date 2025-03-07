package beginner.q1314;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();

		int[][] ar = new int[n][n];

		int c = 65; // 'A'

		for (int i = 0; i < ar.length; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < ar[i].length; j++) {
					ar[i][j] = c++;
					if (c == 91) {
						c = 65;
					}
				}
			} else {
				for (int j = ar[i].length - 1; j >= 0; j--) {
					ar[i][j] = c++;
					if (c == 91) {
						c = 65;
					}
				}
			}
		}

		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				System.out.printf("%c ", ar[j][i]);
			}
			System.out.println();
		}
	}
}
