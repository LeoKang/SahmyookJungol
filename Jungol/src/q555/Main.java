package q555;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String result = "";
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ' ')
				result += str.charAt(i);
		}
		System.out.print(result);
	}
}