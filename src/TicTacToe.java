import java.util.Scanner;

public class TicTacToe{
    int turnCounter = 0;
    String[][] board = {{"?","?","?"},{"?","?","?"},{"?","?","?"}};
    Scanner in = new Scanner(System.in);

    public String checkWinnerSystem(String[][] board){
        String XWin = "XXX";
        String OWin = "OOO";

        //Row win check
        for(int row=0; row < 3;row++){
            if(board[row][0] + board[row][1] + board[row][2] == XWin){
                return XWin;
            }
            else if(board[row][0] + board[row][1] + board[row][2] == OWin){
                return OWin;
            }
        }

        //Column win check
        for(int column=0; column < 3;column++){
            if(board[0][column] + board[1][column] + board[1][column] == XWin){
                return XWin;
            }
            else if(board[0][column] + board[1][column] + board[1][column] == OWin){
                return OWin;
            } 
        }

        //Diagonal win check
        if(board[0][0] + board[1][1] + board[2][2] == XWin || board[0][0] + board[1][1] + board[2][2] == OWin){
            if(board[0][0] + board[1][1] + board[2][2] == XWin){
                return XWin;
            }
            if(board[0][0] + board[1][1] + board[2][2] == OWin){
                return OWin;
            }
        }
        else if (board[0][2] + board[1][1] + board[2][0] == XWin || board[0][2] + board[1][1] + board[2][0] == OWin){
            if(board[0][2] + board[1][1] + board[2][0] == XWin){
                return XWin;
            }
            if(board[0][2] + board[1][1] + board[2][0] == OWin){
                return OWin;
            }
        }
        return "";
    }

    public boolean checkWinnerAfter(String winner){
        if(winner.equals("XXX")){
            System.out.println("X Win");
            return true;
        }
        else if (winner.equals("OOO")){
            System.out.println("O Win");
            return true;
        }
        return false;
    }

}