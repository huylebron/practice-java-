package OOP.MarRoVer.Solution;

public class MarsRover {

    private Position position;
    private Direction direction ;


    public MarsRover() {
        this.position = new Position(0, 0 );
        this.direction = Direction.N;

    }
    public String execute (String command ) throws IllegalAccessException {
        for ( char c : command. toCharArray()) {
            switch (c) {


                case 'L' -> direction = direction.turnleft();
                case 'R' -> direction = direction.turnRight();
                 case 'M' -> position.move(direction);
                default -> throw new IllegalAccessException("invalid command ; " + c );
            }
        }

        return position + ":" + direction;

    }

}