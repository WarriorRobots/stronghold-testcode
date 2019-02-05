/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class TeleopTankDrive extends Command {
  public TeleopTankDrive() {
    requires(Robot.drivetrain);
  }

  @Override
  protected void execute() {
    Robot.drivetrain.tankDriveTeleop(Robot.input.getLeftY(), Robot.input.getRightY());
  }

  @Override
  protected boolean isFinished() {
    return false;
  }

  @Override
  protected void end() {
    Robot.drivetrain.stopDrive();
  }
}
