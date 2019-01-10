/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystem;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * Add your docs here.
 */
public class Pneumatics extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  DoubleSolenoid sol;

  public Pneumatics() {
    sol = new DoubleSolenoid(4,3);
  }

  public void forward() {
    sol.set(Value.kForward);
  }

  public void reverse() {
    sol.set(Value.kReverse);
  }

  public void off() {
    sol.set(Value.kOff);
  }

  @Override
  public void initDefaultCommand() {
  }

}
