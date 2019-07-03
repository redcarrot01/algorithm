package costudy1;

import java.util.*;


public class co11403 {
	
         static int Infinite = 10000; // 경로 0인 부분 => 니올 수 없는 수로 대체
   
         
    public static void main(String[] args) {    
    	 Scanner sc = new Scanner(System.in);
         int N = sc.nextInt();
    	 int [][]d = new int[N+1][N+1];
         
    	
    	for(int i=1; i<= N; i++) {
    		for(int j=1; j<= N ; j++) {
    			d[i][j]= sc.nextInt();
    			if(d[i][j] == 0)
    				d[i][j] = Infinite;
    		}
    	}
    	//  거쳐가는 노드
    	for(int k=1; k<= N ; k++) 
    		// 시작 노드
    		for(int i=1; i<= N; i++)
    			// 도착 노드
    			for(int j=1;j<=N;j++) {
    				if(d[i][k]+ d[k][j]< d[i][j])
    					d[i][j]=d[i][k]+ d[k][j];
    			}
    	
    	for(int i=1; i<= N; i++) {
    		for(int j=1; j<= N ; j++) {
    			System.out.printf("%d", d[i][j] == Infinite ? 0 : 1 );
    			System.out.print(" ");
    			}            		
    		System.out.println();
    		}
    	}
}

// infinite는  경로 없는 부분 , 0 인부분 , 나올 수 없는 수로 대체