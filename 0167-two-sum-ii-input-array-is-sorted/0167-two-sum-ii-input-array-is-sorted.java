
        class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n=numbers.length;
        int i=0;
        int j=n-1;
        while(numbers[i]+numbers[j]!=target){
            if(numbers[i]+numbers[j]>target){
                j--;
            }
            else
            i++;
        }
        return  new int[]{i+1,j+1};
        
    }
}
    