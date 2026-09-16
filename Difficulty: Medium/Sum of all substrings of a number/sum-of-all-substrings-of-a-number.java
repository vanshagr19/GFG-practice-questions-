class Solution {
    public static int sumSubstrings(String s) {
        int n = s.length();
        int sum =0;
        for (int i = 0 ; i<n;i++){
            for (int j = i ; j < n ; j++){
                int sub = Integer.parseInt(s.substring(i,j+1));
                sum = sum + sub;
            }
        }
        return sum;
    }
}