package org.usfirst.frc.team6995.robot.commands;
import org.usfirst.frc.team6995.robot.Robot;
import org.usfirst.frc.team6995.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

 
public class AutoDriveDistanceC extends Command {
	double autospeed;
	
    public AutoDriveDistanceC() {
       requires(Robot.drivebase);
       autospeed = RobotMap.AUTO_SPEED * Math.signum(RobotMap.AUTO_DISTANCE);    		   
    }

    // Called just before this Command runs the first time
    protected void initialize() {    	
    	Robot.drivebase.resetEncoder();
    	SmartDashboard.putNumber("Speed in AutoDistance", (autospeed));
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    Robot.drivebase.arcadeDrive((autospeed), 0);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
    	SmartDashboard.putNumber("DistanceTraveled", Robot.drivebase.getDistanceTraveled());
    	return (Math.abs(Robot.drivebase.getDistanceTraveled()) >= Math.abs(RobotMap.AUTO_DISTANCE));
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.drivebase.arcadeDrive(0,  0);
    	Robot.drivebase.resetEncoder();
    	Robot.drivebase.resetEncoder();//Twice for same reason as before.
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    end();
    }
}
