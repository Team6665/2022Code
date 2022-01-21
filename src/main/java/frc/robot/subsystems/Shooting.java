package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
import edu.wpi.first.wpilibj.Spark;
//import edu.wpi.first.wpilibj.Joystick;
//import frc.robot.RobotContainer;

public class Shooting extends SubsystemBase {
    /**
     * Creates a new ExampleSubsystem.
     */
    public Shooting() {
      
      Spark launcherTopMotor = new Spark(Constants.launcherTop);
      Spark launcherBottomMotor = new Spark(Constants.launcherBottom);
  
      launcherTopMotor.setInverted(true);
      
   
      //  PUT BUTTONS HERE
  
  
    }
  
    
    @Override
    public void periodic() {
      // This method will be called once per scheduler run
    }
  }
  
