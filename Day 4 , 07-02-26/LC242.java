// Anagram Code
class Solution {
    public boolean isAnagram(String s, String t) {
       if(s.length() != t.length()){
        return false;
       }
       int res[] = new int[26];
       for(int i=0; i<s.length(); i++){
         res[s.charAt(i)-'a']++;
         res[t.charAt(i)-'a']--;
       }
       for(int i : res){
        if(i>0){
          return false;
        }
       }
       return true;
    }
}
//  // lets check bydefault condition
//         if(s.length() != t.length()){
//             return false;
//         }
//         // now make a count array to contain
//         int count[] = new int[26];
//         for(int i = 0; i<s.length(); i++){
//             char ch = s.charAt(i);
//             char chh = t.charAt(i);
//             count[ch - 'a']++;
//             count[chh - 'a']--;
//         }
//         for(int c: count){
//             if(c > 0){
//                 return false;
//             }
//         }
//       return true;