package TwoDDArray;

public class SpiralPrint {

	public static void main(String[] args) {
		int mat[][]= {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		int row=mat.length;
		int column=mat[0].length;
		int startRow=0;
		int lastRow=row-1;
		int startColumn=0;
		int lastColumn=column-1;
		int totalNumber=row*column;
		int count=1;
		
		while(count<=totalNumber) {
		for(int i=startRow;i<=startRow ;i++) {
			for(int j=startColumn;j<=lastColumn && count<=totalNumber;j++){
				System.out.print(mat[i][j] + " ");
				count++;
				
			}
			
			
		}
	
		for(int i=lastColumn;i<=lastColumn;i++) {
			for(int j=startRow+1;j<=lastRow && count<=totalNumber;j++) {
				System.out.print(mat[j][i]+ " ");
				count++;
			}
			
		}
		
		for(int i=lastRow;i<=lastRow;i++) {
			for(int j=lastColumn-1;j>=startColumn && count<=totalNumber;j--) {
				System.out.print(mat[i][j]+" ");
				count++;
			}
			
		}
		
		for(int i=startColumn;i<=startColumn;i++) {
			for(int j=lastRow-1;j>=startRow+1 && count<=totalNumber;j--) {
				System.out.print(mat[j][i]+" ");
				count++;
			}

		}
		startRow++;
		startColumn++;
		lastRow--;
		lastColumn--;


	}
		}

}
