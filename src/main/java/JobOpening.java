public class JobOpening {
  private String mJobTitle;
  private String mJobDescription;
  private String mContact;
  private String mCity;

  public JobOpening(String jobTitle, String jobDescription, String contact, String city) {
    mJobTitle = jobTitle;
    mJobDescription = jobDescription;
    mContact = contact;
    mCity = city;
  }

  public String getJobTitle() {
    return mJobTitle;
  }

  public String getJobDescription() {
    return mJobDescription;
  }

  public String getContact() {
    return mContact;
  }

  public String getCity() {
    return mCity;
  }
}
