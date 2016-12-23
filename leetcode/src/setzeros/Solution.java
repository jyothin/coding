package setzeros;

public class Solution {
    public void setZeroes(int[][] matrix) {
        
    	int rows = matrix.length;
    	if (rows == 0) {
    		return;
    	}
    	int cols = matrix[0].length;
    	
    	int[][] newMatrix = new int[rows][cols];
    	
    	for (int i=0; i<rows; i++) {
    		for (int j=0; j<cols; j++) {
    			newMatrix[i][j] = matrix[i][j];
    		}
    	}
    	
    	boolean[][] visited = new boolean[rows][cols];
    	for (int i=0; i<rows; i++) {
    		for (int j=0; j<cols; j++) {
    			visited[i][j] = false;
    		}
    	}
    
    	for (int i=0; i<rows; i++) {
    		for (int j=0; j<cols; j++) {
    			if (matrix[i][j] == 0) {
    				setZero(visited, newMatrix, i, j, rows, cols);
    			}
				visited[i][j] = true;
    		}
    	}
    	
    	for (int i=0; i<rows; i++) {
    		for (int j=0; j<cols; j++) {
    			matrix[i][j] = newMatrix[i][j];
    		}
    	}
    
    }
    
    public void setZero(boolean[][] visited, int[][] newMatrix, int i, int j, int rows, int cols) {
    	System.out.println(i+":"+j);
    	for (int jj=0; jj<cols; jj++) {
    		newMatrix[i][jj] = 0;
    		visited[i][jj] = true;
    	}
    	for (int ii=0; ii<rows; ii++) {
    		newMatrix[ii][j] = 0;
    		visited[ii][j] = true;
    	}
    }
    
    void setZeroes2(int[][] matrix) {
        int col0 = 1, rows = matrix.length, cols = matrix[0].length;

        for (int i = 0; i < rows; i++) {
            if (matrix[i][0] == 0) col0 = 0;
            for (int j = 1; j < cols; j++)
                if (matrix[i][j] == 0)
                    matrix[i][0] = matrix[0][j] = 0;
        }

        for (int i = rows - 1; i >= 0; i--) {
            for (int j = cols - 1; j >= 1; j--)
                if (matrix[i][0] == 0 || matrix[0][j] == 0)
                    matrix[i][j] = 0;
            if (col0 == 0) matrix[i][0] = 0;
        }
    }
    
}
