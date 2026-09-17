class Solution {
    public boolean binarySearch(int[] arr, int k) {
        // code here
        int n = arr.length;
        int ans = -1;
        int st = 0 ;
        int end = n-1;
        while(st<=end ){
            int mid  = st + (end-st)/2;
            if (arr[mid] ==k){
                return true;
            }
            else if(arr[mid] >k){
                end = mid-1;
            }
            else{
                st =mid+1;
            }
        }
        return false;
    }
}