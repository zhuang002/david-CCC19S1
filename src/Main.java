import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String ops = sc.nextLine();
		int[][] board = {
				{1,2},
				{3,4}
		};
		
		
		
		for (int i=0;i<ops.length();i++) {
			char op = ops.charAt(i);
			
			board = doOp(board, op);
		}
		
		printBoard(board);

	}

	private static int[][] doOp(int[][] board, char op) {
		int[][] rtBoard = new int[2][2];
		if (op == 'H') {
			rtBoard[0][0] = board[1][0];
			rtBoard[0][1] = board[1][1];
			rtBoard[1][0] = board[0][0];
			rtBoard[1][1] = board[0][1];
		} else if (op == 'V') {
			rtBoard[0][0] = board[0][1];
			rtBoard[1][0] = board[1][1];
			rtBoard[0][1] = board[0][0];
			rtBoard[1][1] = board[1][0];
		}
		return rtBoard;
	}

	private static void printBoard(int[][] board) {
		System.out.println(board[0][0]+" "+board[0][1]);
		System.out.println(board[1][0]+" "+board[1][1]);
	}

}
