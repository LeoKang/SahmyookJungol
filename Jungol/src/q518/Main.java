package q518;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] inp = new int[3];
		for (int i = 0; i < inp.length; i++) {
			inp[i] = sc.nextInt();
		}
		sc.close();

//		for (int i = 0; i < inp.length; i++) {
//			System.out.print(inp[i] + " ");
//		}

		int sum = 0;
		for (int i = 0; i < inp.length; i++) {
			sum += inp[i];
		}

		System.out.println("sum : " + sum);
		System.out.println("avg : " + (sum / inp.length));
	}
}
