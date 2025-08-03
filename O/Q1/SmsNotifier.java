package O.Q1;

public class SmsNotifier implements Notifier {

  @Override
  public void send(String message) {
    System.out.println("Sending SMS: " + message);
  }

}
