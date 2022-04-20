// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.math.util.Units;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
    public final static class DriveConstants {
        public final static int kFrontLeftDriveId = -1; // placeholder
        public final static int kFrontLeftSwerveId = -1; // placeholder
        public final static int kFrontRightDriveId = -1; // placeholder
        public final static int kFrontRightSwerveId = -1; // placeholder
        public final static int kRearLeftDriveId = -1; // placeholder
        public final static int kRearLeftSwerveId = -1; // placeholder
        public final static int kRearRightDriveId = -1; // placeholder
        public final static int kRearRightSwerveId = -1; // placeholder

        public final static int absoluteEncoderCpr = 1024;

        public final static double kSwerveGearing = -1; // placeholder
        public final static double kAbsoluteEncoderGearing = -1; // placeholder
        public final static double kDriveGearing = 1 / 6.54;
        public final static double kWheelDiameter = Units.inchesToMeters(4);

        public final static double kP = -1; // placeholder
        public final static double kI = -1; // placeholder
        public final static double kD = -1; // placeholder

        public static double ticksToRadians(double ticks) {
            return ticks * ((2 * Math.PI) / (absoluteEncoderCpr / kAbsoluteEncoderGearing));
        }

        public static double ticksToMeters(double ticks) {
            return ticks * ((absoluteEncoderCpr / kAbsoluteEncoderGearing) / (kWheelDiameter * Math.PI));
        }
    }
}
