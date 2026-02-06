import java.util.*;
public class Main
{
    public static void spiralmatrix(int arr[][]){
        int rowStart = 0;
        int rowEnd = arr.length-1;
        int colStart = 0;
        int colEnd = arr[0].length-1;
        
        while(rowStart <= rowEnd && colStart <= colEnd){
            // top 
            for(int i = colStart; i<=colEnd; i++){
                System.out.print(arr[rowStart][i]+" ");
            }
            
            // right 
            for(int i = rowStart+1; i<=rowEnd; i++){
                System.out.print(arr[i][colEnd]+" ");
            }
            
            // bottom
            if(rowStart < rowEnd){
                for(int i = colEnd-1; i>=colStart; i--){
                    System.out.print(arr[rowEnd][i]+" ");
                }
            }
            
            // left 
            if(colStart < colEnd){
                for(int i = rowEnd-1; i>=rowStart; i--){
                    System.out.print(arr[i][colStart]+" ");
                }
            }
            
            rowStart++;
            rowEnd--;
            colStart++;
            colEnd--;
        }
        System.out.println();
        
    }
    public static void daigonalSum(int arr[][]){
        int sum = 0;
        for(int i = 0; i<arr.length; i++){
            sum += arr[i][i];
            int j = arr.length-i-1;
            if(i != j){
                sum += arr[i][j];
            }
        }
        System.out.println("The daigonalSum sum is this "+ sum);
    }
    public static void Search_in_top_to_bottom(int arr[][]){
        int target = 33;
        int i = 0;
        int j = arr[0].length-1;
        boolean isture = false;
        
        while(i < arr.length && j <arr[0].length){
            int sum = arr[i][j];
            if(sum == target){
                System.out.println("Found at this index "+i+","+j);
                isture = true;
                return;
            }
            else if(target > sum){
                i++;
            }else{
                j--;
            }
        }
        System.out.println(isture);
    }
    public static void Search_in_bottom_to_top(int arr[][]){
        int target = 47;
        int i = arr.length-1;
        int j = 0;
        boolean isture = false;
        while(i < arr.length && j< arr[0].length){
            int sum = arr[i][j];
            if(sum == target){
                isture = true;
                System.out.println("Found at this index " + i+","+j);
                return;
            }
            else if(sum > target){
                i--;
            }else{
                j++;
            }
        }
        if(!isture){
            System.out.println("Unable to find Number not exsist");
        }
    }
    public static void transpose_Matrix(){
        int arr[][] = {
            {1 , 2, 3},
            {4  , 5, 6}
        };
        int transpose[][] = new int[arr[0].length][arr.length];
        
        for(int i = 0; i<arr.length; i++){
            for(int j =0; j<arr[0].length; j++){
                transpose[j][i] = arr[i][j];
            }
        }
        
        for(int i = 0; i<transpose.length; i++){
            for(int j = 0; j<transpose[0].length; j++){
                System.out.print(transpose[i][j]+" ");
            }
        }
        System.out.println();
        System.out.print(Arrays.deepToString(transpose));
    }
	public static void main(String[] args) {
	    int arr[][] = {
	        {1 ,2 , 3, 4},
	        {5 ,6, 7, 8},
	        {9 , 10 , 11 , 12},
	        {13 , 14 , 15 , 16}
	    };
	    int nums[][] = {
	        {10 , 20 , 30 , 40},
	        {15 , 25 , 35 , 45},
	        {27 , 37 , 47 , 57},
	        {32, 42 , 52 , 62}
	    };
		spiralmatrix(arr);
		daigonalSum(arr);
		Search_in_top_to_bottom(nums);
		Search_in_bottom_to_top(nums);
		transpose_Matrix();
	}
}