package OOP.MarRoVer.Solution;

import javax.swing.*;

public enum Direction {

    N , E , S , W ;

    public Direction turnleft() {
        return values()[(ordinal() + 3) % 4 ];

    }

    public Direction turnRight() {
        return values()[(ordinal() + 1 ) % 4];

    }

}