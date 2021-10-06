package recursion;

public class StringPalindrome {
	public static boolean isPalindrome(String str,int start,int end) {
		//boolean palindrome=true;
//		if(str.length()==0) {
//			return true;
//		}
		if(start>=end) {
			return true;
		}
		if(str.charAt(start)!=str.charAt(end)) {
			return false;
		}
		return isPalindrome(str,start+1,end-1);
		
	}

	public static void main(String[] args) {
		String string="aabqibaa";
		int end=string.length()-1;
		System.out.println(isPalindrome(string,0,end));

	}

}
