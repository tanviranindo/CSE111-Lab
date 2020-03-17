
import java.util.Arrays;
import java.util.Scanner;

public class RobotProblem {


  private static enum Direction {
    EAST("E", 1, 0), SOUTH("S", 0, -1), WEST("W", -1, 0), NORTH("N", 0, 1);

    public static Direction fromRep(String rep) {
      switch (rep) {
        case "E": return EAST;
        case "S": return SOUTH;
        case "W": return WEST;
        case "N": return NORTH;
        default: return null;
      }
    }

    private final String rep;
    private final int changeX;
    private final int changeY;

    private Direction(String r, int changeX, int changeY) {
      this.rep = r;
      this.changeX = changeX;
      this.changeY = changeY;
    }

    public int changeX() {
      return changeX;
    }

    public int changeY() {
      return changeY;
    }
    
    public String toString() {
      return this.rep;
    }

    public Direction turnRight() {
      switch (this){
        case EAST: return SOUTH;
        case SOUTH: return WEST;
        case WEST: return NORTH;
        case NORTH: return EAST;
        default: return null;
      }
    }

    public Direction turnLeft(){
      switch (this) {
        case EAST: return NORTH;
        case SOUTH: return EAST;
        case WEST: return SOUTH;
        case NORTH: return WEST;
        default: return null;
      }
    }

  }

  private static class Robot{

    private int posX;
    private int posY;
    private Direction direction;
    private boolean alive;
    private final boolean[][] board;
    private final int numOfRows;
    private final int numOfColumns;

    public Robot(int posX, int posY, Direction direction, boolean[][] board) {
      this.posX = posX;
      this.posY = posY;
      this.direction = direction;
      this.alive = true;
      this.board = board;
      this.numOfRows = board.length;
      this.numOfColumns = board[0].length;
    }

    public void follow(String ins) {
      for (int i = 0; i < ins.length() && alive; ++i) {
        follow(ins.charAt(i));
      }
    }

    public void output() {
      System.out.println(posX + " " + posY + " " + direction + (alive ? "" : " LOST"));
    }

    private void follow(char oneIn) {
      switch (oneIn) {
        case 'R': direction = direction.turnRight(); break;
        case 'L': direction = direction.turnLeft(); break;
        case 'F':
          final int nextX = posX + direction.changeX();
          final int nextY = posY + direction.changeY();
          if (nextX<0 || nextX>=numOfColumns || nextY<0 || nextY>=numOfRows){
            if (!board[posY][posX]) {
              board[posY][posX] = true;
              alive = false;
            }
          } 
          else {
            posX = nextX;
            posY = nextY;
          }
          break;
      }
    }

  }

  public static void main(String[] args){
    try (Scanner in = new Scanner(System.in);){
      final int c = in.nextInt() + 1;
      final int r = in.nextInt() + 1;
      final boolean[][] board = new boolean[r][c];
      for (int i = 0; i < r; ++i) {
        Arrays.fill(board[i], false);
      }
      while (in.hasNext()){
        final Robot robot = new Robot(in.nextInt(), in.nextInt(),
            Direction.fromRep(in.next()), board);
        robot.follow(in.next());
        robot.output();
      }
    }
  }

}
