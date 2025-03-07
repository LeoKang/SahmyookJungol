package q563;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] inp = new int[10];
		for (int i = 0; i < inp.length; i++) {
			inp[i] = sc.nextInt();
		}
		sc.close();

//		for (int i = 0; i < inp.length; i++) {
//			System.out.print(inp[i] + " ");
//		}

		for (int i = 0; i < inp.length; i++) {
			int max = -1;
			int idx = -1;
			for (int j = 0; j < inp.length; j++) {
				if (max < inp[j]) {
					max = inp[j];
					idx = j;
				}
			}
			System.out.print(max + " ");
			inp[idx] = -1;
		}
	}
}
