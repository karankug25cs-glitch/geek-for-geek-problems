class Solution {
    public ArrayList<Integer> intersect(int[] a, int[] b) {
        ArrayList<Integer> res = new ArrayList<>();
        Set<Integer> sa = new HashSet<> ();
        for(int it : a){
            sa.add(it);
        }
        for(int ii : b){
            if(sa.contains(ii)){
                res.add(ii);
                sa.remove(ii);
            }
        }
        
        return res;
    }
}