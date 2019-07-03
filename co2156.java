
package costudy1;


import java.util.Scanner;

public class co2156 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int testcase = sc.nextInt();
		int[] index = new int[testcase+1]; // 입력하는 수,  첫번째 수 = 배열[1]에 해당
		int[] sum = new int[testcase+1]; //누적 최대값  
		
		for(int t=1; t<=testcase; t++) {
			index[t] = sc.nextInt();
		}
		
		sum[1]= index[1];
		if(testcase>1)
			sum[2] = index[1] +index[2];
		
		if(testcase>2) {
			int case0 = Math.max(index[1]+ index[3],index[2]+ index[3] );
			sum[3] = Math.max(case0, index[1]+index[2]);
		}
		if(testcase>3) {
			for(int i=4; i<=testcase; i++) {
				int case1 = sum[i-2]+ index[i];
				int case2 = sum[i-3]+ index[i-1]+ index[i];
				int case3 = sum[i-1];
				
				sum[i] = Math.max(case1, case2);
				sum[i] = Math.max(sum[i],case3);
			}
		}
		System.out.print(sum[testcase]); //n번째 누적 최대값

	}

}
