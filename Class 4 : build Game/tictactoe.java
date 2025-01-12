import java.util.Scanner;

class Board {
    char[][] grid;

    public Board() {
        grid = new char[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                grid[i][j] = ' '; 
            }
        }
    }

    void print() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(grid[i][j]);
                if (j < 2) System.out.print(" | ");
            }
            System.out.println();
            if (i < 2) System.out.println("---------");
        }
    }

    boolean placeMarker(int row, int col, char marker) {
        if (grid[row][col] == ' ') {
            grid[row][col] = marker;
            return true;
        }
        return false;
    }

    boolean checkWin(char marker) {
       
        for (int i = 0; i < 3; i++) {
            if (grid[i][0] == marker && grid[i][1] == marker && grid[i][2] == marker) return true;
            if (grid[0][i] == marker && grid[1][i] == marker && grid[2][i] == marker) return true;
        }
        if (grid[0][0] == marker && grid[1][1] == marker && grid[2][2] == marker) return true;
        if (grid[0][2] == marker && grid[1][1] == marker && grid[2][0] == marker) return true;
        return false;
    }

    boolean isFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (grid[i][j] == ' ') return false;
            }
        }
        return true;
    }
}

class Player {
    char marker;

    public Player(char marker) {
        this.marker = marker;
    }

    public char getMarker() {
        return marker;
    }
}

class Game {
    Board b;
    Player P1;
    Player P2;
    Scanner scanner;

    public Game() {
        b = new Board();
        P1 = new Player('X');
        P2 = new Player('O');
        scanner = new Scanner(System.in);
    }

    void run() {
        int turn = 0;
        Player currentPlayer = P1;

        while (turn < 9) {
            b.print();
            System.out.println("Player " + currentPlayer.getMarker() + ", it's your turn.");
            System.out.print("Enter row (0, 1, 2): ");
            int row = scanner.nextInt();
            System.out.print("Enter column (0, 1, 2): ");
            int col = scanner.nextInt();

            if (row < 0 || row > 2 || col < 0 || col > 2) {
                System.out.println("Invalid input. Please enter row and column between 0 and 2.");
                continue;
            }

            if (b.placeMarker(row, col, currentPlayer.getMarker())) {
                if (b.checkWin(currentPlayer.getMarker())) {
                    b.print();
                    System.out.println("Player " + currentPlayer.getMarker() + " wins!");
                    return;
                }
                if (b.isFull()) {
                    b.print();
                    System.out.println("It's a draw!");
                    return;
                }

              
                currentPlayer = (currentPlayer == P1) ? P2 : P1;
                turn++;
            } else {
                System.out.println("That space is already occupied. Try again.");
            }
        }
    }
}

public class tictactoe {
    public static void main(String[] args) {
        Game game = new Game();
        game.run();
    }
}
