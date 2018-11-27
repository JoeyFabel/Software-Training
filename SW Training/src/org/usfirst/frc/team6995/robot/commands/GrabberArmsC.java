package org.usfirst.frc.team6995.robot.commands;

import org.usfirst.frc.team6995.robot.Robot;
import org.usfirst.frc.team6995.robot.RobotMap;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class GrabberArmsC extends Command {

    public GrabberArmsC() {
    	requires(Robot.grabberArms);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	if (Robot.m_oi.joystick.getRawButtonPressed(RobotMap.JB_GRABBER_ARM_OPEN) == true) {
    		Robot.grabberArms.MoveGrabberArms(DoubleSolenoid.Value.kForward);
    		System.out.println("Grabbers open/solenoid forward");
    	} else if (Robot.m_oi.joystick.getRawButtonPressed(RobotMap.JB_GRABBER_ARM_CLOSE) == true) {
    		Robot.grabberArms.MoveGrabberArms(DoubleSolenoid.Value.kReverse);
    		System.out.println("Grabbers close/solenoid reverse");
    	} 
    	else {
    		Robot.grabberArms.MoveGrabberArms(DoubleSolenoid.Value.kOff);
    	}
    	}
    

            //Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;


    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.grabberArms.MoveGrabberArms(DoubleSolenoid.Value.kOff);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}
