package q604;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] inp = new String[10];
		for (int i = 0; i < inp.length; i++) {
			inp[i] = sc.next();
		}
		char ch = sc.next().charAt(0);
		sc.close();

		// print
		for (int i = 0; i < inp.length; i++) {
			int len = inp[i].length();
			if (inp[i].charAt(len - 1) == ch) {
				System.out.println(inp[i]);
			}
		}
//		System.out.println(ch);
	}
}
