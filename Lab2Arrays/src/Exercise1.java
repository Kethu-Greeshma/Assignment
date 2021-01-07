import java.util.Arrays;
import java.util.Scanner;

/**
 * Create a method which accepts an array of integer elements and return the second smallest element in the array
 * @author kethu_greeshma
 *
 */
public class Exercise1 {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		int num = sca.nextInt();
		int arr[] = new int[num];
		for(int i=0;i<num;i++) {
			arr[i] = sca.nextInt();
		}
		System.out.println(getSecondSmallest(arr));
	}

	private static int getSecondSmallest(int[] arr) {
		Arrays.sort(arr);
		return arr[1];
	}

}
