package D.Q1;

public class Switch {
  private Electronic device;

  public Switch(Electronic device) {
    this.device = device;
  };

  public void toggle(boolean on) {
    if (on)
      device.turnOn();
    else
      device.turnOff();
  }
}