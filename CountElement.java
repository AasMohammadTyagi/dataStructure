package binarySearch;

public class CountElement {

	public static int firstOccurencer(int array[],int x) {
		int start=0;
		int end=array.length-1;
		int result=-1;
		while(start<=end) {
			int mid=start+(end-start)/2;
			if(array[mid]==x) {
				result=mid;
				end=mid-1;
			}
			else if(array[mid]<x) {
				start=mid+1;
			}
			else {
				end=mid-1;
			}
		}
		return result;
	}
	public static int lastOccurencer(int array[],int x) {
		int start=0;
		int end=array.length-1;
		int result=-1;
		while(start<=end) {
			int mid=start+(end-start)/2;
			if(array[mid]==x) {
				result=mid;
				start=mid+1;
			}
			else if(array[mid]<x) {
				start=mid+1;
			}
			else {
				end=mid-1;
			}
		}
		return result;
	}
	public static void main(String[] args) {
		int arr[]= {1,4,6,7,8,8,8,8,9};
		int first=firstOccurencer(arr,8);
		int last=lastOccurencer(arr,8);
		System.out.println("first occurence is "+first+" and last occurence is "+last);
		int element=last-first+1;
		System.out.println("element is "+element);

		

	}

}
