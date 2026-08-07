import java.util.*;
class Solution {
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        int n1 = a.length;
        int n2 = b.length;
        Set<Integer> s = new TreeSet<>();
        for(int i=0;i<n1;i++){
            s.add(a[i]);
        }
        for(int i=0; i<n2;i++){
            s.add(b[i]);
        }
        return new ArrayList<>(s);
    }
}
