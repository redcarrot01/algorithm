package costudy1;

import java.util.*;

public class co9095v2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] rule = new int[11];
		rule[1] = 1;
		rule[2] = 2;
		rule[3] = 4;
		
		int T = sc.nextInt();
		
		for(int i=0; i<T; i++) {
			int N = sc.nextInt();
			
			if(N >3) {
				for(int j =4; j<=N; j++) {
					rule[j] = rule[j-1] + rule[j-2]+ rule[j-3];
				}
			}
			System.out.println(rule[N]);
		}
	}
}
