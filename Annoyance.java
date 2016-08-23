import java.util.*;

public class Annoyance{

  private int levelOfAnnoyance;
  private ArrayList<Avoidable> crowd;

  public Annoyance(int levelOfAnnoyance){
    this.levelOfAnnoyance = levelOfAnnoyance;
    this.crowd = new ArrayList<Avoidable>();
  }
  public int getAnnoyanceLevel(){
  return this.levelOfAnnoyance;
  }

  public int touristsCount(){
    return crowd.size();
    // int counter = 1;

    // for(Tourists tourists : crowd){
    //   if(tourists != null){
    //     counter++;
    //   }
    // }
    // return counter;
  }

  public void increase(Avoidable tourists){
    crowd.add(tourists);
    // if(annoyancePeaked()) return;
    // int touristsCount = touristsCount();
    // crowd[touristsCount] = tourists;
  }

  // public boolean annoyancePeaked(){
  //   return touristsCount() == crowd.size();
  // }

  public void leaving(){
      crowd.clear();
    // for(int i=1; i < crowd.length; i++){
    //   crowd[i] = null;
    // }
  }
}