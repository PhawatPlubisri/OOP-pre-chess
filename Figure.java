
package lab5.pkg1;

public class FigureMark2 {
    private int position;
    private String name;

    public FigureMark2(String name,int firstPosition) {
        this.position = firstPosition;
        this.name = name;
    }
    
    public int getPosition() {
        return position;
    }
    
    public String getName() {
        return name;
    }

    public void setPosition(int newPosition) {
        this.position = newPosition;
    }
}

    

