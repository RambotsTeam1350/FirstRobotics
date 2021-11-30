// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class DrivetrainSub extends SubsystemBase {
  /** Creates a new DrivetrainSub. */
  public DrivetrainSub() {

  }

  //Assign motors
  public Victor rightMotor = new Victor(Constants.LEFTMOTOR);
  public Victor leftMotor = new Victor(Constants.RIGHTMOTOR);

  // Function that sets the speed of the Motor
  public void setLeftDrive(double speed){
    leftMotor.setSpeed(-speed);
  }
  public void setRightDrive(double speed){
    rightMotor.setSpeed(speed);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  public static DrivetrainSub instance;
  public static DrivetrainSub GetInstance(){
    if(instance == null)
      instance = new DrivetrainSub();
    return instance;
  }
}
