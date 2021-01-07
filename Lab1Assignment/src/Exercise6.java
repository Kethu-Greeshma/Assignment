/**
 * Create a class with a method to find the difference between the sum of the squares and the square of the 
 * sum of the first n natural numbers.
 * @author kethu_greeshma
 *
 */
public class Exercise6 {

	public static void main(String[] args) {
		int num = 20;
		int diff = calculateDifference(num);
		System.out.println(diff);

	}

	private static int calculateDifference(int num) {
		int sum=0, sum1=0, diff=0;
		for(int i=1;i<=num;i++) {
			sum += i*i;
			sum1 += i;
		}
		diff = sum-(sum1*sum1);
		return diff;
	}

}
