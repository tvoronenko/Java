
public class MagicBox {

	public static void main(String[] args) {
		int[][] arr = {
				{6,7,2,7,6,5},
				{1,5,9,2,1,5},
				{8,3,4,3,8,5},
				{5,5,5,5,5},
		};
		int N=3;
		int[][] magic = new int[N][N];

        int row = N-1;
        int col = N/2;
        magic[row][col] = 1;

        for (int i = 2; i <= N*N; i++) {
            if (magic[(row + 1) % N][(col + 1) % N] == 0) {
                row = (row + 1) % N;
                col = (col + 1) % N;
            }
            else {
                row = (row - 1 + N) % N;
                // don't change col
            }
            magic[row][col] = i;
        }
        
        for(int rowI=0;rowI<=arr.length-N;rowI++){
        	for(int colI=0;colI<=arr[rowI].length-N;colI++){
        		getSubsetArr(rowI,colI);
        	}
        }

	}
	
	public static int[][] getSubsetArr(int[][] arr, int N)){
		
		return null;
		
	}

}
