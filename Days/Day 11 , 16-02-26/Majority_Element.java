import java.util.*;

public class Majority_Element {
    public static int find_Majority_brute(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int cnt = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    cnt++;
                }
            }
            if (cnt > arr.length / 2) {
                return arr[i];
            }
        }
        return -1;
    }

    public int find_Majority_better(int arr[]) {
        // step 1 Create a HashMap
        HashMap<Integer, Integer> map = new HashMap<>();

        // step 2 adding element and their frequency
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // step 3 iterate through map
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > arr.length / 2) {
                return entry.getKey();
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 1, 2, 4, 2, 1, 2, 2 };
        // first Approach
        System.out.print(find_Majority_brute(arr));

        // Creating a Instance of Main Class

        Majority_Element obj = new Majority_Element();
        int result = obj.find_Majority_better(arr);
        System.out.print(result);
    }
}
