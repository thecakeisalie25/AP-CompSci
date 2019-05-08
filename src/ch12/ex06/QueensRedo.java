package ch12.ex06;
		
import java.util.Scanner;
		
public class QueensRedo
{
	public static ChessQueen[] board;
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println();
		System.out.println("What size of board?");
		System.out.print("default is 8> ");
		int boardsize = input.nextInt();
		board = new ChessQueen[boardsize];
		System.out.println(findQueens(0, boardsize));
		input.close();
	}
	public static int findQueens(int starting, int limit) {
		int solutions = 0;
		if (starting == limit) {
			for (ChessQueen e : board) {
				for (ChessQueen f : board) {
					if(!e.check(f)){
						return 0;
					}
				}
			}
			return 1;
		}
		else for (int i = 0; i < limit; i++) {
			board[starting] = new ChessQueen(starting, i);
			solutions += findQueens(starting + 1, limit);
		}
		return solutions;
	}
}