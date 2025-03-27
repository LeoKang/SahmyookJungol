package beginner.q1430;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		sc.close();
		int res = A * B * C;
		System.out.println(res);
		String str = Integer.toString(res);

		int[] cnt = new int[10];

		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);

			cnt[c - '0']++;
		}

		for (int i = 0; i < cnt.length; i++) {
			System.out.println(cnt[i]);
		}
	}
}
