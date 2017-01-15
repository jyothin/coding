package p121_maxprofit;

public class Solution {
    public int maxProfit(int[] prices) {
    	
    	if (prices.length == 0) { return 0; }
    	
    	int minIndex = 0;
    	int maxIndex = 0;
    	
    	for (int i=1; i<prices.length; i++) {
    		minIndex = (prices[i] < prices[minIndex]? i: minIndex);
    		if (prices[maxIndex] < prices[i]) {
    			maxIndex = i;
    		}
    		if (maxIndex < minIndex) {
    			maxIndex = i;
    		}
    	}
    	
    	return prices[maxIndex] - prices[minIndex];
    }
    
    public int maxProfit2(int[] prices) {
		 if (prices.length == 0) {
			 return 0 ;
		 }		
		 int max = 0 ;
		 int sofarMin = prices[0] ;
	     for (int i = 0 ; i < prices.length ; ++i) {
	    	 if (prices[i] > sofarMin) {
	    		 max = Math.max(max, prices[i] - sofarMin) ;
	    	 } else{
	    		sofarMin = prices[i];  
	    	 }
	     }	     
	    return  max ;
	 }
    
}
