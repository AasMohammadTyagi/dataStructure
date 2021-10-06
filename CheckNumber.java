package recursion;

public class CheckNumber {
	public static boolean checkNumber(int input[],int x) {
		if(input.length==0) {
			return false;
		}
		if(input[0]==x) {
			return true;
		}
		int smallArray[]=new int[input.length-1];
		for(int i=1;i<input.length;i++) {
			smallArray[i-1]=input[i];
		}
		boolean result=checkNumber(smallArray,x);
		return result;
	}

	public static void main(String[] args) {
		int array[]= {1,4,5,6};
		System.out.println(checkNumber(array,5));

	}

}
