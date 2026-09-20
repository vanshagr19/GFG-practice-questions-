class Solution {
    int search(int[] arr, int key) {
        // code here
        int n = arr.length;
        int st = 0 ;
        int end  = n-1;
        while(st <= end ){
            int mid = st+(end-st)/2;
            if (arr[mid] == key) return mid;
            else if(arr[mid] >= arr[st]){
                if (key >= arr[st] && key < arr[mid] ){
                    end = mid -1 ;
                }
                else{
                    st = mid+1;
                }
            }
            else{
                if (key > arr[mid] && key <= arr[end] ){
                    st = mid +1 ;
                }
                else{
                    end = mid-1;
                }
            }
        }
        return -1;
    }
}