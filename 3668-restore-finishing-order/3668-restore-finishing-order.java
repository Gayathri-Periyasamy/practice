class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        Set<Integer>friendset=new HashSet<>();
        for(int f:friends){
            friendset.add(f);
        }
        List<Integer>result=new ArrayList<>();
        for(int o:order){
            if(friendset.contains(o)){
                result.add(o);
            }
        }
        int []arr=new int[result.size()];
        for(int i=0;i<result.size();i++){
            arr[i]=result.get(i);
        }
        return arr;
    }
}