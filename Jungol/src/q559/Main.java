package q559;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inp1 = sc.nextInt();
		int inp2 = sc.nextInt();
		sc.close();

		//System.out.println(inp1 + " " + inp2);

		double[] ar = { 85.6, 79.5, 83.1, 80.0, 78.2, 75.0 };
		System.out.println(ar[inp1 - 1] + ar[inp2 - 1]);
	}
}
