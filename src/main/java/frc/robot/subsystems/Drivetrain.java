// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;

import edu.wpi.first.math.kinematics.SwerveDriveKinematics;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.DriveConstants;

public class Drivetrain extends SubsystemBase {
  private WPI_TalonFX m_fLDrive, m_fLSwerve, m_fRDrive, m_fRSwerve, m_rLDrive, m_rLSwerve, m_rRDrive, m_rRSwerve;
  
  private SwerveDriveKinematics m_swerveKinematics;
  /** Creates a new Drivetrain. */
  public Drivetrain() {
    m_fLDrive = new WPI_TalonFX(DriveConstants.kFrontLeftDrive);
    m_fRDrive = new WPI_TalonFX(DriveConstants.kFrontRightDrive);
    m_rLDrive = new WPI_TalonFX(DriveConstants.kRearLeftDrive);
    m_rRDrive = new WPI_TalonFX(DriveConstants.kRearRightDrive);

    m_fLSwerve = new WPI_TalonFX(DriveConstants.kFrontLeftSwerve);
    m_fRSwerve = new WPI_TalonFX(DriveConstants.kFrontRightSwerve);
    m_rLSwerve = new WPI_TalonFX(DriveConstants.kRearLeftSwerve);
    m_rRSwerve = new WPI_TalonFX(DriveConstants.kRearRightSwerve);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
