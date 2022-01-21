package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.RobotContainer;
import frc.robot.subsystems.Launcher;
//import frc.robot.subsystems.ExampleSubsystem;

public class LaunchCommand extends CommandBase {
    @SuppressWarnings({"PMD.UnusedPrivateField", "PMD.SingularField"})
    private final Launcher m_launcher;
   // @SuppressWarnings({"PMD.UnusedPrivateField", "PMD.SingularField"})
  //private final Launcher m_subsystem;
  
}

/**
   * Creates a new ExampleCommand.
   *
   * @param subsystem The subsystem used by this command.
   */
  public LaunchCommand(Launcher subsystem) {
    m_launcher = subsystem;
    // Use addRequirements() here to declare subsystem dependencies.
    subsystem.TakeJoystickInput(RobotContainer.joystick);
    addRequirements(subsystem);
  }

  public Launcher getM_launcher() {
    return m_launcher;
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {

  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
