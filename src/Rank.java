import java.util.ArrayList;
import java.util.Arrays;

public class Rank {
  private ArrayList<Cell> Cells;
  Rank(){
    Cells = new ArrayList<Cell>();
    for (int i = 0; i < 5; i++) {
      Cells.add(new Cell());
    }
  }

  @Override
  public String toString(){
    return Arrays.toString(Cells.toArray());
  }
}
