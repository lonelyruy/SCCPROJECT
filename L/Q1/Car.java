package L.Q1;

public class Car implements Vehicle {

  @Override
  public void wheels() {
    System.out.println("Its has 4 wheels");
  }

  public void startEngine() {
    System.out.println("Engine started");
  }
}