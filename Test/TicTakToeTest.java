//import org.junit.jupiter.api.Test;
//import static org.junit.jupiter.api.Assertions.*;
//import static TicTacToeWers.Players.*;
//import static TicTacToeWers.CellElement.*;
//
//
//class TicTakToeTest {
//    TicTacToe ticTakToe = new TicTacToe();
//    Board board = new Board(ticTakToe.cellElement);
//    char[][] array = new char[3][3];
////    Players players = ticTakToe.getPlayers();
//
//    @BeforeEach
//    void setUp() {
//        TikTakToe ticTakToe = new TikTakToe();
//    }
//
////    @Test
////    void testThatTicTacToeIsA3By3Array() {
////        var array = ticTakToe.getArray();
////        assertEquals(array, ticTakToe.getArray());
////    }
//
//    @Test
//    void testThatTicTacToeIsEmpty() {
//        assertEquals(TicTacToeType.EMPTY, ticTakToe.getTicTacToe());
//    }
//
//    @Test
//    void testThatTicTacToePlayer1CanPlay() {
//
//        assertSame(PLAYER1, ticTakToe.getPlayers());
//
//    }
//    @Test
//    void testThatTicTacToePlayer2CanPlay() {
//        ticTakToe.playersMood();
//        assertSame(players.PLAYER2, ticTakToe.getPlayers());
//    }
//
//    @Test
//    void testThatTicTacToeCanDisplayTicTakToeBoard() {
//        ticTakToe.displayBoard();
//    }
//
//    @Test
//    void testThatTicTacToePlayers1CanPlayIn1() {
//        ticTakToe.play('X');
//        assertEquals(1, players.getValue());
//    }
//
//    @Test
//    void testThatTicTacToePlayers2CanPlayIn2() {
//        ticTakToe.play('O');
//        assertEquals(0, players.getValue());
//    }
//    @Test
//    void testThatTicTacToePlayerCanNotPlayOnSameCell() {
//        ticTakToe.boardCell();
////        assertEquals();
//    }
//
//
//    @Test
//    void testThatTicTacToeHasAPlayingBoard(){
//        assertNotNull(ticTakToe.getPlayArray());
//    }
//
//    @Test
//    void testThatBoardHasElements(){
//        assertNotNull(ticTakToe.getCellElement());
//    }
//
//    @Test
//    void testThatTicTacToeHasTwoPlayers(){
//        assertEquals(2, ticTakToe.getPlayers().values().length);
//    }
//
//    @Test
//    void testThatTicTacToeHasPlayerOne(){
//        ticTakToe.setPlayer(PLAYER1);
//        assertEquals(PLAYER1, ticTakToe.getPlayers());
//    }
//
//    @Test
//    void testThatTicTacToeHasPlayerTwo(){
//        ticTakToe.setPlayer(Players.PLAYER2);
//        assertEquals(Players.PLAYER2, ticTakToe.getPlayers());
//    }
//
//    @Test
//    void testThatPlayerOneCanMarkTheBoard(){
//        ticTakToe.currentPlayerMoves(PLAYER1,1);
//        assertEquals("X", Board.getPlayArray()[0][0]);
//        ticTakToe.currentPlayerMoves(PLAYER1,4);
//        assertEquals("X", Board.getPlayArray()[1][0]);
//        ticTakToe.currentPlayerMoves(PLAYER1,5);
//        assertEquals("X", Board.getPlayArray()[1][1]);
//        ticTakToe.currentPlayerMoves(PLAYER1,7);
//        assertEquals("X", Board.getPlayArray()[2][0]);
//    }
//
//    @Test
//    void testThatPlayerTwoCanMarkTheBoard(){
//        ticTakToe.currentPlayerMoves(PLAYER2,3);
//        assertEquals("O", Board.getPlayArray()[0][2]);
//        ticTakToe.currentPlayerMoves(PLAYER2,2);
//        assertEquals("O", Board.getPlayArray()[0][1]);
//        ticTakToe.currentPlayerMoves(PLAYER2,9);
//        assertEquals("O", Board.getPlayArray()[2][2]);
//        ticTakToe.currentPlayerMoves(PLAYER2,6);
//        assertEquals("O", Board.getPlayArray()[1][2]);
//        ticTakToe.currentPlayerMoves(PLAYER2,8);
//        assertEquals("O", Board.getPlayArray()[2][1]);
//    }
//
//    @Test
//    void testThatTicTacToeCanPrintOnBoard(){
//        Board.printOnBoard();
//    }
//
//    @Test
//    void testThatBoardIsEmptyByDefault(){
//        assertEquals(EMPTY, ticTakToe.getCellElement());
//    }
//
//    @Test
//    void testThatPlayersCanOnlyMoveToAnEmptyCell(){
//        ticTakToe.play();
//        assertEquals(EMPTY, ticTakToe.getCellElement());
//    }
//
//    @Test
//    void markingInvalidSpotThrowException() {
//
//    }
//
//    @Test
//    void testThatTheGameCanBeWonByOneOfThePlayers(){
//        ticTakToe.play();
//        assertEquals(EMPTY, ticTakToe.getCellElement());
//        ticTakToe.currentPlayerMoves(PLAYER1,1);
//        ticTakToe.currentPlayerMoves(PLAYER1,5);
//        ticTakToe.currentPlayerMoves(PLAYER1,9);
//        assertTrue(GameWinner.isWon(Board.getPlayArray()));
//    }
//
//    @Test
//    void testThatGameCanBeWonInFirstRow(){
//        ticTakToe.currentPlayerMoves(PLAYER2,1);
//        ticTakToe.currentPlayerMoves(PLAYER2,2);
//        ticTakToe.currentPlayerMoves(PLAYER2,3);
//        assertTrue(GameWinner.firstRow(Board.getPlayArray()));
//    }
//
//    @Test
//    void testThatGameCanBeWonInSecondRow(){
//        ticTakToe.currentPlayerMoves(PLAYER1,4);
//        ticTakToe.currentPlayerMoves(PLAYER1,5);
//        ticTakToe.currentPlayerMoves(PLAYER1,6);
//        assertTrue(GameWinner.secondRow(Board.getPlayArray()));
//    }
//
//    @Test
//    void testThatGameCanBeWonInThirdRow(){
//        ticTakToe.currentPlayerMoves(PLAYER2, 7);
//        ticTakToe.currentPlayerMoves(PLAYER2,8);
//        ticTakToe.currentPlayerMoves(PLAYER2,9);
//        assertTrue(GameWinner.thirdRow(Board.getPlayArray()));
//    }
//
//    @Test
//    void testThatGameCanBeWonInFirstColumn(){
//        ticTakToe.currentPlayerMoves(PLAYER1,1);
//        ticTakToe.currentPlayerMoves(PLAYER1,4);
//        ticTakToe.currentPlayerMoves(PLAYER1,7);
//        assertTrue(GameWinner.firstColumn(Board.getPlayArray()));
//    }
//
//    @Test
//    void testThatGameCanBeWonInSecondColumn(){
//        ticTakToe.currentPlayerMoves(PLAYER2,2);
//        ticTakToe.currentPlayerMoves(PLAYER2,5);
//        ticTakToe.currentPlayerMoves(PLAYER2,8);
//        assertTrue(GameWinner.secondColumn(Board.getPlayArray()));
//    }
//
//    @Test
//    void testThatGameCanBeWonInThreeColumn(){
//        ticTakToe.currentPlayerMoves(PLAYER1,3);
//        ticTakToe.currentPlayerMoves(PLAYER1,6);
//        ticTakToe.currentPlayerMoves(PLAYER1,9);
//        assertTrue(GameWinner.thirdColumn(Board.getPlayArray()));
//    }
//
//    @Test
//    void testThatGameCanBeWonInRightDiagonal(){
//        ticTakToe.currentPlayerMoves(PLAYER2,3);
//        ticTakToe.currentPlayerMoves(PLAYER2,5);
//        ticTakToe.currentPlayerMoves(PLAYER2,7);
//        assertTrue(GameWinner.rightDiagonal(Board.getPlayArray()));
//    }
//
//    @Test
//    void testThatGameCanBeWonInLeftDiagonal() {
//        ticTakToe.currentPlayerMoves(PLAYER1, 9);
//        ticTakToe.currentPlayerMoves(PLAYER1, 5);
//        ticTakToe.currentPlayerMoves(PLAYER1, 1);
//        assertTrue(GameWinner.leftDiagonal(Board.getPlayArray()));
//    }
//
////    @Test
////    void testThatGameCanNotBePlayedOutOfGameBoard() {
////        assertThrows(ArrayIndexOutOfBoundsException.class, () ->Board.outOfBound());
////    }
//
//}
