package I.Q1;

public class Printer implements MachineScannable, MachinePrintable {
  @Override
  public void scan() {
    System.out.println("scanning");
  }

  @Override
  public void print() {
    System.out.println("Printing");
  }
}
