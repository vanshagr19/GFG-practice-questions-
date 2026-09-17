class Solution {
    public int first(int arr[] , int k){
        int n = arr.length;
				int ans = -1;
				int st = 0 ;
				int end = n - 1;
				while (st <= end) {
					int mid = st + (end - st)/2;
					if (arr[mid] == k) {
						ans = mid ;
						end = mid - 1;
					}

					else if (arr[mid] >k) {
						end = mid - 1;
					}
					else {
						st = mid + 1;
					}
				}
				return ans;
    }
    
     public int last(int arr[] , int k){
         int n = arr.length;
				int ans = -1;
				int st = 0 ;
				int end = n - 1;
				while (st <= end) {
					int mid = st + (end - st)/2;
					if (arr[mid] == k) {
						ans = mid ;
						st = mid +1;
					}

					else if (arr[mid] >k) {
						end = mid - 1;
					}
					else {
						st = mid + 1;
					}
				}
				return ans;
     } 
    ArrayList<Integer> find(int arr[], int x) {
        // code here
        ArrayList<Integer> ans= new ArrayList<>();
        ans.add(first(arr,x));
        ans.add(last(arr,x));
        return ans;
    }
}
