package workshop;

import java.io.Console;

public class ttt{
    private char[][] board;
    private char currentPlayer;

    public ttt(){

        board = new char[3][3];
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){ 
                board[i][j]= ' ';
            }
        }

        currentPlayer = 'X';
    }

    public void printBoard(){
        for (int i = 0; i < 3; i++){
                System.out.println(board[i][0] + "|" + board[i][1] +"|" + board[i][2]);
                if (i < 2){
                    System.out.println("-----");
                }
        }
    }

    public boolean ifWin(){
        for (int i = 0; i < 3; i++){
            if (board[i][0] == currentPlayer && board[i][1] == currentPlayer && board[i][2] == currentPlayer || (board[0][i] == currentPlayer && board[1][i] == currentPlayer && board[2][i]) == currentPlayer)
                return true;
        board


        }
        
    }
    public static void main(String[] args) {
        ttt game = new ttt();
        game.printBoard();
    }

}