package beginner.q2259;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

class Mov {
	public int dir;
	public int len;
}

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int dirNorth = 0; // 1: EAST, 2:WEST, 3:SOUTH, 4:NORTH
		int dirEast = 0;
		List<Mov> list = new ArrayList<>();
		List<Mov> dbllist = new ArrayList<>();

		do {
			String inp = br.readLine();
			if (inp == "")
				break;

			StringTokenizer st = new StringTokenizer(inp);
			Mov mov1 = new Mov();
			mov1.dir = Integer.parseInt(st.nextToken());
			mov1.len = Integer.parseInt(st.nextToken());
			list.add(mov1);

			switch (mov1.dir) {
			case 1:
				dirEast += mov1.len;
				break;
			case 2:
				dirEast -= mov1.len;
				break;
			case 3:
				dirNorth -= mov1.len;
				break;
			case 4:
				dirNorth += mov1.len;
				break;
			}
		} while (!(dirNorth == 0 && dirEast == 0));

		// copy list
		for (int i = 0; i < list.size(); i++) {
			Mov m = list.get(i);
			dbllist.add(m);
		}
		for (int i = 0; i < list.size(); i++) {
			Mov m = list.get(i);
			dbllist.add(m);
		}

		// 각 방향 별 count
		int[] dir_cnt = new int[4];
		for (int i = 0; i < list.size(); i++) {
			dir_cnt[list.get(i).dir - 1]++;
		}

		// 각 방향 별 min
		int[] dir_min = new int[4];
		for (int i = 0; i < list.size(); i++) {
			if (dir_min[(list.get(i).dir) - 1] == 0)
				dir_min[(list.get(i).dir) - 1] = list.get(i).len;
			else if (dir_min[(list.get(i).dir) - 1] > list.get(i).len)
				dir_min[(list.get(i).dir) - 1] = list.get(i).len;
		}

		// 각 방향 별 sum
		int[] dir_sum = new int[4];
		for (int i = 0; i < list.size(); i++) {
			int idx = list.get(i).dir - 1;
			dir_sum[idx] += list.get(i).len;
		}

		int totalArea = dir_sum[0] * dir_sum[2];
		int subArea = 1;
		for (int i = 0; i < dbllist.size() - 3; i++) {
			if (dbllist.get(i).dir == dbllist.get(i + 2).dir && dbllist.get(i + 1).dir == dbllist.get(i + 3).dir) {
				subArea = dbllist.get(i + 1).len * dbllist.get(i + 2).len;
			}
		}
		System.out.println((totalArea - subArea) * N);
	}
}
