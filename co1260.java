package costudy1;

import java.util.*;



public class co1260 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int A [] = new int[N];
		int B [] = new int[N];
		
        int S = 0;
        int min = 0;
        int max = 0;
        
        for(int i=0; i<N; i++) {
        	A[i]=sc.nextInt();
        }
        for(int i=0; i<N; i++) {
        	B[i]=sc.nextInt();
        }
        //A오름차순으로 정렬 -< Arrays.sort(N);
        for(int i=0; i<N; i++) {
        	for(int j=i+1; j<N; j++) {
        		if(A[i] > A[j]) {
        			min = A[i]; 
        			A[i] = A[j];
        			A[j] = min;
        		}
        	}
        }
        //B내림차순으로 정령 -> 최솟값S위해
        for(int i =0; i<N; i++) {
        		for(int j=i+1; j<N; j++) {
        			if(B[i] < B[j]) {
        				max = B[i];
        				B[i] = B[j];
        				B[j] = max ; 
        			}
        }
	}
        for(int i=0; i<N; i++) {
        	S += A[i] * B[i];
        }
        System.out.print(S);

}
}
