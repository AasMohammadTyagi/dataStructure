package recursion;

public class LastIndex {
//	public static int lastIndex(int input[],int x,int startIndex) {
//		//int lastIndex;
//		if(input.length==0) {
//			return -1;
//		}
//		if(input[startIndex]==x) {
//			
//			 return startIndex;
//		}
//		int smallProblem=lastIndex(input,x,startIndex-1);
//			return smallProblem;
//	}
	public static int lastIndex(int []input,int x) {
		if(input.length==0) {
			return -1;
		}
//		if(input[input.length-1]==x) {
//			return 0;
//		}
		int smallArray[]=new int[input.length-1];
		for(int i=1;i<input.length;i++) {
			smallArray[i-1]=input[i];
		}
		int lastindex=lastIndex(smallArray,x);
		if(lastindex!=-1) {
			return lastindex+1;
		}else {
			if(input[0]==x) {
				return 0;
			}
			else {
				return -1;
			}
		}
		
	}

	public static void main(String[] args) {
		int array[]= {4,8,45,8,89,45};
		System.out.println(lastIndex(array,8));

	}

}
