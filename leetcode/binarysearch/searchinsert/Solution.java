package searchinsert;

public class Solution {
    public int searchInsert1(int[] nums, int target) {
    	
    	// loop till l == u
    	// adjust l or u depending if target is < or >
    	// return index
    	
    	int l=0;
    	int u=nums.length;
    	int m = -1;
    	while (l < u) {
    		m = l + (u-l)/2;
    		//System.out.println(l+":"+m+":"+u);
    		if (target == nums[m]) { break; }
    		if (target < nums[m]) {
    			u = m;
    		} else {
    			l = m+1;
    		}
    	}
    	
    	if (target == nums[m]) { return m; }
    	else { return l; }
        
    }
    
    public int searchInsert(int[] A, int target) {
        
        if(A.length == 0)return 0;
        
        int left = 0, right = A.length - 1;
        int mid = 0;
        
        while(left <= right){
            
            if(target<A[left])return left;
            if(target>A[right])return right+1;
            
            mid = (left+right)/2;
            
            if(A[mid]==target)return mid;
            else if(target < A[mid]){
                right = mid-1;
            }else{
                left = mid +1;
            }
            
        }
        return -1;
        
        
    }
}
