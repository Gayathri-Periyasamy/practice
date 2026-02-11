class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int n=image.length;
        int m=image[0].length;
        int res[][]=new int[n][m];
        int k=0;
        for(int arr[]:image){
            int h=0;
            for(int i=arr.length-1;i>=0;i--){
                if(arr[i]==1){
                    res[k][h++]=0;
                }
                else if(arr[i]==0){
                    res[k][h++]=1;
                }
            }
            k++;
        }
        return res;
    }
}