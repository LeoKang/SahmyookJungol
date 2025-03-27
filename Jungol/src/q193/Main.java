package q193;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean b[] = new boolean[5];
		String[] inp = new String[5];
		for (int i = 0; i < inp.length; i++) {
			inp[i] = sc.next();
		}
		char fc = sc.next().charAt(0);
		String fstr = sc.next();
		sc.close();

//		for (int i = 0; i < inp.length; i++) {
//			System.out.println(inp[i]);
//		}
//		System.out.println(fc);
//		System.out.println(fstr);

		for (int i = 0; i < inp.length; i++) {
			for (int j = 0; j < inp[i].length(); j++) {
				if (inp[i].charAt(j) == fc) {
					b[i] = true;
				}
			}
			if (0 <= inp[i].indexOf(fstr)) {
				b[i] = true;
			}
		}
		int cnt = 0;
		for (int i = 0; i < inp.length; i++) {
			if (b[i] == true) {
				System.out.println(inp[i]);
				cnt++;
			}
		}
		if(cnt == 0) {
			System.out.println("none");
		}
	}
}
