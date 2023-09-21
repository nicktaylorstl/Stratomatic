import java.util.HashMap;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

          //HashMap containing the actual baseball result.
          HashMap<Integer, String> bbResults = new HashMap<>();
          bbResults.put(1, "Single");
          bbResults.put(2, "Double");
          bbResults.put(3, "Triple");
          bbResults.put(4, "Home Run");
          bbResults.put(5, "Walk");
          bbResults.put(6, "Hard hit groundball for an out");
          bbResults.put(7, "Medium hit groundball for an out");
          bbResults.put(8, "Weakly hit groundball for an out");
          bbResults.put(9, "Hard hit flyball for an out");
          bbResults.put(10, "Medium hit flyball for an out");
          bbResults.put(11, "Weakly hit fylball for an out");
          bbResults.put(12, "Strikeout");
          bbResults.put(13, "Hit by Pitch");
          bbResults.put(14, "Lineout");
          bbResults.put(15, "Popout");

          // creating the 2D arrays for batter and pitcher
          int[][] batter = new int[3][11];
          int[][] pitcher = new int[3][11];

          int[][] yadi = {
                  {10, 12, 15, 6, 15, 6, 14, 6, 14, 6, 6},
                  {6, 6, 14, 1, 6, 10, 15, 6, 6, 15, 15},
                  {14, 5, 4, 2, 2, 1, 1, 10, 1, 1, 14}
          };

          int[][] waino = {
                  {7, 10, 8, 12, 1, 5, 3, 8, 11, 8, 11},
                  {10, 5, 15, 4, 7, 1, 11, 12, 6, 7, 8},
                  {8, 8, 6, 12, 12, 2, 1, 12, 9, 9, 7}
          };
          batter = yadi;
          pitcher = waino;

          rollDice(bbResults,batter,pitcher);
          System.out.println("----------------------------------------------------------");
          rollDice(bbResults,batter,pitcher);
          System.out.println("----------------------------------------------------------");
          rollDice(bbResults,batter,pitcher);



    }

    public static void rollDice ( HashMap<Integer, String> results, int[][]batter, int[][] pitcher){
          int row = d6();
          int column = (d6() + d6());
          int outcome = 99;
          if (row <3){
                outcome = batter[row][column];
          } else {
                outcome = pitcher[row-3][column];
          }
          System.out.println("You rolled " + (row + 1) +" and " + (column + 2));
          System.out.println("The result of the at bat is a " + results.get(outcome));

    }
    public static int d6(){
          int i = (int) (Math.random() *6);
          return i;
    }
}
