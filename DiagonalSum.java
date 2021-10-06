package TwoDDArray;

public class DiagonalSum {

	public static void main(String[] args) {
		int mat[][]= {{6,9,8,5,9},{2,4,1,8,3},{9,3,8,7,8},{6,8,9,4,1},{1,7,6,1,5}};
//		6 9 8 5 9 
//		2 4 1 8 3 
//		9 3 8 7 8 
//		6 8 9 4 1 
//		1 7 6 1 5 
		int row=mat.length;
		int i=0;
		int sum=0;
		while(i<row) {
			sum+=mat[i][i];
			i++;
		}
		System.out.println(sum);
		int j=mat[0].length-1;
		int sum2=0;
		int u=-1;
		for(;j>=0;j--) {
			
			u++;
			if((mat[0].length/2)==u && mat[0].length%2!=0) {
				
			continue;
			
			}
			//j--;
			//u++;
			sum2+=mat[j][u];
			
		}
		System.out.println(sum2);
		int sum3=0;
		for(int k=0;k<mat.length;k++) {
			for(int l=0;l<mat[0].length;l++) {
				sum3+=mat[k][l];
			}
		}
		
		System.out.println(sum3);
		int startRowSum=0;

		for(int p=0;p<=0;p++ ) {
			for(int q=1;q<=mat[0].length-2;q++) {
				startRowSum+=mat[p][q];
			}
			System.out.println(startRowSum);
		}
		int lastRowSum=0;
		for(int p=mat.length-1;p<=mat.length-1;p++) {
			for(int q=1;q<=mat[0].length-2;q++) {
			lastRowSum+=mat[p][q];
			}
		}
		
		System.out.println(lastRowSum);
		int firstColumnSum=0,lastColumnSum=0;
		for(int p=0;p<=0;p++) {
			for(int q=1;q<=mat[0].length-2;q++) {
				firstColumnSum+=mat[q][p];
			}
			System.out.println(firstColumnSum);
			
		}
		for(int p=mat[0].length-1;p<=mat[0].length-1;p++) {
			for(int q=1;q<=mat[0].length-2;q++) {
				lastColumnSum+=mat[q][p];
			}
		}
		System.out.println(lastColumnSum);
		int totalSum=sum+sum2+startRowSum+lastRowSum+firstColumnSum+lastColumnSum;
		System.out.println(totalSum);
	}

}
