package frc.robot.commands;

import frc.robot.subsystems.ArmPneumatics;
import edu.wpi.first.wpilibj2.command.CommandBase;

public class ArmOut extends CommandBase {
    private static final ArmOut ArmPneumatics = null;
    @SuppressWarnings({ "PMD.UnusedPrivateField", "PMD.SingularField" })
    private final ArmOut m_ArmPneumatics;
}

/**
   * Creates a new ExampleCommand.
   *
   * @param subsystem The subsystem used by this command.
   */
  public ArmOut(ArmPneumatics subsystem) {
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
    //Robot.armPneumatics.in();
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