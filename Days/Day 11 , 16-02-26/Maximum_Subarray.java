public class Maximum_Subarray {
    public static int Kadanes(int arr[]){
     int cs =0;
     int ms = Integer.MIN_VALUE;
     for(int i =0; i<arr.length; i++){
        cs += arr[i];
        ms = Math.max(cs, ms);
        if(cs < 0){
            cs = 0;
        }
        
     }
     return ms;
    }
    public static void main(String[] args){
        int arr[] = {-2  , -3, 4 , -1  , -2, 1, 5, -3};
        System.out.print("The Maximum SubArray is this " + Kadanes(arr));
    }
}
