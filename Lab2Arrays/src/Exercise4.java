import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Create a method which accepts an integer array and removes all the duplicates in the array. 
 * Return the resulting array in descending order
 * @author kethu_greeshma
 *
 */
public class Exercise4 {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		int num = sca.nextInt();
		int arr[] = new int[num];
		for(int i=0;i<num;i++) {
			arr[i] = sca.nextInt();
		}
		int ans[] = modifyArray(arr);
		for(int i=ans.length-1;i>=0;i--) {
			System.out.print(ans[i]+" ");
		}
	}

	private static int[] modifyArray(int[] arr) {
		ArrayList<Integer> arrl = new ArrayList<Integer>();
		for(int i=0;i<arr.length;i++) {
			if(!arrl.contains(arr[i])) {
				arrl.add(arr[i]);
			}
		}
		int ans[] = new int[arrl.size()];
		for(int i=0;i<arrl.size();i++) {
			ans[i] = (int) arrl.get(i);
		}
		Arrays.sort(ans);
		return ans;
	}

}
