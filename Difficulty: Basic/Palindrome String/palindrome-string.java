class Solution {
    boolean isPalindrome(String s) {
        int l = s.length();
        if (l == 0 || l==1) return true;
        int  i = 0 ; int j =l-1;
        while(i<=j){
            if (s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;j--;
        }
        return true;
    }
}