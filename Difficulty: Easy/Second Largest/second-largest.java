class Solution {
    public int getSecondLargest(int[] arr) {
        int largest = -1;
        int slargest = -1 ;
      //  int cout =0 ;
       for(int i=0; i<arr.length; i++){
           if(largest < arr[i]){
               slargest = largest;
               largest = arr[i];
           }
           else if(largest > arr[i] && slargest < arr[i]){
               slargest = arr[i];
           }
        
       }
        return slargest;
    }
}