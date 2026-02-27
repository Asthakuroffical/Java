import java.util.*;
public class Main{
    public static void binarySearch(int arr[] , int tar){
        int left = 0;
        int right = arr.length-1;
        boolean istrue = false;
        while(left <= right){
            int mid = (left+right)/2;
            if(arr[mid] == tar){
                System.out.print("Target Found At This Index "+ mid);
                istrue = true;
                return;
            }else if(arr[mid] > tar){
                right = mid-1;
            }else{
                left = mid+1;
            }
        }
        if(!istrue){
            System.out.print("Not Found");
        }
    }
    public static void reverseArray(int arr[]){
        int left = 0;
        int right = arr.length-1;
        while(left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        for(int i : arr){
            System.out.print(i+" ");
        }
    }
    public static void pair(int arr[]){
        for(int i = 0; i<arr.length; i++){
            for(int j = i+1; j<arr.length; j++){
                System.out.print("("+arr[i]+","+arr[j]+")");
            }
            System.out.println();
        }
    }
    public static void subarray(int arr[]){
        int sum =0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i<arr.length; i++){
            for(int j = i; j<arr.length; j++){
                sum = 0;
                for(int k = i; k<=j; k++){
                    System.out.print(arr[k]+" ");
                    sum +=arr[k];
                }
                if(sum < min){
                    min = sum;
                }
                max = Math.max(sum , max);
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Maximum Subarray sum is this one "+ max);
        System.out.println("Minimum Subarray sum is this one "+ min);
    }
    public static void kadanes(int arr[]){
        int max = 0;
        int currsum = 0;
        for(int i : arr){
            currsum += i;
            if(currsum < 0){
                currsum = 0;
            }
            max = Math.max(max , currsum);
        }
        System.out.print(max);
    }
    public static void trappingRainWater(int arr[]){
        int n = arr.length;
        // step 1 for left
        int left[] = new int[n];
        left[0] = arr[0];
        for(int i = 1; i<n; i++){
            left[i] = Math.max(left[i-1],arr[i]);
        }
        // step 2 find right 
        int right[] = new int[n];
        right[n-1] = arr[n-1];
        for(int i = n-2; i>=0; i--){
            right[i] = Math.max(right[i+1] , arr[i]);
        }
        // find waterleve;
        int maxwater = 0;
        for(int i = 0; i<n; i++){
            int currwater = Math.min(left[i] , right[i]);
            maxwater += currwater-arr[i];
        }
        System.out.print("Maximum trap water "+ maxwater);
    }
    public static void bestTimeToBuyAndSellStocks(int stock[]){
       int buyprice = Integer.MAX_VALUE;
       int max = 0;
       for(int i = 0; i<stock.length; i++){
           if(buyprice < stock[i]){
               int profit = stock[i] - buyprice;
               max = Math.max(max , profit);
           }else{
               buyprice = stock[i];
           }
       }
       System.out.print("Maximum profit is "+ max);
    }
    public static void spiralMatrix(int matrix[][]){
        int n = matrix.length; 
        int m = matrix[0].length;
        int rs = 0;
        int re = n-1;
        int cs = 0;
        int ce = m-1;
        while(rs <= re && cs <= ce){
            // top
            for(int i = rs;i<=ce; i++){
                System.out.print(matrix[rs][i]+"->");
            }
            // right
            for(int i = rs+1; i<=re; i++){
                System.out.print(matrix[i][ce]+"->");
            }
            if(cs!=ce){
                for(int i = ce-1;i>=cs; i--){
                    System.out.print(matrix[re][i]+"->");
                }
            }
            if(rs!=re){
                for(int i = re-1;i>=rs+1; i--){
                    System.out.print(matrix[i][cs]+"->");
                }
            }
            rs++;
            re--;
            cs++;
            ce--;
        }
    }
    public static void daigonalSum(int arr[][]){
        int firstSum = 0;
        int secondSum =0;
        for(int i = 0; i<arr.length; i++){
               firstSum += arr[i][i];
               if(i != arr.length-1-i){
               secondSum += arr[i][arr.length-1-i];
               }
        }
        System.out.print(firstSum + secondSum);
    }
    public static void searchInSortedMatrix(int arr[][]){
        int tar = 32;
        int i = 0;
        int j = arr.length-1;
        while(i <= arr.length && j >=0){
            if(arr[i][j] == tar){
                System.out.print("Found At this index "+ i+" "+j);
                return;
            }
            if(arr[i][j] > tar){
                j--;
            }else{
                i++;
            }
        }
        System.out.print("Not Found");
        return;
    }
        public static void searchInBot_To_Top(int arr[][]){
        int tar = 40;
        int i = arr.length-1;
        int j = 0;
        while(i >=0 && j <arr[0].length){
            if(arr[i][j] == tar){
                System.out.print("Found At this index "+ i+" "+j);
                return;
            }
            if(arr[i][j] > tar){
                i--;
            }else{
                j++;
            }
        }
        System.out.print("Not Found");
        return;
    }
    public static void main(String[] args){
        // 
        int arr[] = {1 , 2, 3, 4, 5, 6};
        int nums[] = {1 , -2 , 0 , 2, -1 , 6 , -2, 3};
        int trap[] = {4,2,0,6,3,2,5};
        int stock[] = {6 , 1, 4, 2 , 7, 5};
        int matrix[][] = {
            {1, 2, 3},
            {4 , 5, 6},
            {7 , 8, 9}
        };//1 -> 2-> 3-> 6>9>8->7->4->5
        int sort[][]={
            {10 , 20 , 30 , 40},
            {15 , 25 , 35 , 45},
            {27 , 29 , 37 , 48},
            {32 , 33 , 39 , 50}
        };
        // binarySearch(arr , 5);
        // reverseArray(arr);
        // 123 (1 , 2 ) , (1 , 3), (2,3)
        // pair(arr); 
        // 123 (1)(1 , 2)( 1 ,2 , 3)
        // subarray(arr);
        // kadanes(nums);
        // trappingRainWater(trap);
        // bestTimeToBuyAndSellStocks(stock);
        // spiralMatrix(matrix);
        // daigonalSum(matrix);
        // searchInSortedMatrix(sort);
        // searchInBot_To_Top(sort);
    }
}