import java.util.Scanner;
import java.io.File;

/**
 * Write a Java program that displays the number of characters, lines and words in a text? 
 * @author kethu_greeshma
 *
 */
public class Exercise567 {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		//String inp = "";
//		int cou=0;
//		while(sca.hasNextLine()) {
//			inp += sca.nextLine();
//			cou++;
//		}
//		System.out.println("Number of lines are "+cou);
		String str[] = sca.nextLine().split(" ");
		countPrint(str);
	}

	private static void countPrint(String[] str) {
		System.out.println("Number of words are "+str.length);
		int count=0;
		for(int i=0;i<str.length;i++) {
			count += str[i].length();
		}
		System.out.println("Number of Characters are "+count);
	}

}
