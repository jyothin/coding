package p200_numislands;

public class Solution {
	
	int rows;
	int cols;
	
    public int numIslands(char[][] grid) {
        
    	int numIslands = 0;
    	rows = grid.length;
    	if (rows == 0) {
    		return 0;
    	}
    	cols = grid[0].length;
    	Boolean[][] visited = new Boolean[rows][cols];
    	
    	for (int i=0; i<rows; i++) {
    		for (int j=0; j<cols; j++) {
    			visited[i][j] = false;
    		}
    	}
    	
    	for (int i=0; i<rows; i++) {
    		for (int j=0; j<cols; j++) {
    			if (!visited[i][j] && grid[i][j] == "1".charAt(0)) {
    				numIslands++;
    				//System.out.println(numIslands+":"+i+":"+j);
    				scanIslands(grid, visited, i, j);
    			}
    		}
    	}
    	
    	return numIslands;
    }
    
    public void scanIslands(char[][] grid, Boolean[][] visited, int i, int j) {
    	//System.out.println(i+":"+j);
    	if (i-1 >= 0) {
    		if (!visited[i-1][j] && grid[i-1][j] == "1".charAt(0)) {
    			visited[i-1][j] = true;
    			scanIslands(grid, visited, i-1, j);
    		}
    	}
    	
    	if (j-1 >= 0) {
    		if (!visited[i][j-1] && grid[i][j-1] == "1".charAt(0)) {
    			visited[i][j-1] = true;
    			scanIslands(grid, visited, i, j-1);
    		}
    	}

    	if (j+1 < cols) {
    		if (!visited[i][j+1] && grid[i][j+1] == "1".charAt(0)) {
    			visited[i][j+1] = true;
    			scanIslands(grid, visited, i, j+1);
    		}
    	}
    	
    	if (i+1 < rows) {
    		if (!visited[i+1][j] && grid[i+1][j] == "1".charAt(0)) {
    			visited[i+1][j] = true;
    			scanIslands(grid, visited, i+1, j);
    		}
    	}
    	
    }
}