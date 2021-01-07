/**
 * Create a method to check if a number is a power of two or not
 * @author kethu_greeshma
 *
 */
public class Exercise8 {

	public static void main(String[] args) {
		int num=4098;
		System.out.println(checkNumber(num));

	}

	private static boolean checkNumber(int num) {
		while(num>1) {
			if(num%2!=0)
				return false;
			num /= 2;
		}
		return true;
	}

}
