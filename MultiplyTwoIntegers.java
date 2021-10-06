package recursion;

public class MultiplyTwoIntegers {
	public static int multiplyTwoIntegers(int m, int n){
		if(m==0 || n==0) {
			return 0;
		}
		int result=multiplyTwoIntegers(m,n-1);
		return result+m;
	}
			
		public static void main(String[] args) {
		System.out.println(multiplyTwoIntegers(5,3));

	}

}
