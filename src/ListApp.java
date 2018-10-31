import java.util.HashMap;
import java.util.Map;

public class ListApp {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 2, 2, 4, 5, 5, 7, 8, 4, 4, 1, 0, 10};
		int[] arrayAnswer = countWithArray(arr);
		System.out.println(arrayAnswer[0]);
		System.out.println(arrayAnswer[1]);
		System.out.println(arrayAnswer[2]);
		System.out.println(arrayAnswer[4]);
		System.out.println(arrayAnswer[5]);
		System.out.println(arrayAnswer[7]);
		System.out.println(arrayAnswer[8]);
		System.out.println(arrayAnswer[10]);
		System.out.println(hash(arr));
	}

	private static Map<Integer, Integer> hash(int[] arr) {
		Map<Integer, Integer> h = new HashMap<>();
		for (int num : arr) {
			if (h.containsKey(num)) {
				int val = h.get(num);
				h.put(num, val+1);
			} else {
				h.put(num, 1);
			}
		}
		return h;
	}

	private static int[] countWithArray(int[] arr) {
		int max = arr[0];
		int min = arr[0];
		for (int num : arr) {
			if (num > max) {
				max = num;
			}
		}
		for (int num : arr) {
			if (num < min) {
				min = num;
			}
		}
		int[] outputArray = new int[max-min+1];
		for (int i = 0; i < arr.length; i++) {
			outputArray[arr[i]]++;
		}
		return outputArray;
	}
	
	
}
