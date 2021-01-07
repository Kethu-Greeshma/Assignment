import java.util.Scanner;

/**
 * Create a class containing a method to create the mirror image of a String. 
 * The method should return the two Strings separated with a pipe(|) symbol 
 * @author kethu_greeshma
 *
 */
public class Exercise2 {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		String str = sca.nextLine();
		getImage(str);
	}

	private static void getImage(String str) {
		StringBuffer sbuff = new StringBuffer(str);
		sbuff = sbuff.reverse();
		System.out.println(str+"|"+sbuff);
		
	}

}
