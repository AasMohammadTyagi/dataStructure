package recursion;

public class RemoveCharacter {
	public static String removeX(String input){
		if(input.length()==0) {
			return input;
		}
		String smallString=removeX(input.substring(1));
		if(input.charAt(0)=='x'){
		return smallString;}
		else{
			return input.charAt(0)+smallString;
		}
	}
	

	public static void main(String[] args) {
		String string="abxc";
		System.out.println(removeX(string));

	}

}
