package sample;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class tictactoe {

    private Character player1, player2;
    private boolean gameOver;
    private int turn;
    private int round;
    private  int gameType;
    private Character computer;
    private ArrayList<ArrayList<Character>> board;



    public tictactoe(int gType, char p1, char p2) {
        this.gameType = gType;
        this.player1 = p1;
        this.player2 = p2;
        this.round = 1;
        this.gameOver = false;

        if (gameType == 1) {
            computer = p2;
        } else {
            player2 = p2;
        }
    }

    public Character getPlayer1() {
        return player1;
    }

    public void setPlayer1(Character player1) {
        this.player1 = player1;
    }

    public Character getPlayer2() {
        return player2;
    }

    public void setPlayer2(Character player2) {
        this.player2 = player2;
    }

    public boolean isGameOver() {
        return gameOver;
    }

    public void setGameOver(boolean gameOver) {
        this.gameOver = gameOver;
    }

    public int getTurn() {
        return turn;
    }

    public void setTurn(int turn) {
        this.turn = turn;
    }

    public int getRound() {
        return round;
    }

    public void setRound(int round) {
        this.round = round;
    }

    public int getGameType() {
        return gameType;
    }

    public void setGameType(int gameType) {
        this.gameType = gameType;
    }

    public Character getComputer() {
        return computer;
    }

    public void setComputer(Character computer) {
        this.computer = computer;
    }

    public ArrayList<ArrayList<Character>> getBoard() {
        return board;
    }

    public void setBoard(ArrayList<ArrayList<Character>> board) {
        this.board = board;
    }


    public void playGame() {
        boolean isValid;
        this.turn ++;

        String rowcol;
        String r;
        String c;
        turn = 1;
        int row;
        int col;
        char playerSymbol;

        while(gameOver == false) {
            if(turn == 1) {
                playerSymbol = player1; }
            else {
                playerSymbol= player2;
            }
            //gets user input on row, col
//            cout << "Please enter the row and column of the space you would like to play: ";
//            cin >> rowcol;
//            r= rowcol.substr(0,1);
//            row = stoi(r);
//            c = rowcol.substr(1,2);
//            col = stoi(c);


//            isValid = isValidChoice(row-1, col-1);
//            if(!isValid) {
//                round --;
//                playGame();
//            }
//            board[row-1][col-1] = playerSymbol;
//            bool win = isWin(playerSymbol);
//            bool full = isFull();
//            drawBoard();
//            if(win) {
//                cout << "Congrats! You have won!" << endl;
//                gameOver = true;
//                break;
//            } else if(full){
//                cout << "The board is full! It's a tie" << endl;
//                gameOver = true;
//                break;
//            } else {
//                turn = 2;
//            }
//            continue;
//        } else if(turn == 2 && gameType == 1) {
//            cout << "Computer's turn: " << endl;
//            tie(row, col) = computerTurn(computer);
//            cout << "Computer's pick. Row: " << row+1 << " Column: " << col+1 << endl;
//            bool win = isWin(computer);
//            bool full = isFull();
//            drawBoard();
//            if(win) {
//                cout << "The Computer has won!" << endl;
//                gameOver = true;
//                break;
//            } else if(full){
//                cout << "The board is full! It's a tie" << endl;
//                break;
//            } else {
//                turn = 2;
//            }
//            continue;
//        }
//        else if(turn == 2 && gameType == 2) {
//            cout << "Player2, please enter the row and column of the space you would like to play: ";
//            cin >> rowcol;
//            r= rowcol.substr(0,1);
//            row = stoi(r);
//            c = rowcol.substr(1,2);
//            col = stoi(c);
//            isValid = isValidChoice(row-1, col-1);
//            if(!isValid) {
//                round --;
//                playGame();
//            }
//            playerTurn(row-1,col-1, player2);
//            bool win = isWin(player2);
//            bool full = isFull();
//            drawBoard();
//            if(win) {
//                cout << "Congrats player 2! You have won!" << endl;
//                gameOver = true;
//                break;
//            } else if(full){
//                cout << "The board is full! It's a tie" << endl;
//                gameOver = true;
//                continue;
//            } else {
//                turn = 1;
//            }
//            continue;
//        }
        }
    }

    public boolean isWin(char player) {
        boolean win;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                //checks columns
                if(i == 0) {
                    if (board.get(i).get(j) == player) {
                        if (board.get(i).get(j) == player) {
                            if (board.get(i).get(j) == player) {
                                return true;
                            }
                        }
                    }
                }
                //checks rows
                if(j == 0) {
                    if (board.get(i).get(j) == player) {
                        if (board.get(i).get(j+1) == player) {
                            if (board.get(i).get(j+2) == player) {
                                return true;
                            }
                        }
                    }
                }
                //checks diagonal
                if (i == 0 && j == 0) {
                    if (board.get(i).get(j) == player) {
                        if (board.get(i+1).get(j+1) == player) {
                            if (board.get(i+2).get(j+2) == player) {
                                return true;

                            }
                        }

                    }
                }
                if (i == 2 && j == 2) {
                    if (board.get(i).get(j) == player) {
                        if (board.get(i-1).get(j-1) == player) {
                            if (board.get(i-2).get(j-2) == player) {
                                return true;

                            }
                        }
                    }
                }
            }}
        return false;
    }

    public boolean isFull() {
        for(int i=0; i<3; i++) {
            for(int j=0; j<3; j++){
                if(board.get(i).get(j)!=' ') {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean isValidInput(int row, int col) {
        if(row > 3 || row < 0) {
            System.out.println("Please enter a valid row and column number (1-3)");
            return false;
        }else if(col > 3 || col < 0) {
            System.out.println("Please enter a valid row and column number (1-3)" );
            return false;
        }
        else if(board.get(row).get(col) != ' ') {
            System.out.println("This space is already taken, please enter an empty row and column (1-3)");
            return false;
        }
        return true;
    }

    //tuple<int,int> tictoe::computerTurn(char computer) {
//    int row;
//    int col;
//    bool open = false;
//    while(!open) {
//        col = rand() % 2;
//        row = rand() % 2;
//        if(board1[row][col] == 0) {
//            board1[row][col] = 1;
//            board2[row][col] = computer;
//            open = true;
//        }
//    }
//    return {row, col};
//}

    //    //Vector representation of board
//    void drawBoard() {
//        for(int i=0; i<17; i++) {
//            cout << " - ";
//        }
//        cout << "\n";
//        for(int i=0; i<3; i++) {
//            for(int j=0; j<3; j++) {
//                if(j == 0) {
//                    cout << " |       ";
//                }
//                cout << board.get(i).get(j);
//                cout << "       |       ";
//            }
//            cout << "\n";
//            for(int i=0; i<17; i++) {
//                cout << " - ";
//            }
//            cout << "\n";
//        }
//    }

//        ArrayList<Character> row = new ArrayList<Character>();
//        for(int i=0; i<3; i++) {
//            for(int j=0; j<3; j++){
//                row.add(' ');
//            }
//            board.add(row);


    //drawBoard();
    //playGame();



}
