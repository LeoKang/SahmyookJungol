package beginner.q1169;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static int N, M;
	public static int[] ar, ar2;
	public static final int MAX_DICE = 6;
	public static Set<String> set = new HashSet<>();

	public static void r1(int p) {
		if (p == N) {
			for (int i = 0; i < ar.length; i++) {
				System.out.print((ar[i] + 1) + " ");
			}
			System.out.println();
			return;
		}

		for (int i = 0; i < MAX_DICE; i++) {
			ar[p] = i;
			r1(p + 1);
		}
	}

	public static void r2(int p) { // 중복 제거
		if (p == N) {
			ar2 = Arrays.copyOf(ar, ar.length);
			Arrays.sort(ar2);
			String str = Arrays.toString(ar2);

			if (set.contains(str)) {
				
			} else {
				set.add(str);
				for (int i = 0; i < ar.length; i++) {
					System.out.print((ar[i] + 1) + " ");
				}
				System.out.println();
			}
			return;
		}

		for (int i = 0; i < MAX_DICE; i++) {
			ar[p] = i;
			r2(p + 1);
		}
	}

	public static void r3(int p) {
		if (p == N) {
			// 중복 체크
			ar2 = Arrays.copyOf(ar, ar.length);
			Arrays.sort(ar2);
			boolean eq = false;

			for (int i = 0; i < ar2.length - 1; i++) {
				if (ar2[i] == ar2[i + 1]) {
					eq = true;
					return;
				}
			}

			if (eq == false) {
				for (int i = 0; i < ar.length; i++) {
					System.out.print((ar[i] + 1) + " ");
				}
				System.out.println();
			}
			return;
		}

		for (int i = 0; i < MAX_DICE; i++) {
			ar[p] = i;
			r3(p + 1);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		sc.close();

		//System.out.println(N + " " + M);
		ar = new int[N];
		ar2 = new int[N];

		switch (M) {
		case 1:
			r1(0);
			break;
		case 2:
			r2(0);
			break;
		case 3:
			r3(0);
			break;
		}
	}
}
