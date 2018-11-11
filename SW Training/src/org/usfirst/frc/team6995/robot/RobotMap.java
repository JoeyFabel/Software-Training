package org.usfirst.frc.team6995.robot;

import edu.wpi.first.wpilibj.Preferences;

public class RobotMap {
	
	//Talons
	public static int DRIVEBASE_RIGHT_TALON_CAN_ID = 2;
	public static int DRIVEBASE_LEFT_TALON_CAN_ID = 3;

	
	public static int OI_JOYSTICK = 0;
	public static int DRIVE_MOVE_AXIS = 1;
	public static int DRIVE_ROTATE_AXIS = 0;

	//Preferences
	public static final double AUTO_DISTANCE = Preferences.getInstance().getDouble("AUTO_DISTANCE",  -50);
	public static final double AUTO_TIME = Preferences.getInstance().getDouble("AUTO_TIME", 10);
	public static final double AUTO_SPEED = Preferences.getInstance().getDouble("AUTO_SPEED", 0.5);
	
}
