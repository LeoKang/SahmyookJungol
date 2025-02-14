package q560;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] inp = new int[10];
		for (int i = 0; i < inp.length; i++) {
			inp[i] = sc.nextInt();
		}
		sc.close();
/*
		for (int i = 0; i < inp.length; i++) {
			System.out.print(inp[i] + " ");
		}
*/
		// 2case.
		Arrays.sort(inp);
		System.out.println(inp[0]);
		
		// 1case.
		/*
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < inp.length; i++) {
			if (min > inp[i]) {
				min = inp[i];
			}
		}
		System.out.println(min);
		*/
	}
}
