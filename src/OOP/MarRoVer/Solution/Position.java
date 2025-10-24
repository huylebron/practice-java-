package OOP.MarRoVer.Solution;

public class Position {

    private  int x ;
    private  int y ;
    private static final int MAX_SIZE = 10 ;

    public Position(int i, int x) {
        this.x = x;
        this.y = y ;
    }


    public void move ( Direction direction) {
        switch (direction) {
            case E -> x = ( x + 1) % MAX_SIZE;
            case N -> y = ( y + 1) % MAX_SIZE;
            case S -> x = ( y - 1 + MAX_SIZE) % MAX_SIZE;
            case W -> x =  ( x - 1  + MAX_SIZE) % MAX_SIZE;
        }
    }

    @Override
    public String toString() {
        return x + ":" +y ;
    }
}