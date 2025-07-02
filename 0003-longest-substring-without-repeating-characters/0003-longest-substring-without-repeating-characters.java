public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        
        for (int i = 0; i < s.length(); i++) {
            String current = "";
            for (int j = i; j < s.length(); j++) {
                char c = s.charAt(j);
                if (current.indexOf(c) != -1) {
                    break;
                } else {
                    current += c;
                    maxLength = Math.max(maxLength, current.length());
                }
            }
        }

        System.out.print(maxLength);
        return maxLength;
    }
}
    



 