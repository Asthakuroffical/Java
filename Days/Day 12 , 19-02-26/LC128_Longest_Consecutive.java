class Solution {  
    public int longestConsecutive(int[] arr) {
        int n = arr.length;
        // base case 
        if(n == 0){
            return 0;
        }
        Arrays.sort(arr);
         // 1 , 2, 3, 4, 100 , 200 

        int ls = Integer.MIN_VALUE;
        int cnt =0;
        int longest = 1;
        for(int i = 0; i<n; i++){
            if(arr[i]-1 == ls){ // 2-1 == 1 , 3-1 = 2,  4-1 == 3 , 99 == 4 , 199 == 99 
            cnt++;  //1 , 2,  3 , 4
            ls = arr[i];  // 2, 3, 4
            }else if(arr[i] != ls){  //, 99 != 4 , cnt =1 , 199 != 99 , cnt = 1 , ls = 199;
                cnt = 1;
                ls = arr[i]; // 99
            }
            longest = Math.max(longest , cnt); // 4 
        }
        return longest;
    }
}