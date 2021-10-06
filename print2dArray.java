package TwoDDArray;

public class print2dArray {
	public static void print(int input[][] ){
		int row=input.length;
		int column=input[0].length;
		for(int i=0;i<row;i++) {
			int n=input.length;
			while(n>i) {
			for(int j=0;j<column;j++) {
				
				System.out.print(input[i][j]+" ");
				}
			
			n--;
			System.out.println();
			}
			
		}
	}
	public static void main(String args[]) {
		int matrix[][]= {{1,2,3},{4,5,6},{7,8,9}};
		print(matrix);
	}

}
