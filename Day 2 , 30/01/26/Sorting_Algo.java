import java.util.*;
public class Sorting_Algo{
    static int arr[] = {6 , 3, 5,1 , 4, 2 };
    static int n = arr.length;
    public static void bubbleSort(){
        // Bubble Sort: Time → Best O(n), Avg/Worst O(n²), Space → O(1)
        // In bubbleSort Big Value come first 
        for(int i =0; i<n-1; i++){
            int swap = 0;
            for(int j = 0; j<n-1-i; j++){
                if(arr[j] < arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap++;
                }
            }
            // in best case when array is sorted we get O(n) TC
            if(swap == 0){
                break;
            }
        }
        print(arr);
    }
    public static void selectionSort(){
      // Selection Sort: Time → O(n²) (Best/Avg/Worst), Space → O(1)
        // in selectionSort small value fome first
        for(int i = 0; i<n-1; i++){
            int minpos = i;
            for(int j = i+1; j<n; j++){
                if(arr[minpos] > arr[j]){
                    minpos = j;
                }
            }
            int temp = arr[minpos];
            arr[minpos] = arr[i];
            arr[i] = temp;
        }
        print(arr);
    }
    public static void insertionSort(){

        // Insertion Sort: Time → Best O(n), Avg/Worst O(n²), Space → O(1)
        // we perform sorting using const time complexity 
        for(int i = 1; i<n; i++){
            int curr = arr[i];
            int prev = i-1;
            while( prev >=0 && arr[prev] > curr){
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1] = curr;
        }
        print(arr);
    }
    public static void countingSort(){
        // Counting Sort:  Time → O(n + k), Space → O(n + k)
        int max = Integer.MIN_VALUE;
        for(int i : arr){
            if(max < i){
                max = i;
            }
        }
        // creating new count using max+1 size 
        int count[] = new int[max+1];
        for(int i = 0; i<n; i++){
            count[arr[i]]++;
        }
        int j = 0;
        for(int i = 0; i<count.length; i++){
            while(count[i] >0){
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
        print(arr);
    }
    public static void print(int arr[]){
        
        for(int i : arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static void inbuiltSort(){
//     Inbuilt Sort:
//   - Primitives (Dual-Pivot QuickSort): Time O(n log n), Space O(log n)
//   - Objects (TimSort): Time → Best O(n), Avg/Worst O(n log n), Space O(n)

        int ar[] = {6 , 3, 5,1 , 4, 2 };
        
        Arrays.sort(ar , 0 , 4);
        print(ar);
        
        Integer arrr[] = {1 ,2 ,3 ,4 , 5,6};
        Arrays.sort(arrr ,0,3, Collections.reverseOrder());
        printt(arrr);
    }
     public static void printt(Integer arr[]){
        for(int i : arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    
    public static void main(String[] args){
        bubbleSort();
        selectionSort();
        insertionSort();
        countingSort();
        inbuiltSort();
    }
}
