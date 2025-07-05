     class Solution {
    public int countSegments(String s) {
        String[]str=s.trim().split("\\s+");
        int count=0;
        for(int i=1;i<=str.length;i++){
            count++;
        }
     return s.trim().isEmpty() ? 0 : count;
    }
}
    