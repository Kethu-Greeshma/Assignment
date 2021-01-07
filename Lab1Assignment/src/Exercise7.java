/**
 * Create a method to check if a number is an increasing number
 * @author kethu_greeshma
 *
 */
public class Exercise7 {

	public static void main(String[] args) {
		int num = 1675;
		boolean ans = checkNumber(num);
		System.out.println(ans);

	}

	private static boolean checkNumber(int num) {
		int rem = num%10;
		int b=rem;
		num /= 10;
		while(num>0) {
			rem = num%10;
			if(rem>b)
				return false;
			b = rem;
			num /= 10;
		}
		return true;
	}

}
