package binarySearch;

public class MinimumElementInRotatedSortedArray {
	public static int  minimum(int array[]) {
		int n=array.length;
		int start=0;
		int end=n-1;
//		int element=0;
		while(start<=end) {
			int mid=start+(end-start)/2;
			int next=(mid+1)%n;
			int previous=(mid+n-1)%n;
			if(array[mid]<=array[previous] && array[mid]<=array[next]) {
//				System.out.println(array[mid]);
				return array[mid];
			}
			else if(array[mid]>=array[start]) {
				start=mid+1;
			}
			else if(array[mid]<=end) {
				end=mid-1;
			}
		}
		//System.out.println(element);
		return 0;
	}

	public static void main(String args[]) {
		int array[]= {50,55,65,76,89};
		int element=minimum(array);
		System.out.println(element);
	}
}
