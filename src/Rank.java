import java.util.ArrayList;
import java.util.Arrays;

public abstract class Rank {
  private ArrayList<Cell> Cells;
  private String owner;
  private String rankName;

  void createEmptyCells(){
    Cells = new ArrayList<Cell>();
    for (int i = 0; i < 5; i++) {
      Cells.add(new Cell());
    }
  }

  public boolean setOwner(String ownerID){
    if (owner==""){
      owner = ownerID;
      return true;
    }
    return false;
  }
  public String getOwner(){
    return owner;
  }

  public boolean setRankName(String rName){
    if (rankName==null){
      rankName = rName;
      return true;
    }
    return false;
  }
  public String getRankName(){
    return rankName;
  }

  @Override
  public String toString(){
    return getRankName() + Arrays.toString(Cells.toArray());
  }
}
