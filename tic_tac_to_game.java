import java.util.*;


public class tic_tac_to_game {
    /// create global private variable that can't be accessed or change in different directory

    /// it creates a 3:3 matrix with numbering 1-9 representing its position in a board of 3*3 grid, help in selecting the move
    private static char[][] board = new char[3][3];

    /// set first player value 'X' afterword it can be 0 or x according to the player
    private static char currentPlayer = 'X';

    /// create scanner object for taking user input
    private static Scanner scanner = new Scanner(System.in);

    /// create random object that will be used during 1 player for getting opposite value at random places
    private static Random random = new Random();




    /// ANSI escape codes for colors because of which their will no confusion between matrix number and values
    private static final String RESET = "\u001B[0m";
    private static final String RED = "\u001B[31m";
    private static final String BLUE = "\u001B[34m";



    public static void main(String[] args) {
        System.out.println("Welcome to Tic-Tac-Toe!");


     /// It will run the code first when code is ran after then it will ask for your choice that do you want to play it more or not once the selection is done code will execute according to your option
        do {
            initializeBoard(); /// it will create 3*3 grid with numbering
            System.out.print("Choose mode: 1 for Single Player, 2 for Two Players: ");
            int mode = scanner.nextInt();  /// select do you want to play with computer or with friend
        playGame(mode); /// it calls the function where rest of all function will be carried out
        } while (askToPlayAgain()); /// whether you want to play more or not

        System.out.println("Thanks for playing!");
    }


    ///  print 3*3 grid with numbers in position
    private static void initializeBoard() {
        char number = '1';
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = number++;
            }
        }
    }


///  it will take the input in 1 or 2 players mode and further execute the code
    private static void playGame(int mode) {
        while (true) {
            // print the 3*3 matrix after each steps
            printBoard();


            if (mode == 1 && currentPlayer == 'O') { // if mode that is selected by you is 1 then it will be true, and you play with computer
                computerMove();
            }
            else { // if mode 2 where you can play with 2 player
                playerMove();
            }


            if (checkWinner()) { // it will check for winner after each step, then it will print the result end all the loop
                printBoard();
                System.out.println("Player " + currentPlayer + " wins!");
                break;
            }
            else if (isBoardFull()) { // if  there is no winner their might me draw no option enter any value
                printBoard();
                System.out.println("It's a draw!");
                break;
            }

            // it will change the player
            currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
        }
    }



    ///  it prints the 3*3 matrix
    private static void printBoard() {
        System.out.println(" -------------");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" | " + getColoredSymbol(board[i][j]));
            }
            System.out.println(" |");
            System.out.println(" -------------");
        }
    }

    /// it will generate color for 'X' and '0'
    private static String getColoredSymbol(char symbol) {
        if (symbol == 'X') {
            return RED + symbol + RESET; // Red for X
        } else if (symbol == 'O') {
            return BLUE + symbol + RESET; // Blue for O
        }
        return String.valueOf(symbol); // Default for numbers
    }


    /// it is 2 player mode function that will enter the value at desire places by 2 of the player
    private static void playerMove() {
        int move;
        while (true) {
            System.out.print("Player " + currentPlayer + ", enter your move (1-9): ");
            move = scanner.nextInt();
            if (move >= 1 && move <= 9 && isValidMove(move)) {
                placeMove(move);
                break;
            } else {
                System.out.println("Invalid move. Try again.");
            }
        }
    }

    ///  it is 1 player mode function where second player will be a computer
    private static void computerMove() {
        System.out.println("Computer's turn:");
        int move;
        while (true) {
            move = random.nextInt(9) + 1; // Generates a number between 1 and 9
            if (isValidMove(move)) {
                placeMove(move);
                break;
            }
        }
    }

    /// it will check whether the position you have selected is valid means is their any placement of value player value if then you selected position is wrong else it ois write
    private static boolean isValidMove(int move) {
        int row = (move - 1) / 3;
        int col = (move - 1) % 3;
        return board[row][col] != 'X' && board[row][col] != 'O';
    }

    /// after checking that is valid move it place the value at your desire place
    private static void placeMove(int move) {
        int row = (move - 1) / 3;
        int col = (move - 1) % 3;
        board[row][col] = currentPlayer;
    }



    /// it will check that there is any winner or not after each move
    private static boolean checkWinner() {
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == currentPlayer && board[i][1] == currentPlayer && board[i][2] == currentPlayer)
                return true; // Horizontal win
            if (board[0][i] == currentPlayer && board[1][i] == currentPlayer && board[2][i] == currentPlayer)
                return true; // Vertical win
        }
        if (board[0][0] == currentPlayer && board[1][1] == currentPlayer && board[2][2] == currentPlayer)
            return true; // Diagonal win
        if (board[0][2] == currentPlayer && board[1][1] == currentPlayer && board[2][0] == currentPlayer)
            return true; // Diagonal win
        return false;
    }



    /// it will check that their ia any empty place for the move or not
    private static boolean isBoardFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] != 'X' && board[i][j] != 'O') {
                    return false; // Empty cell found
                }
            }
        }
        return true; // No empty cells
    }


    //  it will aks whether you want to play more or not
    private static boolean askToPlayAgain() {
        System.out.print("Do you want to play again? (yes/no): ");
        String answer = scanner.next().toLowerCase();
        return answer.startsWith("y");
    }
}
