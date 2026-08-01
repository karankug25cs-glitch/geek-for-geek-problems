class Solution {
    public static int gcd(int a, int b) {
        int hcf = 1;
        while (a >0 && b>0){
            if(a>b) a = a%b;
            else b = b%a;
            if(a == 0) hcf = b;
            else hcf =a;
        }
        return hcf;
    }
}
