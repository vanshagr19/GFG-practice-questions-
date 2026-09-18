class Solution {
    int floorSqrt(int n) {
        // code here
        if (n == 0) return 0;
        int st = 1 ;
        int end  = n;
        int ans = -1;
        while(st <= end ){
            int mid = st +(end-st)/2;
            if (mid*mid == n) return mid;
            else if(mid*mid > n){
                end =  mid-1;
            }
            else{
                ans = mid ;
                st = mid+1;
            }
        }
        return ans;
    }
}