class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<String,Integer> map=new LinkedHashMap<>();
        Map<String,Integer> map1=new LinkedHashMap<>();
        for(int i=0;i<list1.length;i++){
            map.put(list1[i],i);
        }
        for(int i=0;i<list2.length;i++){
            if(map.containsKey(list2[i])){
            map1.put(list2[i],i);
            }
        }
        Map<String,Integer> res=new LinkedHashMap<>();
        int min=Integer.MAX_VALUE;
        for(String s:map1.keySet()){
           int n=(int)map.get(s)+map1.get(s);
           res.put(s,n);
           if(min>n){
            min=n;
           }
        }
        List<String> arr=new ArrayList<>();
        for(String k:res.keySet()){
            if(min==res.get(k)){
                arr.add(k);
            }
        }
        return arr.toArray(new String[0]);
    }
}