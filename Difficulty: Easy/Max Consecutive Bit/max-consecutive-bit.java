class Solution {
    public int maxConsecBits(int[] arr) {
        if(arr.length == 0 ) return 0;
        int count = 1 ;
        int maxcount = 0;
        int n = arr.length;
        for(int i = 1;i<n ; i++){
            if(arr[i] == arr[i-1]){
                count++;
            }
            else {
                maxcount = Math.max(maxcount, count);
                count = 1;
            }
        }
        return Math.max(maxcount, count);
    }
}
