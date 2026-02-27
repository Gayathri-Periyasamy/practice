class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
     int totalsum=0;
     for(int i=0;i<arr.length;i++){
        totalsum+=arr[i];
     }   
     if(totalsum%3!=0){
        return false;
     }
     int currentsum=0;
     int count=0;
     for(int i=0;i<arr.length;i++){
        currentsum+=arr[i];
        if(currentsum==totalsum/3){
            count++;
            currentsum=0;
            if(count==2&&i<arr.length-1)
            return true;
        }
     }
     return false;
    }
}