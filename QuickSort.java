package recursion;

public class QuickSort {
	public static void swap(int arr[],int a,int b) {
		int temp=arr[a];
		arr[a]=arr[b];
		arr[b]=temp;
	}
		
	public static int partition(int array[] ,int low,int high) {
		int pivot=array[low];
		int i=low;
		int j=high;
		while(i<j) {
			while(array[i]<=pivot) {
				i++;
			}
			while(array[j]>pivot) {
				j--;
			}
			if(i<j) {
				swap(array,i,j);
			}
				
		}
		swap(array,j,low);
		return j;
					
	}
	public static void quick(int array[],int low,int high) {
		if(low<high) {
			int pivot=partition(array,low,high);
			quick(array,low,pivot-1);
			quick(array,pivot+1,high);
		}
	}

	public static void main(String[] args) {
		int array[]= {2,45,65,4,56,57,87,2,13};
		quick(array,0,array.length-1);
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i] +" ");
		}

	}

}
