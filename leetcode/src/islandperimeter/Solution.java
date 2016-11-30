package islandperimeter;

public class Solution {
	public int islandPerimeter(int[][] grid) {
		
		int output = 0;
		int i, j;
	    
		if (grid.length == 0) { return output; }
		
		int rows = grid.length;
		int cols = grid[0].length;		
		//System.out.println(rows+":"+cols);
		
		Edge[][] hEdges = new Edge[rows+1][cols];
		Edge[][] vEdges = new Edge[rows][cols+1];
		
		for (i=0; i<rows+1; i++) {
			for (j=0; j<cols; j++) {
				hEdges[i][j] = new Edge();
			}
		}
		
		for (i=0; i<rows; i++) {
			for (j=0; j<cols+1; j++) {
				vEdges[i][j] = new Edge();
			}
		}
		
		for (i=0; i<rows; i++) {
			for (j=0; j<cols; j++) {
				//System.out.println(i+":"+j);
				hEdges[i][j].right = grid[i][j];
				hEdges[i+1][j].left = grid[i][j];
				vEdges[i][j].left = grid[i][j];
				vEdges[i][j+1].right = grid[i][j];
			}
		}
		
		for (i=0; i<rows+1; i++) {
			for (j=0; j<cols; j++) {
				if (hEdges[i][j].left != hEdges[i][j].right) {
					output++;
				}
			}
		}
		
		for (i=0; i<rows; i++) {
			for (j=0; j<cols+1; j++) {
				if (vEdges[i][j].left != vEdges[i][j].right) {
					output++;
				}
			}
		}

	    return output;    
	}

	public class Edge {
		int left = 0;
		int right = 0;
		boolean processed;
		
		public Edge() {
			left = 0;
			right = 0;
			processed = false;
		}
	}
}
