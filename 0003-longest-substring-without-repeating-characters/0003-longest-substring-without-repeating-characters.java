class Solution {
    public int lengthOfLongestSubstring(String s) {
       Set<Character>group= new HashSet<>();
       int max=0 ;int j=0;
       
        for(int i=0;i<s.length();i++){
        while(!group.add(s.charAt(i))){
            group.remove(s.charAt(j++));
        } 
         max=Math.max(max,i-j+1);
        }
  return max;        
    }
}