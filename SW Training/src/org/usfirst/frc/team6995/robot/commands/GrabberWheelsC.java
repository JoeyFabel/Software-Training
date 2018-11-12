package org.usfirst.frc.team6995.robot.commands;

import org.usfirst.frc.team6995.robot.Robot;
import org.usfirst.frc.team6995.robot.RobotMap;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class GrabberWheelsC extends Command {

    public GrabberWheelsC() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.grabberWheels);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	if (Robot.m_oi.joystick.getRawButtonPressed(RobotMap.JB_WHEELS_COLLECT) == true) {
    		Robot.grabberWheels.grabberWheelDrive(1.0);    		
    		System.out.println("Grabber wheels collecting.");
    	} else if (Robot.m_oi.joystick.getRawButtonPressed(RobotMap.JB_WHEELS_EJECT) == true) {
    		Robot.grabberWheels.grabberWheelDrive(-1.0);    
    		System.out.println("Grabber wheels ejecting.");
    	} else {
    		Robot.grabberWheels.grabberWheelDrive(0.0);
    	}
    	
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return true;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.grabberWheels.grabberWheelDrive(0.0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}
