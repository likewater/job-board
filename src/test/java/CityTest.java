import org.junit.*;
import static org.junit.Assert.*;

public class CityTest {

  @Test
  public void City_createsObjectCorrectly_true() {
    City newCity = new City("city", null);
    assertEquals(true, newCity instanceof City);
  }

  @Test
  public void City_listOfCities_Object(){
    //List<Object> cityArrayList = new ArrayList<Object>();
    JobOpening newJobOpening = new JobOpening("title", "description", "contact", "city");
    City newCity = new City("city", newJobOpening);
    Object cityArrayList = cityArrayList.add(newJobOpening);
    //assertEquals(cityArrayList.get(0), newCity.getListOfCities(newJobOpening));
    assertEquals(true, cityArrayList.get(0) instanceof City);
  }
}
