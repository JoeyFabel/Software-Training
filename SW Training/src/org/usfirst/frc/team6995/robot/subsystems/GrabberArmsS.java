package org.usfirst.frc.team6995.robot.subsystems;

import org.usfirst.frc.team6995.robot.RobotMap;
import org.usfirst.frc.team6995.robot.commands.GrabberArmsC;

import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class GrabberArmsS extends Subsystem {

	private DoubleSolenoid grabberSolenoid = null;
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
   setDefaultCommand(new GrabberArmsC());
    }
    
    public GrabberArmsS() {
    	
    	grabberSolenoid = new DoubleSolenoid(1, RobotMap.GRABBER_ARM_FORWARD_PCM_ID, RobotMap.GRABBER_ARM_BACKWARD_PCM_ID);
    }
    
    public void MoveGrabberArms(DoubleSolenoid.Value Direction) {
    	grabberSolenoid.set(Direction);
    }
    }


