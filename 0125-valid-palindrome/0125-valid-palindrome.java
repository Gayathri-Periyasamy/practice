
        class Solution {
    public boolean isPalindrome(String s) {
       String res=s.replaceAll("[^A-Za-z0-9]","").toLowerCase();
       int l=0;
       int r=res.length()-1; 
       while(l<r){
        if(res.charAt(l)!=res.charAt(r)){
            return false;
        }
        l++;
        r--;
       }
       return true;
    }
}
        
    