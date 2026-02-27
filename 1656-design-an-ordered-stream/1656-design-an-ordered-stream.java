class OrderedStream {
    String [] arr;
    int curr,k=0;
    public OrderedStream(int n) {
        arr=new String[n];
        curr=0;
    }
    public List<String> insert(int idKey, String value) {
     arr[idKey-1]=value;
     if(idKey-1==curr) curr++;
     for(int i=curr;i<arr.length;i++){
        if(arr[i]==null)
        break;
        curr++;
     }  
     int temp=k;
     k=curr;
     return Arrays.asList(Arrays.copyOfRange(arr, temp, curr));
    }
}
