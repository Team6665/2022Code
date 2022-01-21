package frc.robot.commands;

import frc.robot.subsystems.Shooting;
import edu.wpi.first.wpilibj2.command.CommandBase;
//import frc.robot.RobotContainer;
//import frc.robot.subsystems.DriveTrain;

public class LauncherDeploy extends CommandBase {
    private static final LauncherDeploy Shooting = null;
    @SuppressWarnings({"PMD.UnusedPrivateField", "PMD.SingularField"})
    private final LauncherDeploy m_Shooting;
}

/**
   * Creates a new ExampleCommand.
   *
   * @param subsystem The subsystem used by this command.
   */
  public LauncherDeploy(Shooting subsystem) {
    m_Shooting = Shooting;
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(subsystem);
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