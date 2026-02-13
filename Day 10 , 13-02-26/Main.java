// package Day 10 , 13-02-26;

import java.util.*;
public class Main{
    public static void largest_Element(int arr[]){
        // TC = O(n);
        // SC = O(1);
        int j = arr[0];
        for(int i =1; i<arr.length; i++){
            if(j < arr[i]){
                j = arr[i];
            }
        }
        System.out.println("The maximum number is this "+j);
    }
    public static void second_largest_brute(int arr[]){
        // TC O(2n);
        // SC O(1);
        // find the largest ELement first
        int x = arr[0];
        for(int i = 1; i<arr.length; i++){
            if(x < arr[i]){
                x = arr[i];
            }
        }
        // find the second element
        int s = -1;
        for(int i = arr.length-1; i>=0; i--){
            if(arr[i] != x && s < arr[i]){
                s = arr[i];
            }
        }
         System.out.println("The Second The largest Element is this " + s);
    }
    public static void second_largest(int arr[]){
        // TC = O(n);
        // SC = O(1)
        int l = arr[0];
        int s = -1;
        for(int i =1; i<arr.length; i++){
            if(l < arr[i]){
                s = l;
                l = arr[i];
            }else if( s < arr[i] && l != arr[i]){
                s = arr[i];
            }
        }
        System.out.println("The Second The largest Element is this " + s);
    }
    public static void check_arr_isSorted_Or_Not(int arr[]){
        // TC O(n)
        // SC O(1);
        boolean istrue = true;
        for(int i = 0; i<arr.length-1; i++){
            if(arr[i] > arr[i+1]){
                istrue = false;
                break;
            }
        }
        System.out.println("This array is sorted or not "+ istrue);
    }
    public static void remove_Duplicate_From_Sorted_arr_brute(int arr[]){
        // Brute Force  TC : O(N) , SC O(N)
        HashSet<Integer> st = new HashSet<>();
        for(int i = 0; i<arr.length; i++){
            st.add(arr[i]);
        }
        System.out.println(st);
    }
    public static void remove_Duplicate_From_Sorted_arr_Optimal(int arr[]){
        // Optimal : TC: O(n) , SC : O(1);
        int officer = 0;
        // int cm = 1;
       for(int i =1; i<arr.length; i++){
            if(arr[i] != arr[i-1]){
                arr[officer+1] = arr[i];
                officer++;
            }
        }
        System.out.print("The Total Number Of Unique number is this " + (officer+1));
    }
    public static void left_rotate_array_by_one(){
        // brute force TC : O(n) , SC : O(1)
        int arr[] = {1 , 2, 3, 4, 5};
        int j = arr[0];
        
        for(int i = 1; i<arr.length; i++){
            arr[i-1] = arr[i];
        }
        arr[arr.length-1] = j;
        System.out.println("The rotate array by one place is this");
        for(int i : arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static void left_rotate_array_by_d_place(int d){
        int arr[] = {1 , 2, 3, 4, 5 ,6, 7, 8};
        int n = arr.length;
        // step 1 make a modulo of d with arr.length
        d = d%n;
        // step 2 make a temp array according size of d 
        int temp[] = new int[d];
        
        // step 3 upto d indexing assing element in temp array
        for(int i = 0; i<d; i++){
            temp[i] = arr[i];
        }
        // step 4 shift original array 
        for(int i = d; i<n; i++){
            arr[i-d] = arr[i];
        }
        // step 5 add temp element to original array 
        for(int i = n-d; i<n; i++){
            arr[i] = temp[i-(n-d)];
        }
        // step 6 print original array
        for(int i : arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static void swap(int i , int j , int arr[]){
        while( i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    public static void left_rotate_array_by_d_place_optimal(int d){
        int arr[] = {1 , 2, 3, 4, 5, 6, 7 , 8};
        int n = arr.length-1;
        swap(0 , d-1 , arr);
        swap(d , n , arr);
        swap(0 , n , arr);
        
        for(int i : arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static void move_zeros_to_end(){
        // TC : O(N) , SC : O(N)
        int arr[] = {1 , 0 , 3, 4, 0 , 0 , 5, 3 , 0 , 0 , 0 , 3, 4};
        int n = arr.length;
        int cnt = 0;
        int j = 0;
        int temp[] = new int[arr.length];
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == 0){
                cnt++;
            }else{
                temp[j] = arr[i];
                j++;
            }
        }
        for(int i = n-cnt; i<arr.length;  i++){
            temp[i] = 0;
        }
        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
        for(int i : temp){
            System.out.print(i + " ");
        }
        System.out.println();
    }
    // public static void swap(int i , int j , int arr[]){
    //     while( i < j){
    //         int temp = arr[i];
    //         arr[i] = arr[j];
    //         arr[j] = temp;
    //         i++;
    //         j--;
    //     }
    // }
    public static void move_zeros_to_end_optimised(){
        // TC : O(n) , SC : O(1)
        int arr[] = {1 , 0 , 3,  4, 0 , 0 , 5, 3, 0 , 0 , 0, 3, 4};
        int j = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == 0){
                j = i;
                break;
            }
        }
        
        for(int i =j+1; i<arr.length; i++){
            if(arr[i] !=0){
                swap(i , j , arr);
                j++;
            }
        }
        System.out.println();
    }
    public static void Linear_Search(){
        int arr[] = {0 , 1 ,2 ,3, 4, 5,6};
        int n = 4;
        
        for(int i =0; i<arr.length; i++){
            if(arr[i] == n){
                System.out.println("Found At This Index "+ i);
            }
        }
    }
    public List<Integer> Union_Of_Two_Sorted_Brute(){
        // TC : O(m+n).log(m+n) . SC : O(m+n)
        int arr[] = {1  , 1 , 2, 3, 4, 4};
        int arr2[] = {2, 3, 3, 4,5, 5, 6};
        // it take TC: O(log n) SC: O(n)
        TreeSet<Integer> set = new TreeSet<>();
        
        for(int i = 0; i<arr.length; i++){
            set.add(arr[i]);
        }
        for(int i = 0;  i<arr2.length; i++){
            set.add(arr2[i]);
        }
        // Converting into ArrayList
        return new ArrayList<>(set);
    }
    public List<Integer> Union_Of_Two_Sorted_Optimal(){
        int arr[] = {1  , 1 , 2, 3, 4, 4};
        int arr2[] = {2, 3, 3, 4,5, 5, 6};
        
        ArrayList<Integer> list = new ArrayList<>();
        int i = 0;
        int j = 0;
        while( i < arr.length && j < arr2.length){
            if(arr[i] <=  arr2[j]){
                if(list.isEmpty() || list.get(list.size()-1) != arr[i]){
                    list.add(arr[i]);
                    i++;
                }else if(arr[i] > arr[j]){
        if(list.isEmpty() || list.get(list.size()-1) != arr2[j]){
                        list.add(arr2[j]);
                        j++;
                    }
                }else{
        if(list.isEmpty() || list.get(list.size()-1) != arr[i]){
                        list.add(arr[i]);
                        i++;
                        j++;
                    }
                }
            }
        }
        while( i < arr.length){
            if(list.isEmpty() || list.get(list.size()-1) != arr[i]){
                list.add(arr[i]);
                i++;
            }
        }
        while(j < arr2.length){
            if(list.isEmpty() || list.get(list.size() -1) != arr2[j]){
                list.add(arr[j]);
                j++;
            }
        }
         return list;
    }
    public static void main(String[] args){
    // int arr[] = { 1 ,2, 3, 4,5, 5};
    //     largest_Element(arr);
    //     second_largest_brute(arr);
    //     second_largest(arr);
    //     check_arr_isSorted_Or_Not(arr);
        //   int arr[] = {1 , 1, 2, 2, 2, 3 ,3 ,3 ,3 ,3, 4 , 4};
        // remove_Duplicate_From_Sorted_arr_brute(arr);
        // remove_Duplicate_From_Sorted_arr_Optimal(arr);
        left_rotate_array_by_one();
        left_rotate_array_by_d_place(4);
        left_rotate_array_by_d_place_optimal(4);
        move_zeros_to_end();
        move_zeros_to_end_optimised();
        Linear_Search();
        
        Main sol = new Main();
        List<Integer> result = sol.Union_Of_Two_Sorted_Brute();
        for(int i : result){
            System.out.print(i+" ");
        }
        
        List<Integer> listt = sol.Union_Of_Two_Sorted_Optimal();
        for(int i : listt){
            System.out.print(i+" ");
        }
    }
} 
