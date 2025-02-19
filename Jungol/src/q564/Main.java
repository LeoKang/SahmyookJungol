package q564;

import java.util.Scanner;
//Q H S K N M E V Y P P V X Z U M S I P N U E Z L Q N M W a
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] cnt = new int[26];
		char inp;
		do {
			inp = sc.next().charAt(0);
			// System.out.print(inp + " ");

			if(Character.isUpperCase(inp)) {
				int n = Character.getNumericValue(inp); // 10 -> A
				// System.out.println(n);

				if (n > 0)
					cnt[n - 10]++;	
			}
		} while (Character.isUpperCase(inp));
		sc.close();

		char c = 'A';
		for (int i = 0; i < cnt.length; i++) {
			if (cnt[i] != 0) {
				System.out.printf("%c : ", (c + i));
				System.out.println(cnt[i]);
			}
		}
	}
}
