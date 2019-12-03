import edu.wpi.first.wpilibj.*;
public class OI {
  public static final double JOY_DEADZONE = 0.05;
    public final Joystick LEFT_JOY = new Joystick(RobotMap.LEFT_JOYSTICK.value);

    public double getJoyX() {
        double raw = LEFT_JOY.getX();
        return Math.obs(rawx) < JOY_DEADZONE ? 0.0 : raw;
        system.out.println(rawx);
    }
    public double getJoyY() {
        double raw = LEFT_JOY.getY();
        return Math.obs(rawy) < JOY_DEADZONE ? 0.0 : raw;
        system.out.println(rawy);
    }
}