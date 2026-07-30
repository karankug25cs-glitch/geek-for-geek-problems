class Solution {
    public int getSecondLargest(int[] arr) {
       int max = Integer.MIN_VALUE;
       for(int i=0; i<arr.length; i++){
           if(max < arr[i])
                max = arr[i];
                
       }
       int smax = -1 ;
       int cout =0 ;
       for(int j=0; j<arr.length; j++){
           if(smax < arr[j] && arr[j] != max){
               smax = arr[j];
               cout++;
           }
       }
        if(cout == 0) return -1 ;
        else return smax;
    }
}