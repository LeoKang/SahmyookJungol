package q601;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String inp = sc.next();
		sc.close();

		StringBuilder sb = new StringBuilder(inp);
		int len = sb.length();
		for (int i = 0; i < len; i++) {
			char c = sb.charAt(len - 1);
			sb.insert(0, c);
			sb.delete(len, len + 1);
			System.out.println(sb);
		}
	}
}
