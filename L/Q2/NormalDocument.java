package L.Q2;

public class NormalDocument implements Readable, Printable {

  @Override
  public void print() {
    System.out.println("print");
  }

  @Override
  public void read() {
    System.out.println("reading");
  }

}
