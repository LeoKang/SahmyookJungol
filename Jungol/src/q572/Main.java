package q572;

import java.util.Scanner;

public class Main {
	public double getArea(int p) {
		double ret = p * p * 3.14;
		return ret;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		sc.close();

//		System.out.println(r);

		Main m = new Main();
		double ret = m.getArea(r);
		System.out.printf("%.2f\n", ret);
	}
}
