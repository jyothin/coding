package p348_tictactoe;

public class TicTacToe {
	int n;
	char[][] board;
	
	public TicTacToe(int n) {
		this.n = n;
		board = new char[n][n];
		for (int i=0; i<n; i++) {
			for (int j=0; j<n; j++) {
				board[i][j] = '.';
			}
		}
	}
	
	public int move(int row, int col, int player) {
		char c = (player == 1 ? 'X': 'O');
		board[row][col] = c;
		
		boolean rowRet = rowCheck(row, c);
		boolean colRet = colCheck(col, c);
		boolean diaRet = diaCheck(c);
		boolean diaRet2 = diaCheck2(c);
		
		if (rowRet || colRet || diaRet || diaRet2) {
			return player;
		} else {
			return 0;
		}
		
	}
	
	public boolean rowCheck(int row, char player) {
		for (int y=0; y<n; y++) {
			if (board[row][y] != player) {
				return false;
			}
		}
		return true;
	}
	
	public boolean colCheck(int col, char player) {
		for (int x=0; x<n; x++) {
			if (board[x][col] != player) {
				return false;
			}
		}
		return true;
	}
	
	public boolean diaCheck(char player) {
		for (int x=0; x<n; x++) {
			if (board[x][x] != player) {
				return false;
			}
		}
		return true;
	}

	public boolean diaCheck2(char player) {
		for (int x=0; x<n; x++) {
			if (board[n-1-x][x] != player) {
				return false;
			}
		}
		return true;
	}
}