package S;

public class UserRegister {
  public void register(String email) {
    if (!email.contains("@")) {
      throw new IllegalArgumentException("Invalid email");
    }
  }
}