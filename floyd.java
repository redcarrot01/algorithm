package costudy1;

public class floyd {
	
	static int number = 4;
	static int [][]d = new int[number][number];    
	static int INF = 10000000;
	
	
		// �ڷ� �迭 �ʱ�ȭ
    static int [][] a = {
				{0, 5, INF, 8},
				{7, 0, 9, INF},
				{2, INF, 0, 4},
				{INF, INF, 3, 0}
		};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//floydWarshall();
		for (int i=0; i< number; i++) {
			for(int j=0; j<number; j++) {
				d[i][j] = a[i][j];
			}
		}
		
		//k ���İ��� ���
		for(int k=0; k<number; k++) {
			//i�� ��� ���
			for(int i=0; i< number; i++) {
				//j�� ���� ���
				for(int j=0; j<number; j++) {
					if(d[i][k]+ d[k][j]< d[i][j])
						d[i][j] = d[i][k]+ d[k][j];
				}
			}
		}
		for(int i =0; i< number ; i++) {
			for(int j =0; j< number ; j++) {
				System.out.print( d[i][j]);
			}
			System.out.println( );
		}
		
		
	}

	

}
 //static �� ���� , private, public �� ����