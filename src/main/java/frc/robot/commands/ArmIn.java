package frc.robot.commands;

//import frc.robot.Robot;
import frc.robot.subsystems.ArmPneumatics;
import edu.wpi.first.wpilibj2.command.CommandBase;

public class ArmIn extends CommandBase {
private static final ArmIn ArmPneumatics = null;
  @SuppressWarnings({ "PMD.UnusedPrivateField", "PMD.SingularField" })
  private final ArmIn m_ArmPneumatics;
}
/**
   * Creates a new ExampleCommand.
   *
   * @param subsystem The subsystem used by this command.
   */
  public ArmIn(ArmPneumatics subsystem) {
    m_ArmPneumatics = ArmPneumatics;
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
    //Robot.ArmPneumatics.in();
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
