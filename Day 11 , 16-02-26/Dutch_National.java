public class Dutch_National {
        public static void sort_Array(int arr[]) {
            int z = 0;
            int o = 0;
            int t = 0;
            for (int i = 0; i < arr.length; i++) {
                if (z == arr[i])
                    z++;
                if (o == arr[i])
                    o++;
                if (t == arr[i])
                    t++;
            }
            for (int i = 0; i < z; i++) {
                arr[i] = 0;
            }
            for (int i = z; i < z + o; i++) {
                arr[i] = 1;
            }
            for (int i = z + o; i < arr.length; i++) {
                arr[i] = 2;
            }
            for (int i : arr) {
                System.out.print(i + " ");
            }
        }

        public static void swap(int arr[], int i, int j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

    public static void Dutch_National_Flag_Algo(int arr[]){
        int low = 0;
        int mid = 0;
        int high = arr.length-1;
        while(mid <= high){
            if(arr[mid] == 0){
                swap(arr , low , mid);
                low++;
                mid++;
            }
            else if(arr[mid] == 1){
                mid++;
            }
            else{
                swap(arr, mid , high);
                high--;
            }
        }
        for(int i : arr){
            System.out.print(i+" ");
        }
    }

        public static void main(String[] args) {
            int n[] = { 1, 2, 0, 2, 2, 1, 2, 1, 0, 2, 1, 0, 1, 2, 0 };
            // sort_Array(n);
            Dutch_National_Flag_Algo(n);
    }
}
