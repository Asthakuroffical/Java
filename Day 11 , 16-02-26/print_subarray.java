import java.util.*;

public class print_subarray {
    public static int Kadanes(int arr[]) {
        int cs = 0;
        int ms = Integer.MIN_VALUE;
        int substart = 0;
        int subend = 0;
        int start = 0;
        for (int i = 0; i < arr.length; i++) {
            
            cs += arr[i];
            if (cs > ms) {
                ms = cs;
                substart = start;
                subend = i;
            }
            if (cs < 0) {
                cs = 0;
                start = i+1;
            }
        }
        System.out.println(substart);
        System.out.println(subend);
        return ms;
    }

    public static void main(String[] args){
        int arr[] = {-2  , -3 , 4 , -1  , -2, 1, 5, -3};
        System.out.print("The Maximum SubArray is this " + Kadanes(arr));
    }
}