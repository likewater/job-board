import java.util.List;
import java.util.ArrayList;

public class City {
  private String mCity;
  private Object mJob;

  public City(String city, Object job) {
    mCity = city;
    mJob = job;
  }

  public Object getListOfCities(Object job){
    List<JobOpening> cityArrayList = new ArrayList<JobOpening>();
    return cityArrayList.get(0);
  }

}
