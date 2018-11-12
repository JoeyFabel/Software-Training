package org.usfirst.frc.team6995.robot;

import edu.wpi.first.wpilibj.Preferences;

public class RobotMap {
	
	//Talons
	public static int DRIVEBASE_RIGHT_TALON_CAN_ID = 3;
	public static int DRIVEBASE_LEFT_TALON_CAN_ID = 2;

	public static int DRIVEBASE_RIGHT_BACK_TALON_CAN_ID = 5;
	public static int DRIVEBASE_LEFT_BACK_TALON_CAN_ID = 4;
	
	
	public static int LIFTER_PCM_ID = 5;
	public static int GRABBER_WHEEL_LEFT_CAN_ID = 7;
	public static int GRABBER_WHEEL_RIGHT_CAN_ID = 8;
	
	public static int GRABBER_ARM_FORWARD_PCM_ID = 0;
	public static int GRABBER_ARM_BACKWARD_PCM_ID = 1;//port 0 forward, port 1 backward.
	
	//add GrabberArm Subsystem and GrabberWheels Subsystem
	//COMPLETED.
	
	//add GrabberArmOpen and GrabberArmClose Commands
	//COMPLETED.
	
	//add GrabberWheelsCollect and GrabberWheelEject Commands
	//COMPLETED.
	
	public static int OI_JOYSTICK = 0;
	public static int DRIVE_MOVE_AXIS = 1;
	public static int DRIVE_ROTATE_AXIS = 0;
	public static int DRIVE_ROTATE_ZAXIS = 2;
	public static int DRIVE_THROT_AXIS = 4;

	public static int JB_GRABBER_ARM_CLOSE = 1;
	public static int JB_GRABBER_ARM_OPEN = 2;

	public static int JB_WHEELS_COLLECT = 4;
	public static int JB_WHEELS_EJECT = 6;
	
	//Preferences
	public static final double AUTO_DISTANCE = Preferences.getInstance().getDouble("AUTO_DISTANCE",  -50);
	public static final double AUTO_TIME = Preferences.getInstance().getDouble("AUTO_TIME", 10);
	public static final double AUTO_SPEED = Preferences.getInstance().getDouble("AUTO_SPEED", 0.5);
	
}
