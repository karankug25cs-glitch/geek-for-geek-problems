import java.util.*;
class Solution {
    public List<List<Integer>> getSubArrays(int[] arr) {
        List<List<Integer>> ls = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            for(int j=i ; j<arr.length;j++){
                List<Integer> temp = new ArrayList<>();
                for(int k=i; k<=j; k++){
                    temp.add(arr[k]);
                }
                ls.add(temp);
            }
        }
        return ls;
    }
}