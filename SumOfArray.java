package recursion;

public class SumOfArray {
	public  static int sum(int array[]) {
	
		if(array.length==1) {
			return array[0];
			
		}
		final int a=array[0];
		int smallArray[]=new int[array.length-1];
		for(int i=1;i<array.length;i++) {
			smallArray[i-1]=array[i];
		}
		int sumArray=sum(smallArray);
		int result=a+sumArray;
		return result;
	}
	public static void main(String args[]) {
		int array[]= {4,2,1};
		System.out.println(sum(array));
		
	}

}
