import org.junit.*;
import static org.junit.Assert.*;

public class CityTest {

  @Test
  public void City_createsObjectCorrectly_true() {
    City newCity = new City("city");
    assertEquals(true, newCity instanceof City);
  }

  @Test
  public void City_addJobOpeningToCityArrayList_Object(){
    List<Object> cityArrayList = new ArrayList<Object>();
    JobOpening newJobOpening = new JobOpening("title", "description", "contact", "city");
    cityArrayList.add(newJobOpening);
    assertEquals(cityArrayList, cityTest.city());
  }
}
