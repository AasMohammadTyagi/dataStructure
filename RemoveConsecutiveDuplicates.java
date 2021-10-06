package recursion;

public class RemoveConsecutiveDuplicates {
	public static String removeConsecutiveDuplicates(String s) {
		if(s.length()==0 || s.length()==1) {
			return s;
		}
		if(s.charAt(0)!=s.charAt(1)) {
			String smallString=removeConsecutiveDuplicates(s.substring(1));
			return s.charAt(0)+smallString;
		}
		else {
			String smallString=removeConsecutiveDuplicates(s.substring(1));
			return smallString;
		}
	}

	public static void main(String[] args) {
		String string="aabcca";
		System.out.println(removeConsecutiveDuplicates(string));

	}

}
