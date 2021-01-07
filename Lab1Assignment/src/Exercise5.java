/**
 * Create a class with a method which can calculate the sum of first n natural numbers which are divisible by 3 or 5.
 * @author kethu_greeshma
 *
 */
public class Exercise5 {

	public static void main(String[] args) {
		int num = 20;
		int sum = calculateSum(num);
		System.out.println(sum);

	}

	private static int calculateSum(int num) {
		int sum=0;
		for(int i=3;i<=num;i++) {
			if(i%3==0 || i%5==0) {
				System.out.print(i+" ");
				sum += i;
			}
		}
		return sum;
	}

}
