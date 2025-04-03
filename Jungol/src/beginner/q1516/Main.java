package beginner.q1516;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<String, Integer> map = new HashMap<>();

		while (true) {
			String inp = sc.nextLine();
			if (inp.equals("END"))
				break;

			StringTokenizer st = new StringTokenizer(inp);
			while (st.hasMoreTokens()) {
				String token = st.nextToken();
				map.put(token, map.getOrDefault(token, 0) + 1);
			}

			Object arr[] = map.keySet().toArray();
			Arrays.sort(arr);

			for (int i = 0; i < arr.length; i++) {
				System.out.println((String) arr[i] + " : " + map.get((String) arr[i]));
			}
			map.clear();
		}
		sc.close();
	}
}
