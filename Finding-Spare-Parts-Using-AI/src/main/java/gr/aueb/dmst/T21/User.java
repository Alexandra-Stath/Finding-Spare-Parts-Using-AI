package gr.aueb.dmst.T21;
// Κλάση που αναπαριστά έναν χρήστη
public class User {
  // Ιδιότητες του χρήστη
  private String name; // το όνομα του χρήστη
  private String email; // το email του χρήστη
  private String password; // το password του χρήστη
  private String avatar; // το avatar του χρήστη

  // Κατασκευαστής της κλάσης
  public User(String name, String email, String password, String avatar) {
    this.name = name;
    this.email = email;
    this.password = password;
    this.avatar = avatar;
  }

  // Μέθοδοι που επιστρέφουν ή τροποποιούν τις ιδιότητες του χρήστη
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getAvatar() {
    return avatar;
  }

  public void setAvatar(String avatar) {
    this.avatar = avatar;
  }

  // Μέθοδος που εμφανίζει το προφίλ του χρήστη
  public void showProfile() {
    System.out.println("Όνομα: " + name);
    System.out.println("Email: " + email);
    System.out.println("Avatar: " + avatar);
  }
}