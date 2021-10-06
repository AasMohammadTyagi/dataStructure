package binarySearch;

public class SearchElement {
	/*public static int binarySearchIteration(int array[],int start,int end,int element) {
		while(start<=end) {
			int mid=(start+end)/2;
			if(array[mid]==element) {
				return mid;
			}
			else if(array[mid]<=element) {
				start=mid+1;
			}
			else if(array[mid]>=element) {
				end=mid-1;
			}
			
		}
		return -1;
	}*/
	public static int binarySearchRecursion(int array[],int start,int end,int element) {
		
		if(start<=end && end<=array.length-1) {
			int mid=(start+end)/2;
		if(array[mid]==element) {
			return mid;
		}
		else if(array[mid]>element) {
			return binarySearchRecursion(array,start,mid-1,element);
			
		}
		else if(array[mid]<element) {
			return binarySearchRecursion(array,mid+1,end,element);
		} else {
			
		}}
		return -1;
		
	}

	public static void main(String[] args) {
		int array[]= {1,2,3,4,5,6};
		System.out.println(binarySearchRecursion(array,0,array.length-1,3));

	}

}
