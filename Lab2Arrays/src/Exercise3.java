import java.util.Arrays;
import java.util.Scanner;

/**
 * Create a method which accepts an integer array, reverse the numbers in the array and returns the 
 * resulting array in sorted order
 * @author kethu_greeshma
 *
 */
public class Exercise3 {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		int num = sca.nextInt();
		int arr[] = new int[num];
		for(int i=0;i<num;i++) {
			arr[i] = sca.nextInt();
		}
		int ans[] = getSorted(arr);
		for(int i=0;i<ans.length;i++) {
			System.out.print(ans[i]+" ");
		}
	}
	

    private static int[] getSorted(int[] arr) {
		int ans[] = new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			StringBuilder str = new StringBuilder(Integer.toString(arr[i]));
			str = str.reverse();
			ans[i] = Integer.parseInt(str.toString());
		}
		Arrays.sort(ans);
		return ans;
	}

}
