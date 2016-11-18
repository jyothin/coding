package twosums;

public class Solution {
    public int[] twoSum2(int[] numbers, int target) {
    	
    	if (numbers.length == 0) {
    		return new int[] {0, 0};
    	}
        
    	for (int i=0; i<numbers.length; i++) {
    		for (int j=i+1; j<numbers.length; j++) {
    			if (numbers[i]+numbers[j] == target) {
    				return new int[] {i+1, j+1};
    			}
    		}
    	}
    	
    	return new int[] {0, 0};
    }
    
    public int[] twoSum1(int[] numbers, int target) {
        int start = 0, end = numbers.length - 1;
        while(start < end){
            if(numbers[start] + numbers[end] == target) break;
            if(numbers[start] + numbers[end] < target) start++;
            else end--;
        }
        return new int[]{start + 1, end + 1};
    }
    
    public int[] twoSum(int[] num, int target) {
        int[] indice = new int[] {1, 1};
        if (num.length < 2) { return indice; }
        int left = 0;
        int right = num.length - 1;
        while (left < right) {
            int v = num[left] + num[right];
            if (v == target) {
                indice[0] = left + 1;
                indice[1] = right + 1;
                break;
            } else if (v > target) {
                right--;
            } else {
                left++;
            }
        }
        return indice;
    }
}
