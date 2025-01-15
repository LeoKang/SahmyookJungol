package q616;

import java.util.Scanner;

class Point {
	private int x;
	private int y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}
}

class Triangle {
	private Point[] p;

	public Triangle(int[] param) {
		p = new Point[3];
		for (int i = 0, j = 0; i < 6; i += 2, j++) {
			p[j] = new Point(param[i], param[i + 1]);
		}
	}

	public void print() {
		for (int i = 0; i < 3; i++) {
			System.out.printf(p[i].getX() + " " + p[i].getY() + " ");
		}
	}

	public void getCentroid() {
		// TODO Auto-generated method stub
		int sumx = 0, sumy = 0;
		for (int i = 0; i < 3; i++) {
			sumx += p[i].getX();
			sumy += p[i].getY();
		}
//		System.out.println("(" + (sumx / 3) + ", " + (sumy / 3) + ")");
		System.out.printf("(%.1f. %.1f)\n", ((double)sumx / 3), ((double)sumy / 3));
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] inp = new int[6];

		for (int i = 0; i < 6; i++) {
			inp[i] = sc.nextInt();
		}
		sc.close();

		Triangle tri = new Triangle(inp);
//		tri.print();
		tri.getCentroid();
	}
}
