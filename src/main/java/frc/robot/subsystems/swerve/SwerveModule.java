package frc.robot.subsystems.swerve;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;

import edu.wpi.first.math.controller.PIDController;
import edu.wpi.first.wpilibj.AnalogEncoder;
import edu.wpi.first.wpilibj.Encoder;
import frc.robot.Constants.DriveConstants;

public class SwerveModule {
    private WPI_TalonFX m_drive, m_swerve;

    private PIDController turningPidController;

    private AnalogEncoder absoluteEncoder;
    private boolean absoluteEncoderReversed;
    private double absoluteEncoderOffsetRad;
        
    public SwerveModule(int driveId, int swerveId, boolean driveReversed, boolean swerveReversed, int absoluteEncoderId, 
        boolean absoluteEncoderReversed, double absoluteEncoderOffsetRad) {
        m_drive = new WPI_TalonFX(driveId);
        m_swerve = new WPI_TalonFX(swerveId);

        m_drive.setInverted(driveReversed);
        m_swerve.setInverted(swerveReversed);

        absoluteEncoder = new AnalogEncoder(absoluteEncoderId);
        this.absoluteEncoderReversed = absoluteEncoderReversed;
        this.absoluteEncoderOffsetRad = absoluteEncoderOffsetRad;

        absoluteEncoder.setDistancePerRotation(DriveConstants.ticksToRadians(1024 * (1 / DriveConstants.kSwerveGearing)));

        turningPidController = new PIDController(DriveConstants.kP, DriveConstants.kI, DriveConstants.kD);
        turningPidController.enableContinuousInput(-Math.PI, Math.PI);
    }

    public double getDriveDistanceMeters() {
        return DriveConstants.ticksToMeters(m_drive.getSelectedSensorPosition());
    }
}
