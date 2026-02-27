import java.util.*;
public class Longest_Subarray{
    public static void longest_subarray(int arr[] , int k){
        int left = 0;
        int right = 0;
        int max = 0;
        int sum = arr[left];
        while( right < arr.length){
            right++;
            if(right < arr.length){
                sum += arr[right];
            }
            if(sum == k){
                max = Math.max(max , right-left+1);
            }
            while(left <= right && sum > k){
                sum -= arr[left];
                left++;
            }
        }
        System.out.println("The Longest Subaaray is this " + max);
    }
    // Longest Subarray with sum zero
    public static void longest_subarray(int arr[]){
        int n = arr.length;
        int max = 0;
        HashMap<Integer , Integer> map = new HashMap<>();
        int sum = 0;
        for(int i = 0; i<n; i++){
            sum += arr[i];
            
            if(sum == 0){
                max = i+1;
            }else if(map.containsKey(sum)){
                max = Math.max(max , i-map.get(sum));
            }else{
                map.put(sum , i);
            }
        }
        System.out.print("The Longest Subarray With Sum Zero is this " +max);
    }
    public static void main(String[] args){
        int arr[] = {10 , 5 , 2, 7, 1, 9};
        int n = 15;
        longest_subarray(arr , n);
        int nums[] = {9 , -3 , 3 , -1 , 6 , -5};
        longest_subarray(nums);
    }
}