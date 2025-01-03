package q506;

public class Main {
	public static void main(String[] args) {
		int height = 170;
		double weight = 68.6;

		System.out.println("My height");
		printHeight(height);

		System.out.println("My weight");
		printWeight(weight);
	}

	public static void printHeight(int height) {
		System.out.printf("%d\n", height);
	}

	public static void printWeight(double weight) {
		System.out.printf("%.6f\n", weight);
	}
}