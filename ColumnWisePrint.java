package TwoDDArray;

public class ColumnWisePrint {

	public static void main(String[] args) {
		int array[][]={{1,2},{90,100},{3,40},{-10,200}};
		int cols=array[0].length;
		int rows=array.length;
		int LargestRowSum=Integer.MIN_VALUE;
		int LargestColSum=Integer.MIN_VALUE;
		int r=-1,c=-1;
		for(int i=0;i<cols;i++) {
			int colSum=0;
			for(int j=0;j<rows;j++) {
				colSum+=array[j][i];
				}
			if(colSum>LargestColSum) {
				LargestColSum=colSum;
				
			}
			c++;
		}
		for(int i=0;i<rows;i++) {
			int rowSum=0;
			for(int j=0;j<cols;j++) {
				rowSum+=array[i][j];
		}
		if(rowSum>LargestRowSum) {
			LargestRowSum=rowSum;
			
		}
		r++;
	}
		if(LargestRowSum>=LargestColSum) {
			System.out.println("row "+r+" "+LargestRowSum);
		}
		else {
			System.out.println("column "+c+" "+LargestColSum);
		}
	}
}
