package org.usfirst.frc.team6995.robot.commands;

import org.usfirst.frc.team6995.robot.Robot;
import org.usfirst.frc.team6995.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class AutoDriveTimeC extends Command {
	double autospeed;	
	
    public AutoDriveTimeC() {           
    	requires(Robot.drivebase);
    	autospeed = RobotMap.AUTO_SPEED * Math.signum(RobotMap.AUTO_DISTANCE);    			
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	setTimeout(RobotMap.AUTO_TIME);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.drivebase.arcadeDrive(autospeed, 0);    	
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return isTimedOut();
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.drivebase.arcadeDrive(0, 0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}
