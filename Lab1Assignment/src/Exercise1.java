/**
 * Create a method to find the sum of the cubes of the digits of an n digit number
 * @author kethu_greeshma
 *
 */
public class Exercise1 {

	public static void main(String[] args) {
		int num = 1234;
		System.out.println(getSum(num));

	}

	private static int getSum(int num) {
		int sum=0;
		while(num>0) {
			int rem = num%10;
			sum += rem*rem*rem;
			num /= 10;
		}
		return sum;
	}

}
