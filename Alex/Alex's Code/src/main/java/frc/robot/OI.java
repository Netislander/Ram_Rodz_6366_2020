/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
  //// CREATING BUTTONS
  // One type of button is a joystick button which is any button on a
  //// joystick.
  // You create one by telling it which joystick it's on and which button
  // number it is.
  // Joystick stick = new Joystick(port);
  // Button button = new JoystickButton(stick, buttonNumber);

  public static OI instance = new OI();

  public Joystick stick1 = new JoyStick(0);

  public Button button1 = new JoystickButton(stick1, 1),
  button2 = new JoystickButton(stick1, 2),
  button3 = new JoystickButton(stick1, 3),
  button4 = new JoystickButton(stick1, 4),
  button5 = new JoystickButton(stick1, 5),
  button6 = new JoystickButton(stick1, 6),
  button7 = new JoystickButton(stick1, 7),
  button8 = new JoystickButton(stick1, 8);
  
  public double rawAxis0 = exampleStick.getRawAxis(0), 
  rawAxis1 = exampleStick.getRawAxis(1),
  rawAxis2 = exampleStick.getRawAxis(2),
  rawAxis3 = exampleStick.getRawAxis(3),
  rawAxis4 = exampleStick.getRawAxis(4),
  rawAxis5 = exampleStick.getRawAxis(5);


  public static OI getInstance() {
    return instance;
  }

  // example: button1.whenPressed(new ExampleCommand());



  // There are a few additional built in buttons you can use. Additionally,
  // by subclassing Button you can create custom triggers and bind those to
  // commands the same as any other Button.

  //// TRIGGERING COMMANDS WITH BUTTONS
  // Once you have a button, it's trivial to bind it to a button in one of
  // three ways:

  // Start the command when the button is pressed and let it run the command
  // until it is finished as determined by it's isFinished method.
  // button.whenPressed(new ExampleCommand());

  // Run the command while the button is being held down and interrupt it once
  // the button is released.
  // button.whileHeld(new ExampleCommand());

  // Start the command when the button is released and let it run the command
  // until it is finished as determined by it's isFinished method.
  // button.whenReleased(new ExampleCommand());
}
