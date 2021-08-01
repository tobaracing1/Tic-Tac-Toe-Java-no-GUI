import java.util.Scanner;




public class Start {
    public static void main(String[] args) {
        int turnCounter = 0;
        String[][] board = {{"?","?","?"},{"?","?","?"},{"?","?","?"}};
        Scanner in = new Scanner(System.in);
        boolean win = false;
        TicTacToe game = new TicTacToe();

        while (win == false && turnCounter < 9){
            game.board(board);

            if(turnCounter % 2 == 1){
                String mark = "X";
                System.out.print("Baris   : ");
                int baris = in.nextInt()-1;
                System.out.print("Column  : ");
                int column = in.nextInt()-1;

                if(board[baris][column].equals("X") || board[baris][column].equals("O")){
                    System.out.println("Insert another area . . .");
                }
                else{
                    board[baris][column] = mark;
                    win = game.checkWinnerAfter(game.checkWinnerSystem(board));
                    turnCounter += 1;
                }

            }
            else if (turnCounter % 2 == 0){
                String mark = "O";
                System.out.print("Baris   : ");
                int baris = in.nextInt()-1;
                System.out.print("Column  : ");
                int column = in.nextInt()-1;

                if(board[baris][column].equals("X") || board[baris][column].equals("O")){
                    System.out.println("Insert another area . . .");
                }
                else{
                    board[baris][column] = mark;
                    win = game.checkWinnerAfter(game.checkWinnerSystem(board));
                    turnCounter += 1;
                }
            }
        }

        if(win == true && turnCounter < 9){
            System.out.println("Congratulation");
        }
        else if(win == false && turnCounter >=9){
            System.out.println("\n\n\n\n\n\nDraw");
        }

        
        in.close();
    }
}
