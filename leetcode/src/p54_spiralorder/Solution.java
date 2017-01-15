package p54_spiralorder;

import java.util.List;
import java.util.ArrayList;

public class Solution {
	public List<Integer> spiralOrder(int[][] matrix) {
	    List<Integer> l = new ArrayList<Integer>();
	    
        if (matrix.length == 0) {
        	return l;
        }
        
        int rows = matrix.length;
        int cols = matrix[0].length;
        
        //System.out.println(rows);
        //System.out.println(cols);
        
        circulate(l, matrix, 0, rows-1, 0, cols-1);
        
        return l;

    }

	public void circulate(List<Integer> l, int[][] matrix, int startRow, int endRow, int startCol, int endCol) {
		
		System.out.println(startRow+":"+endRow+":"+startCol+":"+endCol);
		
		if (startRow > endRow || startCol > endCol) {
			return;
		}
		
    	int row = startRow;
    	int col = startCol;
		//System.out.println(row+":"+col);
    	while (col <= endCol) {
    		l.add(matrix[row][col]);
    		col++;
    	}
    	
    	row = startRow+1;
    	col = endCol;
		//System.out.println(row+":"+col);
    	while (row <= endRow) {
    		l.add(matrix[row][col]);
    		row++;
    	}
    	
    	row = endRow;
    	col = endCol-1;
		//System.out.println(row+":"+col);
    	while (col >= startCol) {
    		if (startRow < endRow) {
	    		l.add(matrix[row][col]);
    		}
    		col--;
    	}
    	
    	row = endRow-1;
    	col = startCol;
		//System.out.println(row+":"+col);
    	while (row >= startRow+1) {
    		if (startCol < endCol) {
    			l.add(matrix[row][col]);
    		}
    		row--;
    	}
    	
    	circulate(l, matrix, startRow+1, endRow-1, startCol+1, endCol-1);
    }
}
