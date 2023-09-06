import java.util.LinkedList;

public class Battlefield {
  private LinkedList<Rank> Ranks;
  private String p1ID;
  private String p2ID;
  Battlefield(){
    Ranks = new LinkedList<Rank>();
    p1ID = "1";
    p2ID = "2";
  }
}
