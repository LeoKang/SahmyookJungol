package q558;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int[] inp = new int[100];
		Scanner sc = new Scanner(System.in);
		int idx = 0;
		for (;;) {
			inp[idx] = sc.nextInt();
			if (inp[idx++] == 0) {
				sc.close();
				break;
			}
		}

		for (int i = idx - 2; i >= 0; i--) {
			System.out.print(inp[i] + " ");
		}
	}
}
