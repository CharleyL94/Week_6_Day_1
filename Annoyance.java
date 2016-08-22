public class Annoyance{
  private int levelOfAnnoyance;
  private Tourists[] crowd;

  public Annoyance(int levelOfAnnoyance){
    this.levelOfAnnoyance = levelOfAnnoyance;
    this.crowd = new Tourists[10];
  }
  public int getAnnoyanceLevel(){
  return this.levelOfAnnoyance;
  }

  public int touristsCount(){
    int counter = 1;

    for(Tourists tourists : crowd){
      if(tourists != null){
        counter++;
      }
    }
    return counter;
  }

  public void increase(Tourists tourists){
    if(annoyancePeaked()) return;
    int touristsCount = touristsCount();
    crowd[touristsCount] = tourists;
  }

  public boolean annoyancePeaked(){
    return touristsCount() == crowd.length;
  }

  public void leaving(){
    for(int i=1; i < crowd.length; i++){
      crowd[i] = null;
    }
  }
}