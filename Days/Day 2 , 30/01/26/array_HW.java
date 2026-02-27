import java.util.*;
public class array_HW{
    public static void question1(){
        int arr[] = {1 ,2 ,3 ,6};
        HashSet<Integer> set = new HashSet<>();
        boolean bol = false;
        for(int i = 0; i<arr.length; i++){
            if(set.contains(arr[i])){
                bol = true;
                break;
            }else{
                set.add(arr[i]);
            }
        }
        System.out.println(bol);
    }
    public static void question2(){
        int tar = 4;
        int arr[] = {2 ,3 ,4, 5, 0 , 1};
        int l = 0;
        int r = arr.length-1;
        
        while(l < r){
            int mid = l+(r-l)/2;
            
            if(arr[mid] == tar){
                System.out.println("Found at this index "+ mid);
                return;
            }
            if(arr[l] < arr[mid]){
                if(arr[l] < tar && tar < arr[mid]){
                    r = mid-1;
                }else{
                    l = mid+1;
                }
            }else{
                if(arr[mid] < tar && tar < arr[r]){
                    l = mid+1;
                }else{
                    r = mid-1;
                }
            }
        }
    }
    public static void question3(){
        int buy_In_min = Integer.MAX_VALUE;
        int maxBuy = 0;
        int arr[] = {7 , 1,5 , 3, 6 ,4};
        for(int i = 0; i<arr.length; i++){
            if(buy_In_min < arr[i]){
                int profit = arr[i] - buy_In_min;
                maxBuy = Math.max(profit , maxBuy);
            }else{
                buy_In_min = arr[i];
            }
        }
        System.out.println("The total profit is this "+ maxBuy);
    }
    public static void question4(){
        int height[] = {0, 1, 0,  2, 1, 0, 1, 3, 2, 1, 2, 1};
        int n = height.length;
        // 4 step to solve this question
        // step1 find left max Array
        
        int left[] = new int[n];
        left[0] = height[0];
        for(int i = 1; i<n; i++){
            left[i] = Math.max(height[i] ,left[i-1]);
        }
        // step2 find the right max Array
        int right[] = new int[n];
        right[n-1] = height[n-1];
        for(int i = n-2; i>=0; i--){
            right[i] = Math.max(right[i+1] , height[i]);
        }
        // step 3 find heighlevel
        int totalwater = 0;
        for(int i=0; i<n; i++){
            int waterlevel = Math.min(left[i] , right[i]) - height[i];
            totalwater += waterlevel;
        }
        // step 4 print the storewater
        System.out.println("Total water level is this " +totalwater);
    }
    public static void question5(){
        int arr[] = {-1, 0, 1, 2, -1, -4};
        
        int n = arr.length; 
        //Use a Set to avoid duplicate triplets 
        Set<List<Integer>> set = new HashSet<>();
        // Triple nested loop → O(n³) 
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) { 
                for (int k = j + 1; k < n; k++) {
                    if (arr[i] + arr[j] + arr[k] == 0) {
                        List<Integer> triplet = Arrays.asList(arr[i], arr[j], arr[k]);
                        Collections.sort(triplet);  // sort to normalize order 
                        set.add(triplet); // add to set (removes duplicates) 
                    } 
                } 
            } 
        } // Convert back to list if needed 
        List<List<Integer>> result = new ArrayList<>(set);
        System.out.println(result);
        // System.out.print(set);
    }
    public static void main(String[] args){
        question1();
        question2();
        question3();
        question4();
        question5();
    }
}