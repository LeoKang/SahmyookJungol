package q569;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] inp = new int[5][4];
		for (int i = 0; i < inp.length; i++) {
			for (int j = 0; j < inp[i].length; j++) {
				inp[i][j] = sc.nextInt();
			}
		}
		sc.close();

		int success = 0;
		for (int i = 0; i < inp.length; i++) {
			int sum = 0;
			for (int j = 0; j < inp[i].length; j++) {
//				System.out.print(inp[i][j] + " ");
				sum += inp[i][j];
			}
//			System.out.print(sum / inp[i].length);
			if ((sum / inp[i].length) >= 80) {
				System.out.print("pass");
				success++;
			} else {
				System.out.print("fail");
			}
			System.out.println();
		}
		System.out.println("Successful : " + success);
	}
}
