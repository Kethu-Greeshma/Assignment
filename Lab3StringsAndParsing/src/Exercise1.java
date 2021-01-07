import java.util.ArrayList;
import java.util.Scanner;

/**
 * Write a Java program that reads a line of integers and then displays each integer and the 
 * sum of all integers. (Use String Tokenizer class)?
 * @author kethu_greeshma
 *
 */
public class Exercise1 {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		String str[] = sca.nextLine().split(" ");
		displayAndSum(str);
	}

	private static void displayAndSum(String[] str) {
		ArrayList arrl = new ArrayList();
		int sum=0;
		for(int i=0;i<str.length;i++) {
			arrl.add(Integer.parseInt(str[i]));
		}
		for(int i=0;i<arrl.size();i++) {
			System.out.print(arrl.get(i)+" ");
			sum = sum+(int)arrl.get(i);
		}
		System.out.println();
		System.out.print("sum is "+sum);
		
	}

}
