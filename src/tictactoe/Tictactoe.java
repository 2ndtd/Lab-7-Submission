/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;
import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author EXT_BRG
 */
public class Tictactoe {

    private final char[][] board;
	private char cp;

	public Tictactoe() {
		board = new char[3][3];
		cp = 'x';
        for (char[] board1 : board) {
            Arrays.fill(board1, '.');
        }
	}

	public void MakeMove() {
		Scanner sc = new Scanner(System.in);
		while (SpaceInUse() == false) {
                    CurrentPlayer();
			System.out.println("enter row");
			int row = sc.nextInt();
			System.out.println("enter column");
			int column = sc.nextInt();
			if (board[row][column] == 'x' || board[row][column] == 'o') {
				System.out.println("This spot is clearly taken. Try again");
				ChangePlayer();
				board[row][column] = cp;
			}
			if (row < board.length && row >= 0 && column < board.length && column >= 0) {
				board[row][column] = cp;

			}
			ChangePlayer();
			CreateBoard();
			
			System.out.println();
		}
	}

	public void CreateBoard() {
		System.out.println("--Tic Tac Toe Board--");
        for (char[] board1 : board) {
            System.out.print("| ");
            for (int j = 0; j < board.length; j++) {
                System.out.print(board1[j] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
	}

	public void CurrentPlayer() {
		if (cp == 'x') {
			System.out.println("It is X's turn!!!");
		} else {
			System.out.println("It is O's turn!!!");
		}
	}

	public void ChangePlayer() {
		if (cp == 'x') {
			cp = 'o';

		} else {
			cp = 'x';
		}
	}


	public boolean SpaceInUse() {
        for (char[] board1 : board) {
            for (int j = 0; j < board.length; j++) {
                if (board1[j] == '.') {
                    return false;
                }
            }
        }
		return true;
	}

}

