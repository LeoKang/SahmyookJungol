package q593;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int inp = 0;
		do {
			System.out.print("ASCII code =? ");
			inp = sc.nextInt();
			
			if(33 <= inp && inp <= 127) {
//				System.out.println(inp);
//				System.out.println((char)inp);
				System.out.printf("%c\n", inp);
			}else {
				break;
			}

		}while(true);
		sc.close();
	}
}
