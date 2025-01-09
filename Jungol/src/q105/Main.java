package q105;

import java.text.DecimalFormat;

public class Main {
	public static void main(String[] args) {
		info[] arr = new info[5];
		arr[0] = new info("Seoul", 10312545, "+91,375");
		arr[1] = new info("Pusan", 3567910, "+5,868");
		arr[2] = new info("Incheon", 2758296, "+64,888");
		arr[3] = new info("Daegu", 2511676, "+17,230");
		arr[4] = new info("Gwangju", 1454636, "+29,774");
		DecimalFormat decFormat = new DecimalFormat("###,###");
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("%15s", arr[i].city);
			System.out.printf("%15s", decFormat.format(arr[i].people));
			System.out.printf("%15s", arr[i].updown);
			System.out.println();
		}
	}

	public static class info {
		String city;
		int people;
		String updown;

		info(String city, int people, String updown) {
			this.city = city;
			this.people = people;
			this.updown = updown;
		}
	}
}