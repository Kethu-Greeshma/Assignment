import java.util.Scanner;

/**
 * Create a method which accepts a String and replaces all the consonants in the String with the next alphabet. 
 * @author kethu_greeshma
 *
 */
public class Exercise3 {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		String str = sca.nextLine().trim();
		String ans = alterString(str);
		System.out.println(ans);
	}

	private static String alterString(String str) {
		String ans="";
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || 
					ch=='O' || ch=='U') {
				ans += ch;
				continue;
			}
			else {
				int con = (int)ch;
				if(con==90 || con==122)
					con -= 26;
				con += 1;
				ans += (char)con;
			}
		}
		return ans;
	}

}
