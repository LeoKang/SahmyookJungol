package baseball;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] rnd = new int[3];
		int[] inp = new int[3];
		boolean b;

		// 1. 3개의 난수 생성(범위 : 1 ~ 9)
		do {
			for (int i = 0; i < rnd.length; i++) {
				rnd[i] = (int) (Math.random() * 9) + 1;
			}

//			System.out.print("Random number : ");
//			for (int i = 0; i < rnd.length; i++) {
//				System.out.print(rnd[i] + " ");
//			}
//			System.out.println();

			// 2. 2. 중복된 난수 제거 후, 다시 생성
			b = false;
			for (int i = 0; i < rnd.length; i++) {
				for (int j = 0; j < rnd.length; j++) {
					if (rnd[i] == rnd[j] && i != j) {
						b = true;
					}
				}
			}
		} while (b);

		boolean conti = true;
		do {
			// 3. Strike / Ball 판정
			System.out.print("Input number... ");
			for (int i = 0; i < inp.length; i++) {
				inp[i] = sc.nextInt();
			}


			for (int i = 0; i < inp.length; i++) {
				System.out.print(inp[i] + " ");
			}

			// 3-1. Strike 판정
			int strike = 0;
			for (int i = 0; i < inp.length; i++) {
				if (rnd[i] == inp[i]) {
					strike++;
				}
			}

			// 3-2. Ball 판정
			int ball = 0;
			for (int i = 0; i < inp.length; i++) {
				for (int j = 0; j < inp.length; j++) {
					if(i != j && rnd[i] == inp[j]) {
						ball++;
					}
				}
			}

			System.out.println("Strike : " + strike + ", Ball : " + ball);
			
			//4. 3 Strikes가 되면 게임 종료
			if(strike == 3) {
				conti = false;
				System.out.println("Game Over...!!!");
			}
		} while (conti);
		sc.close();
	}
}















