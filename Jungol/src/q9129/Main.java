package q9129;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double d1 = sc.nextDouble();
		double d2 = sc.nextDouble();
		double d3 = sc.nextDouble();
		sc.close();

		String str1 = String.format("%.2f", d1);
		String str2 = String.format("%.2f", d2);
		String str3 = String.format("%.2f", d3);

//		System.out.println(str1);
//		System.out.println(str2);
//		System.out.println(str3);

		String str = str1 + str2 + str3;
//		System.out.println(str);
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '.')
				System.out.println();
			else
				System.out.print(str.charAt(i));
		}
	}
}
