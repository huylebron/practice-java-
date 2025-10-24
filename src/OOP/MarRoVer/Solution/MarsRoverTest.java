package OOP.MarRoVer.Solution;

public class MarsRoverTest {

    public static void main(String[] args) throws IllegalAccessException {



        MarsRover rover = new MarsRover();


        System.out.println(rover.execute("MMRMMLM"));
        System.out.println(rover.execute("MMMMMMMMMM")); // Expected: 0:0:N
        System.out.println(rover.execute("RMMMLM"));
    }
}