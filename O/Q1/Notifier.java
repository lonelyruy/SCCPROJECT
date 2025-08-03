package O.Q1;

// public class Notifier {

//     public void send(String type, String message) {
//         if (type.equals("email")) {
//             System.out.println("Sending email: " + message);
//         } else if (type.equals("sms")) {
//             System.out.println("Sending SMS: " + message);
//         }
//     }
// }

interface Notifier {
  void send(String message);
}
