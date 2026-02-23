class Solution {
    public int longestPalindrome(String s) {
    int []freq=new int[128];
    for(char c:s.toCharArray()) ++freq[c];
    int oddgroup=0;
    for(int i:freq) oddgroup+=i&1;
    return s.length()-oddgroup+(oddgroup>0?1:0);    
    }
}