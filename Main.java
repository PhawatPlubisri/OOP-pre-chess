
package lab5.pkg1;

public class Main5dot1 {
    public static void main(String[] args) throws InterruptedException {
        BoardMark2 board = new BoardMark2(10);
        board.setupBoard();
        board.moveFigure(board.f1, 3);
        board.moveFigure(board.f2, 3);
        board.moveFigure(board.f2, 5);
        board.moveFigure(board.f1, 7);
  }
}

    

