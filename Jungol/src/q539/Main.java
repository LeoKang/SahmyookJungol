package q539;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int inp;
		int cnt = 0, sum = 0;
		do {
			inp = sc.nextInt();
			cnt++;
			sum += inp;
		} while (inp < 100);
		sc.close();
		System.out.println(sum);
		System.out.printf("%.1f\n", (double) sum / cnt);
	}
}
