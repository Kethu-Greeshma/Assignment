import java.util.Scanner;

/**
 * Create a method that accepts a String and checks if it is a positive string. 
 * A string is considered a positive string, if on moving from left to right each character in the 
 * String comes after the previous characters in the Alphabetical order
 * @author kethu_greeshma
 *
 */
public class Exercise8 {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		String str = sca.nextLine();
		boolean ans = positiveString(str);
		System.out.println(ans);

	}

	private static boolean positiveString(String str) {
		for(int i=0;i<str.length()-1;i++) {
			int one = (int)str.charAt(i);
			int two = (int)str.charAt(i+1);
			if(one>two)
				return false;
		}
		return true;
	}

}
