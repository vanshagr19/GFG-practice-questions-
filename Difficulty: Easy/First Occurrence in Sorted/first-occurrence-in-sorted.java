class Solution {
	public int firstSearch(int[] arr, int k) {
		// Code Here
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
}
