// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
    //--------------------------------------CONTROLLS--------------------------------------\\
    public static int joystickPort = 0;
    public static int throttlePort = 1;

    //--------------------------------------DRIVE TRAIN--------------------------------------\\
    public static int motorL1 = 0;
    public static int motorL2 = 1;
    public static int motorR1 = 2;
    public static int motorR2 = 3;

    //--------------------------------------MOTORS--------------------------------------\\
    public static int launcherTop = 4;
    public static int launcherBottom = 5;
    //m_launcherGroup = new launcherGroup(launcherTop,launcherBottom);

    //--------------------------------------PNEUMATICS--------------------------------------\\
    public static int pcm1 = 0;
    public static int ArmIn = 1;
    public static int ArmOut = 2;
}
