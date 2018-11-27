package org.usfirst.frc.team6995.robot.subsystems;

import org.usfirst.frc.team6995.robot.commands.GrabberWheelsC;
import org.usfirst.frc.team6995.robot.RobotMap;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

/**
 *
 */
public class GrabberWheelsS extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
	private Spark leftGrabberWheels = null;
	private Spark rightGrabberWheels = null;
	
	private DifferentialDrive differentialDrive = null;

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	setDefaultCommand(new GrabberWheelsC());
    }
    
    public GrabberWheelsS() {
    	leftGrabberWheels = new Spark(RobotMap.GRABBER_WHEEL_LEFT_CAN_ID);
    	rightGrabberWheels = new Spark(RobotMap.GRABBER_WHEEL_RIGHT_CAN_ID);
    	
    	differentialDrive = new DifferentialDrive(leftGrabberWheels, rightGrabberWheels);
    	differentialDrive.setSafetyEnabled(false);
    }
    
    public void grabberWheelDrive(double moveSpeed) {    	
    	differentialDrive.arcadeDrive(moveSpeed, 0.0);
    }
    }


