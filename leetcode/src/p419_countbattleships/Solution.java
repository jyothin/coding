package p419_countbattleships;

public class Solution {
	int rows;
	int cols;

    public int countBattleships(char[][] board) {
        rows = board.length;
        if (rows == 0) {
        	return 0;
        }
        cols = board[0].length;
        System.out.println(rows+":"+cols);
        boolean[][] visited = new boolean[rows][cols];
        int numBattleShips = 0;
        for (int i=0; i<rows; i++) {
        	for (int j=0; j<cols; j++) {
        		if (!visited[i][j] && board[i][j] == 'X') {
        			numBattleShips++;
        			findBattleShip(visited, board, i, j);
        		}
        	}
        }
        return numBattleShips;
    }
    
    public void findBattleShip(boolean[][] visited, char[][] board, int i, int j) {
    	if (!visited[i][j] && board[i][j] == 'X') {
    		visited[i][j] = true;
	    	if (j-1 >= 0) {
	    		findBattleShip(visited, board, i, j-1);
	    	}
	    	if (i-1 >= 0) {
	    		findBattleShip(visited, board, i-1, j);
	    	}
	    	if (j+1 < cols) {
	    		findBattleShip(visited, board, i, j+1);
	    	}
	    	if (i+1 < rows) {
	    		findBattleShip(visited, board, i+1, j);
	    	}
    	}
    }
}
