// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.RobotContainer;
import frc.robot.subsystems.DrivetrainSub;

public class DriveTrainCommands extends CommandBase {
  /** Creates a new DriveTrainCommands. */
  public DriveTrainCommands() {
    addRequirements(DrivetrainSub.GetInstance());
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    // Assign joysticks
    double leftJoyStick = RobotContainer.GetInstance().getLeftJoystick();
    double rightJoyStick = RobotContainer.GetInstance().getRightJoystick();
    // Sets a value for the motors according to the value of the joysticks
    DrivetrainSub.GetInstance().setLeftDrive(leftJoyStick);
    DrivetrainSub.GetInstance().setRightDrive(rightJoyStick);
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }

  public static DriveTrainCommands instance;
  public static DriveTrainCommands GetInstance(){
    if(instance == null)
      instance = new DriveTrainCommands();
    return instance;
  }

}
