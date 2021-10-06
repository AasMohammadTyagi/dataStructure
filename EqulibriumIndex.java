package timeComplexityAssignment;

public class EqulibriumIndex {
	public static int arrayEquilibriumIndex(int[] arr){
		int i=1;
		int n=arr.length;
		while(i<n) {
			int sumLeft=0;
			int sumRight=0;
			for(int j=0;j<=i-1;j++) {
				sumLeft+=arr[j];
			}
			for(int j=i+1;j<n;j++) {
				sumRight+=arr[j];
			}
			if(sumLeft==sumRight) {
				return i;
			}
			else {
				i++;
			}
			
		}
		return -1;
	}

	public static void main(String[] args) {
		int array[]= {1,4,6};
		System.out.println(arrayEquilibriumIndex(array));

	}

}
