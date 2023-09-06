import java.util.LinkedList;

public class Battlefield {
  private LinkedList<Rank> Ranks;
  private String p1ID;
  private String p2ID;

  Battlefield(){
    Ranks = new LinkedList<Rank>();
    p1ID = "1";
    p2ID = "2";
    Ranks.add(new Rear(p1ID));
    Ranks.add(new Centre(p1ID));
    Ranks.add(new Reserves(p1ID));
    Ranks.add(new Vanguard(p1ID));
    Ranks.add(new Vanguard(p2ID));
    Ranks.add(new Reserves(p2ID));
    Ranks.add(new Centre(p2ID));
    Ranks.add(new Rear(p2ID));
  }

  @Override
  public String toString(){
    String output = "";
    for (Rank rank : Ranks) {
      output += rank;
      output += "\n";
    }
    return output;
  }
}
