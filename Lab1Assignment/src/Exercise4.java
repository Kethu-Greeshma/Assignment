/**
 * Write a Java program that prompts the user for an integer and then prints out all the prime numbers up to 
 * that Integer?
 * @author kethu_greeshma
 *
 */
public class Exercise4 {

	public static void main(String[] args) {
		int num = 30;
		primeNumbers(num);

	}

	private static void primeNumbers(int num) {
		int check=0;
		if(num>=2)
				System.out.print(2+" ");
		for(int i=3;i<=num;i++) {
			for(int j=2;j<i;j++) {
				if(i%j==0)
					check=1;
			}
			if(check==0)
				System.out.print(i+" ");
			check=0;
		}
		
	}

}
