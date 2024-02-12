
package lab5.pkg1;

public class BoardMark2 {

    public int size;
    FigureMark2 f1;
    FigureMark2 f2;
    

    public BoardMark2(int size) {
        this.size = size;
        this.f1 = new FigureMark2("F1",1); // Starting position for figure 1
        this.f2 = new FigureMark2("F2",2); // Starting position for figure 2
    }

    public void moveFigure(FigureMark2 figure, int steps) throws InterruptedException {
        int newPosition = steps;
        if (newPosition >= 0 && newPosition <= size) {
        if (!(figure == f1 && newPosition == f2.getPosition()) &&
            !(figure == f2 && newPosition == f1.getPosition())) {
               figure.setPosition(newPosition);
               System.out.println("Start moving...");
               Thread.sleep(1000);
               printBoard();               
        }else{
               System.out.println("Can't move! You should select new block.");
               System.out.println("===================================================");
               Thread.sleep(1000);
        }   
    }else{
          System.out.println("Can't type number under zero!");    
          System.exit(0);
    }
  }
    public void printBoard()throws InterruptedException {
        for (int i = 1; i <= size; i++) {
            if (f1.getPosition() == i) {
                System.out.print(f1.getName()+"   ");
            } else if (f2.getPosition() == i) {
                System.out.print(f2.getName()+"   ");
            } else {
                System.out.print("_   ");
            }
        }
        System.out.println();
        statusFigure();
        System.out.println("===================================================");
        Thread.sleep(1000);
    }
    public void setupBoard() throws InterruptedException{
      f1.setPosition(1);
      f2.setPosition(2);
      System.out.println("The board is setting-up ...");
      Thread.sleep(1000);
      printBoard();
    }
    public void statusFigure(){
      System.out.println("The position of "+f1.getName()+" is "+f1.getPosition());
      System.out.println("The position of "+f2.getName()+" is "+f2.getPosition());
    }
}


