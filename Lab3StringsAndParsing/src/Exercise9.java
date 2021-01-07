import java.util.Scanner;

/**
 * Create a method to accept date and print the duration in days, months and years with 
 * regards to current system date.
 * @author kethu_greeshma
 *
 */
public class Exercise9 {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		String str[] = sca.nextLine().split("-");
		printDate(str);
	}

	private static void printDate(String[] str) {
		System.out.println("Number of days are "+str[0]);
		System.out.println("Number of months are "+str[1]);
		System.out.println("Number of years are "+str[2]);
	}

}
