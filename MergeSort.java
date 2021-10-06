package recursion;

public class MergeSort {
	public static void merge(int arr1[], int arr2[],int arr3[]) {
    	int m=arr1.length;
        int n=arr2.length;
       // int arr3[]=new int[m+n];
//        if(m==0){
//            return arr2;
//        }
//        else if(n==0){
//            return arr1;
//        }
      int i=0;
        int j=0;
        int k=0;
        while(i<m && j<n){
            if(arr1[i]<=arr2[j]){
                arr3[k]=arr1[i];
                i++;
                k++;
            }
            else {
                arr3[k]=arr2[j];
                j++;
                k++;
            }
        }
        while(i<m){
            arr3[k]=arr1[i];
            i++;
            k++;
        }
         while(j<n){
            arr3[k]=arr2[j];
            j++;
            k++;
        }
	}
	public static void mergesort(int input[]) {
	if(input.length<=1) {
		return;
	}
	int a[]=new int[input.length/2];
	int b[]=new int[input.length-a.length];
	for(int i=0;i<input.length/2;i++) {
		a[i]=input[i];
	}
	for(int i=input.length/2;i<input.length;i++) {
		b[i-input.length/2]=input[i];
	}
	mergesort(a);
	mergesort(b);
	merge(a,b,input);
	}

	public static void main(String[] args) {
		int array[]= {4,34,531,1,34,5321,23};
		mergesort(array);
		System.out.println("After merge sort  array is ");
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+ " ");
		}

	}

}
