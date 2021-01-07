/**
 * The Fibonacci sequence is defined by the following rule. 
 * The first 2 values in the sequence are 1, 1. Every subsequent value is the sum of the 2 values preceding it. 
 * Write a Java program that uses both recursive and non-recursive functions to print the nth value of the 
 * Fibonacci sequence?
 * @author kethu_greeshma
 *
 */
public class Exercise3 {

	public static void main(String[] args) {
		int num=8;
		for(int i=1;i<=num;i++) {
			if(i==num)
				System.out.print(recursive(i));
			else
				System.out.print(recursive(i)+", ");
		}
		System.out.println();
		nonRecursive(num);

	}

	private static void nonRecursive(int num) {
		int first = 1, second = 1;
		System.out.print(first+", "+second+", ");
		for(int i=2;i<num;i++) {
			int sum = first+second;
			if(i==num-1)
				System.out.print(sum);
			else
				System.out.print(sum+", ");
			first = second;
			second = sum;
		}
		
	}

	private static int recursive(int num) {
		if(num==1 || num==2)
			return 1;
		return recursive(num-1)+recursive(num-2);
		
	}

}
