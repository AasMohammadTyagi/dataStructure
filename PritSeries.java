package recursion;

public class PritSeries {
	public static void printSeries(int n,int k) {
		final int  s=n;
		if(n+k==s) {
			//System.out.println(n);
			return;
			//return 0;
		}
		if(n>=0 && n==s) {
			printSeries(n-k,k);
			System.out.println(n);
		}
		if(n<=0 && n!=s) {
			printSeries(n+k,k);
			System.out.println(n);
		}
		//return 0;
	}

	public static void main(String[] args) {
		printSeries(5,2);

	}

}
