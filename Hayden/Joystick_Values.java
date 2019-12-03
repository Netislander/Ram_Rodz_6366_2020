import java.util.scanner;

/**
 * Joystick_Values
 */
public class Joystick_Values {{
    
    Left_Stick = new Joystick(1);

    double value;
x = Left_Stick.getX();
y = Left_Stick.getY();
z = Left_Stick.getZ();
throttle = Left_Stick.getThrottle();
twist = Left_Stick.getTwist();

boolean buttonValue;
top = Left_Stick.getTop();
buttonValue = Left_Stick.getTrigger();

system.out.println("wowee");

while (x>0.05 || x<-0.05);{
    if (x>0) {
        joystickx = x^2;
    } else if (x<0) {
        joystickx = (x^2) * -1;
    }
    if (x>0) {
        System.out.print("Joystick X Input Positive");
    } else if (x<0) {
        System.out.print("Joystick X Input Negative");
    }
if (joystickx>=0) {
    Boolean Foward = true;
} else if (joystickx<0) {
    Boolean Reverse = true;
}
}




while (y>0.05 || y<-0.05);{
    if (y>0) {
        joysticky = y^2;
    } else if (y<0) {
        joysticky = (y^2) * -1;
    }
    if (y>0) {
        System.out.println("Joystick Input Positive");
    } else if (y<0) {
        System.out.println("Joystick Input Negative");
    }
    if (joysticky>=0) {
        Boolean y = true;
    }else if (joysticky<0) {
        Boolean y = true;
    }
}




while (z>0.05 || z<-0.05);{
    if (z>0) {
        joystickx = z^2;
    } else if (z<0) {
        joystickx = (z^2) * -1;
    }
    if (z>0) {
        System.out.println("Joystick Input Positive");
    } else if (z<0) {
        System.out.println("Joystick Input Negative");
    }
    if (joystickz>=0) {
        Boolean Right = true;
    }else if (joystickz<0) {
        Boolean left = true;
    }
}

if (joystickz>=0) {
    Boolean Foward = true;
}

if (top = true) {
    System.out.println("Button Input");
}
}}

