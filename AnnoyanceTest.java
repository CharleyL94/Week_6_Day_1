import static org.junit.Assert.*;
import org.junit.*;

public class AnnoyanceTest{
  Annoyance annoyance;
  Tourists tourists;
  Flyers flyers;
  Survey survey;

  @Before
  public void before() {
    annoyance = new Annoyance();
    tourists = new Tourists();
    flyers = new Flyers();
    survey = new Survey();
  }

  @Test 
  public void hasAnnoyance(){
    assertEquals(1, annoyance.getAnnoyanceLevel() );
  }

  @Test
  public void levelOfAnnoyanceStartsAtZero(){
    assertEquals(0, annoyance.touristsCount());
  }

@Test
public void levelOfAnnoyanceCanIncrease(){
  annoyance.increase(tourists);
  assertEquals(2, annoyance.touristsCount());
}

// @Test
// public void cannotGetEvenMoreAnnoyedWhenAnnoyancePeaked(){
//   for(int i=1; i < 11; i++){
//     annoyance.increase(tourists);
//   }
//   assertEquals(10, annoyance.touristsCount());
// }

// @Test
// public void annoynacePeaked(){
//   for(int i=1; i < 11; i++){
//     annoyance.increase(tourists);
//   }
//   assertEquals(true, annoyance.annoyancePeaked());
// }

// @Test
// public void annoyanceHasNotPeaked(){
//   for(int i=1; i < 7; i++){
//   }
//     assertEquals(false, annoyance.annoyancePeaked());
//   }

@Test
public void annoyanceShouldResetAfterIHaveLeftTown(){
  annoyance.increase(tourists);
  assertEquals(2, annoyance.touristsCount());
  annoyance.leaving();
  assertEquals(1, annoyance.touristsCount());
}


}