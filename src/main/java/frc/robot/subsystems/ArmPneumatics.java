package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj.Solenoid;
import frc.robot.Constants;

public class ArmPneumatics extends SubsystemBase{
    Solenoid armPneumatics = null;
    
    Solenoid m_armPneumatics = new Solenoid(Constants.pcm1);
  
    public void out(){
      m_armPneumatics.set(true);
    }
  
    public void in(){
      m_armPneumatics.set(false);
  }
  
    @Override
    public void periodic() {
      // This method will be called once per scheduler run
    }
    }