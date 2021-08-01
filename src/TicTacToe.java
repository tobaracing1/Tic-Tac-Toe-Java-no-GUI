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
            String rows = board[row][0] + board[row][1] + board[row][2];
            if(rows.equals(XWin)){
                System.out.println(rows);
                return XWin;
            }
            else if(rows.equals(OWin)){
                System.out.println(rows);
                return OWin;
            }
        }

        //Column win check
        for(int column=0; column < 3;column++){
            String columns = board[0][column] + board[1][column] + board[2][column];
            if(columns.equals(XWin)){
                System.out.println(columns);
                return XWin;
            }
            else if(columns.equals(OWin)){
                System.out.println(columns);
                return OWin;
            } 
        }

        //Diagonal win check
        String diagonal1 = board[0][0] + board[1][1] + board[2][2];
        String diagonal2 = board[0][2] + board[1][1] + board[2][0];

        if(diagonal1.equals(XWin) || diagonal1.equals(OWin)){
            if(diagonal1.equals(XWin)){
                System.out.println(diagonal1);
                return XWin;
            }
            if(diagonal1.equals(OWin)){
                System.out.println(diagonal1);
                return OWin;
            }
        }
        else if (diagonal2.equals(XWin) || diagonal2.equals(OWin)){
            if(diagonal2.equals(XWin)){
                System.out.println(diagonal2);
                return XWin;
            }
            if(diagonal2.equals(OWin)){
                System.out.println(diagonal2);
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

    public void board(String[][] board){
        System.out.printf(
        "      1       2        3         \n"+
        "------------------------------\n" +
        "1 |   %s   |   %s    |   %s    |\n" +
        "------------------------------\n" +
        "2 |   %s   |   %s    |   %s    |\n" +
        "------------------------------\n" +
        "3 |   %s   |   %s    |   %s    |\n" +
        "------------------------------\n" 
        ,board[0][0],board[0][1],board[0][2]
        ,board[1][0],board[1][1],board[1][2]
        ,board[2][0],board[2][1],board[2][2]);
    }

}