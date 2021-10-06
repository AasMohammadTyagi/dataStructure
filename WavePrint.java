package TwoDDArray;

public class WavePrint {
	public static void printWave(int mat[][]) {
		int i=0;
		int row=mat.length;
		int cols=mat[0].length;
		while(i<cols) {
			
		
		if(i%2==0) {
			for(int j=i;j<=i;j++) {
				for(int k=0;k<row;k++){
					System.out.print(mat[k][j]+ " ");
					
				}
			}
			i++;
		}
		else if(i%2!=0) {
			for(int s=i;s<=i;s++) {
				for(int p=row-1;p>=0;p--) {
					System.out.print(mat[p][s]+" ");
				}
			}
			i++;
		}
	}
	}
	public static void main(String [] args) {
	int matrix[][]= {{1,2,3},{4,5,6},{7,8,9}};
	printWave(matrix);
	}

}
