package costudy1;

import java.util.Scanner;
//import java.io.IOException;

public class co14501 {
	   static int n;
	    static int[] T,P;
	    public static void main(String[] args)  {
	    	
	        Scanner sc = new Scanner(System.in);
	        n = sc.nextInt();
	        T = new int[n];
	        P = new int[n];
	        
	        for(int i=0;i<n;i++) {
	            T[i] = sc.nextInt();
	            P[i] = sc.nextInt();
	        }
	        
	        max = Integer.MIN_VALUE; //int형 자료형의 최소값
	        solve(0,0);
	        System.out.println(max);
	        
	    }
	    
	    static int max;
	    
	    private static void solve(int idx,int v) {
	    	
	        if(idx>n) return;
	        
	        if(idx==n) {
	            max = Math.max(max, v);
	            return;
	        }        
	        
	        // 현재 idx를 포함 => 상담 못하는 시간만큼 idx를 올려줌
	        solve(idx+T[idx], v+P[idx]);
	        // 현재 idx를 미포함
	        solve(idx+1,v);
	    }
}
