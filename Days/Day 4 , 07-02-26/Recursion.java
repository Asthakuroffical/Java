public class Recursion{
     
    public static boolean check(int i , String s){
        // base case 
        if(i >= s.length()/2){
            return true;
        }
        // kaam 
        if(s.charAt(i) != s.charAt(s.length()-i-1)){
            return false;
        }
        // repeat this loop with increase index 
        return check(i+1 , s);
    }
    public static void main(String[] args){
        String s ="MadaM";
        System.out.print(check(0 , s));
    }
}