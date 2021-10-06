package recursion;

public class FirstIndex {
//	public static int firstIndex(int input[],int x,int startIndex) {
//		if(input.length-1==startIndex) {
//			return -1;
//		}
//		
//		
//		if(input[startIndex]==x) {
//			return startIndex;
//		}
//		
//		int smallProblem=firstIndex(input,x,startIndex+1);
//			
//		
//		return smallProblem;
//	}

	public static int firstIndex(int input[],int x) {
		if(input.length==0) {
			return -1;
		}
		if(input[0]==x){
			return 0;
		}
		int smallArray[]=new int[input.length-1];
		for(int i=1;i<input.length;i++) {
			smallArray[i-1]=input[i];
		}
		int firstindex=firstIndex(smallArray,x);
	
	if(firstindex==-1) {
		return -1;}
	return firstindex+1;
	}
	
	public static void main(String[] args) {
	int array[]= {4,8,10,8,76,76};
	System.out.println(firstIndex(array,76));

	}

}
