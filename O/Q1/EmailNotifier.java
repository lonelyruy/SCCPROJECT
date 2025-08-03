package O.Q1;

public class EmailNotifier implements Notifier {

  @Override
  public void send(String message) {
    System.out.println("Sending email: " + message);
  }
}
