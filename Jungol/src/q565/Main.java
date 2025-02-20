package q565;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] cnt = new int[10];

		while (true) {
			int inp = sc.nextInt();
			if (inp == 0)
				break;
			cnt[inp / 10]++;
		}
		sc.close();

		for (int i = 0; i < cnt.length; i++) {
			if (cnt[i] != 0) {
				System.out.println(i + " : " + cnt[i]);
			}
		}
	}
}
