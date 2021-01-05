/**
 * Display String in reverse order word by word
 * @author Kethu Greeshma
 *
 */
public class Assignment1 {

	public static void main(String[] args) {
		String str1 = "Hello Dear Friend";
		//Output as  :  Friends Dear Hello
		String output = reverseString(str1);
		System.out.println(output);
		

	}

	private static String reverseString(String input) {
		String[] out = input.split(" ");
		String output = "";
		for(int i=out.length-1;i>=0;i--) {
			output += out[i];
			if(i==0)
				break;
			output += " ";
		}
		return output;
	}

}
