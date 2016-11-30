package rotateimage;

public class Solution {
    public void rotate(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        
        int[][] rMatrix = new int[rows][cols];
        
        for (int i=0; i<rows; i++) {
        	for (int j=0; j<cols; j++) {
        		rMatrix[j][cols-i-1] = matrix[i][j];
        	}
        }
        
        for (int i=0; i<rows; i++) {
        	for (int j=0; j<cols; j++) {
        		matrix[i][j] = rMatrix[i][j];
        	}
        }
        
    }
}
