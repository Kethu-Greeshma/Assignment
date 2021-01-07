import java.util.Arrays;
import java.util.Scanner;

/**
 * : Create a method that can accept an array of String objects and sort in alphabetical order. 
 * The elements in the left half should be completely in uppercase and the elements in the right half 
 * should be completely in lower case. Return the resulting array.
 * @author kethu_greeshma
 *
 */
public class Exercise2 {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		int num = sca.nextInt();
		String arr[] = new String[num];
		for(int i=0;i<num;i++) {
			arr[i] = sca.next();
		}
		String ans[] = sortStrings(arr);
		for(int i=0;i<ans.length;i++) {
			System.out.print(ans[i]+" ");
		}

	}

	private static String[] sortStrings(String[] arr) {
		Arrays.sort(arr);
		int size = arr.length;
		String ans[] = new String[size];
		if(size%2==0) {
			for(int i=0;i<size/2;i++) {
				ans[i] = arr[i].toUpperCase();
			}
			for(int i=size/2;i<size;i++) {
				ans[i] = arr[i].toLowerCase();
			}
		}
		else {
			for(int i=0;i<size/2+1;i++) {
				ans[i] = arr[i].toUpperCase();
			}
			for(int i=size/2+1;i<size;i++) {
				ans[i] = arr[i].toLowerCase();
			}
		}
		return ans;
	}

}
