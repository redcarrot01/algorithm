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
	        
	        max = Integer.MIN_VALUE; //int�� �ڷ����� �ּҰ�
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
	        
	        // ���� idx�� ���� => ��� ���ϴ� �ð���ŭ idx�� �÷���
	        solve(idx+T[idx], v+P[idx]);
	        // ���� idx�� ������
	        solve(idx+1,v);
	    }
}
