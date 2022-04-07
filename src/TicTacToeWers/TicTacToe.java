package TicTacToeWers;

import static TicTacToeWers.Players.PLAYER1;
import static TicTacToeWers.TicTacToeType.*;

class TikTakToe {
    private TicTacToeType cellElement = EMPTY;
    private Board board = new Board(cellElement);
    private Players players = PLAYER1;
    private String[][] playerBoard = Board.getBoard();

    public Board getBoard() {
        return board;
    }

    public TicTacToeType getCellElement() {
        return cellElement;
    }

    public Players getPlayers() {
        return players;

    }

    public void playerMove(Players player, int position) {
        if (player == Players.PLAYER1) setPostion(position, X);
        else setPostion(position, O);
    }

    public void play() {
        if (cellElement != EMPTY) {
            System.out.println("Player has to play in an empty cell");
        }
    }

    public void setPlayer(Players player) {
        this.players = player;
    }

    public String[][] getArray() {
        return Board.array;
    }

    public void setBoardPosition(int position, TicTacToeType board) {
        switch (position) {
            case 1 -> playerBoard[0][0] = String.valueOf(board);
            case 2 -> playerBoard[0][1] = String.valueOf(board);
            case 3 -> playerBoard[0][2] = String.valueOf(board);
            case 4 -> playerBoard[1][0] = String.valueOf(board);
            case 5 -> playerBoard[1][1] = String.valueOf(board);
            case 6 -> playerBoard[1][2] = String.valueOf(board);
            case 7 -> playerBoard[2][0] = String.valueOf(board);
            case 8 -> playerBoard[2][1] = String.valueOf(board);
            case 9 -> playerBoard[2][2] = String.valueOf(board);
        }
    }

    public void setPostion(int position, TicTacToeType board) {
        for (int row = 0; row < playerBoard.length; row++) {
            for (int column = 0; column < playerBoard[row].length; column++) {
//                if (playBoard[row][column] == String.valueOf(EMPTY)){
                setBoardPosition(position, board);
//                }
//                else throw new InputMismatchException("You cant play in an already filled board");
            }
        }
    }
}