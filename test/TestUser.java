public class TestUser {
  public static void main(String[] args) {
    // Δημιουργία ενός αντικειμένου της κλάσης User
    User user1 = new User("Γιάννης", "giannis@gmail.com", "1234", "giannis.png");
    // Εμφάνιση του προφίλ του χρήστη
    user1.showProfile();
    // Αλλαγή του ονόματος του χρήστη
    user1.setName("Γιάννης Παπαδόπουλος");
    // Εμφάνιση του προφίλ του χρήστη μετά την αλλαγή
    user1.showProfile();
  }
}