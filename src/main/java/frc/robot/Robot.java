/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

public class Robot extends TimedRobot {

    double leftSpeed;
    double rightSpeed;

    Joystick rightJoy;
    Joystick leftJoy;
    XboxController xbox;
    
    WPI_TalonSRX leftBack;
    WPI_TalonSRX rightBack;
    WPI_TalonSRX leftFront;
    WPI_TalonSRX rightFront;

    SpeedControllerGroup leftGroup;
    SpeedControllerGroup rightGroup;
    DifferentialDrive drive;

    public void robotInit() {
        rightJoy = new Joystick(1);
        leftJoy = new Joystick(0);
        xbox = new XboxController(2);
        leftBack = new WPI_TalonSRX(1);
        rightBack = new WPI_TalonSRX(2);
        leftFront = new WPI_TalonSRX(3);
        rightFront = new WPI_TalonSRX(4);
        
        leftGroup = new SpeedControllerGroup(leftFront, leftBack);
        rightGroup = new SpeedControllerGroup(rightFront, rightBack);
		drive = new DifferentialDrive(leftGroup, rightGroup);
    }

    public void robotPeriodic() {
        leftSpeed = leftJoy.getY();
        rightSpeed = rightJoy.getY();
    }

    public void disabledInit() {
        drive.stopMotor();
        
    }

    public void teleopInit() {
        drive.stopMotor();
    }

    public void teleopPeriodic() {
        drive.tankDrive(leftSpeed, rightSpeed);
    }

}