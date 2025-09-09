class Solution {
    public String firstPalindrome(String[] words) {
     int n=words.length;
     for(String s:words){
        if(isPalin(s)){
            return s;
        }
     }
      return "";
    }
    static boolean isPalin(String s){
        int start=0;
        int end=s.length()-1;
        while(start<end){
            if(s.charAt(start)!=s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}