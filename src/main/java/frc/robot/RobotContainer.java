// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.Joystick;
import frc.robot.subsystems.DriveTrain;
import frc.robot.subsystems.Launcher;
//import frc.robot.commands.ExampleCommand;
//import frc.robot.subsystems.ExampleSubsystem;

import frc.robot.commands.DriveCommand;
import frc.robot.commands.LaunchCommand;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;

/**
 * This class is where the bulk of the robot should be declared. Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls). Instead, the structure of the robot (including
 * subsystems, commands, and button mappings) should be declared here.
 */
public class RobotContainer {
  // The robot's subsystems and commands are defined here...
  //private final ExampleSubsystem m_exampleSubsystem = new ExampleSubsystem();
  private final DriveTrain m_driveTrain = new DriveTrain();

  //private final ExampleCommand m_autoCommand = new ExampleCommand(m_exampleSubsystem);
  private final DriveCommand m_driveCommand = new DriveCommand(m_driveTrain);

  public static Joystick joystick = new Joystick(Constants.joystickPort);
  public static Joystick throttle = new Joystick(Constants.throttlePort);

  /** The container for the robot. Contains subsystems, OI devices, and commands. */
  public RobotContainer() {
    final JoystickButton LauncherTop = new JoystickButton(joystick,Constants.launcherTop); // Configure the button bindings
    Launcher.whenPressed(new LaunchCommand(0.70));
    configureButtonBindings();
    final JoystickButton LauncherButton = new JoystickButton(joystick, Constants.launcherBottom);
    Launcher.whenPressed(new LaunchCommand(0.70));

    final JoystickButton driveCommandButton = new JoystickButton(throttle, Constants.motorL1);
 




    
  }

  /**
   * Use this method to define your button->command mappings. Buttons can be created by
   * instantiating a {@link GenericHID} or one of its subclasses ({@link
   * edu.wpi.first.wpilibj.Joystick} or {@link XboxController}), and then passing it to a {@link
   * edu.wpi.first.wpilibj2.command.button.JoystickButton}.
   */
  private void configureButtonBindings() {

  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
   
  public Command getAutonomousCommand() {
    // An ExampleCommand will run in autonomous
    return m_autoCommand;
  */
  }
}
