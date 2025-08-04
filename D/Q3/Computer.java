package D.Q3;

public class Computer {
  private Hardware hardware;

  public Computer(Hardware hardware) {
    this.hardware = hardware;
  }

  public void start() {
    hardware.input();
  }
}