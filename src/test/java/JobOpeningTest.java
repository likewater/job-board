import org.junit.*;
import static org.junit.Assert.*;

public class JobOpeningTest {

  @Test
  public void JobTitle_createsObjectCorrectly_true() {
    JobOpening newJob = new JobOpening("title", "description", "contact", "city");
    assertEquals(true, newJob instanceof JobOpening);
  }

  @Test
  public void getJobTitle_addJobTitle_string() {
    JobOpening newJob = new JobOpening("title", "description", "contact", "city");
    assertEquals("title", newJob.getJobTitle());
  }

}
