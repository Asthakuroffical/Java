import java.util.*;
public class Main {
    static int arr[] = { 1, 2, 3, 4, 5 };
    static int ar[] = {2 , 4, 6,8 , 10}; 
    static int sumb[] = {1 , -2, 6 , -1, 3};

    public static void linear_Search() {
        int tar = 4;

        for (int i = 0; i < arr.length; i++) {
            if (tar == arr[i]) {
                System.out.println("Found at this index " + i);
            }
        }
    }

    public static void largest_num() {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("The largest element is this " + max);
    }

    public static void binary_Search() {
        int tar = 4;

        int l = 0;
        int r = arr.length - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;

            if (arr[mid] == tar) {
                System.out.println("found at this index " + mid);
                return;
            }
            if (arr[mid] > tar) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        System.out.println("Element not found");
    }

    public static void swap() {
        int l = 0;
        int r = arr.length - 1;
        while (l <= r) {
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void pairs_In_Array(){
        for(int i = 0; i<ar.length; i++){
            for(int j = i+1; j<ar.length; j++){
              System.out.print("["+ar[i]+","+ar[j]+"]");
            }
            System.out.println();
        }
    }
    public static void sum_Array(){
        int totalsum = 0;
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i<sumb.length; i++){
            for(int j = i; j<sumb.length; j++){
                sum = 0;
                for(int k = i; k <=j; k++){
                    System.out.print(sumb[k]+" ");
                    sum += sumb[k];
                }
                if(sum > max){
                    max = sum;
                }
                if(min > sum){
                    min = sum;
                }
                System.out.print(" => "+sum);
                totalsum++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("The max sum is this "+ max);
        System.out.println("The min sum is this "+min);
        System.out.println("totalsum is this " + totalsum);
    }
    public static void prefix_Sum(){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int currSum = 0;
        
        
        int prefix[] = new int[sumb.length];
        prefix[0] = sumb[0];
        for(int i = 1; i<prefix.length; i++){
            prefix[i] = prefix[i-1]+arr[i];
        }
        
        for(int i = 0; i<sumb.length; i++){
            for(int j = i; j<sumb.length; j++){
                currSum = i == 0 ? prefix[j] : prefix[j] - prefix[i-1];
                if(currSum > max){
                    max = currSum;
                }
                if(currSum < min){
                    min = currSum;
                }
            }
        }
    }
    public static void Kadanes(){
        int cs = 0;
        int ms = Integer.MIN_VALUE;
        for(int i = 0; i<sumb.length; i++){
            cs = cs+sumb[i];
            if(cs < 0){
                cs = 0;
            }
            ms = Math.max(ms , cs);
        }
        System.out.print(ms);
    }
    public static void trapping_Rainwater(){
        int nums[] = {4 , 2 , 0 , 6,3,2, 5};
        int n = nums.length;
        //  step 1 left max 
        int left[] = new int[n];
        left[0] = nums[0];
        for(int i = 1; i<n; i++){
            left[i] = Math.max(left[i-1] , nums[i]);
        }
        // step 2 right max 
        int right[] = new int[n];
        right[n-1] = nums[n-1];
        for(int i = n-2; i>=0; i--){
            right[i] = Math.max(right[i+1] , nums[i]);
        }
        // step 3 min(left , right ) - waterlevel
        int totalwater = 0;
        for(int i = 0; i<n; i++){
            int waterlevel = nums[i];
            totalwater += Math.min(left[i] , right[i]) - waterlevel;
        }
        // print the total waterlevel
        System.out.println("The TotalWater Level is This " + totalwater);
    }
    public static void buy_sellStock(){
        int sell[] = {7, 1, 5 , 3,6,4};
        int buy=Integer.MAX_VALUE;
        int maxprofit = 0;
        for(int i = 0; i<sell.length; i++){
            if(buy<sell[i]){
                int profit = sell[i] - buy;
                maxprofit = Math.max(profit , maxprofit);
            }else{
                buy = sell[i];
            }
        }
        System.out.print("The MaxProfit is this "+ maxprofit);
    }
    public static void main(String[] args) {
        linear_Search();
        largest_num();
        binary_Search();
        swap();
        pairs_In_Array();
        sum_Array(); //continue part of array
        prefix_Sum();
        Kadanes();
        trapping_Rainwater();
        buy_sellStock();
    }
}