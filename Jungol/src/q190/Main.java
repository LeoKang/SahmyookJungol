package q190;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		String[] str = { "flower", "rose", "lily", "daffodil", "azalea" };
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		sc.close();

//		System.out.println(ch);

		int cnt = 0;
		int[] idx = new int[str.length];
		for (int i = 0; i < str.length; i++) {
			String s = str[i];
			if (s.charAt(1) == ch || s.charAt(2) == ch) {
				cnt++;
				idx[i] = 1;
			}
		}

		for (int i = 0; i < str.length; i++) {
			if (idx[i] == 1) {
				System.out.println(str[i]);
			}
		}
		System.out.println(cnt);
	}
}
