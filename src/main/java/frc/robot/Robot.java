// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.motorcontrol.Spark;

/**
 * The VM is configured to automatically run this class, and to call the functions corresponding to
 * each mode, as described in the TimedRobot documentation. If you change the name of this class or
 * the package after creating this project, you must also update the build.gradle file in the
 * project.
 */
public class Robot extends TimedRobot {
  /**
   * This function is run when the robot is first started up and should be used for any
   * initialization code.
   */

   private spark leftMotor1 = new spark(0);
   private spark leftMotor2 = new spark(1);
   private spark rightMotor1 = new spark(2);
   private spark rightMotor2 = new spark(3);

  @Override
  public void robotInit() {}

  @Override
  public void robotPeriodic() {}

  @Override
  public void autonomousInit() {}

  @Override
  public void autonomousPeriodic() {}

  @Override
  public void teleopInit() {}

  @Override
  public void teleopPeriodic() {}
    leftmotor1.set(0.5);
    leftmotor2.set(0.5);
    rightmotor1.set(-0.5);
    rightmotor2.set(-0.5);

  @Override
  public void disabledInit() {}

  @Override
  public void disabledPeriodic() {}

  @Override
  public void testInit() {}

  @Override
  public void testPeriodic() {}

  @Override
  public void simulationInit() {}

  @Override
  public void simulationPeriodic() {}

  public spark getLeftMotor1() {
    return leftMotor1;
  }

  public void setLeftMotor1(spark leftMotor1) {
    this.leftMotor1 = leftMotor1;
  }

  public spark getLeftMotor2() {
    return leftMotor2;
  }

  public void setLeftMotor2(spark leftMotor2) {
    this.leftMotor2 = leftMotor2;
  }

  public spark getRightMotor1() {
    return rightMotor1;
  }

  public void setRightMotor1(spark rightMotor1) {
    this.rightMotor1 = rightMotor1;
  }

  public spark getRightMotor2() {
    return rightMotor2;
  }

  public void setRightMotor2(spark rightMotor2) {
    this.rightMotor2 = rightMotor2;
  }
}
