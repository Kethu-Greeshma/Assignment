import java.util.Scanner;

/**
 * Create a method that accepts a number and modifies it such that the each of the digit in the newly formed 
 * number is equal to the difference between two consecutive digits in the original number. 
 * The digit in the units place can be left as it is. 
 * @author kethu_greeshma
 *
 */
public class Exercise4 {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		int num = sca.nextInt();
		int ans = modifyNumber(num);
		System.out.println(ans);
	}

	private static int modifyNumber(int num) {
		String str = Integer.toString(num);
		StringBuffer sbuff = new StringBuffer();
		for(int i=0;i<str.length()-1;i++) {
			int cha1 = (int)str.charAt(i);
			int cha2 = (int)str.charAt(i+1);
			int diff = cha1-cha2;
			if(diff<0)
					diff *= -1;
			sbuff.append(diff);
		}
		sbuff.append(str.charAt(str.length()-1));
		int ans = Integer.parseInt(sbuff.toString()); 
		return ans;
	}

}
