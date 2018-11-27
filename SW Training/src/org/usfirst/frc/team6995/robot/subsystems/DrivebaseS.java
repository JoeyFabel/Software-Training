package org.usfirst.frc.team6995.robot.subsystems;
import org.usfirst.frc.team6995.robot.RobotMap;

//import com.ctre.phoenix.Logger;
import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import org.usfirst.frc.team6995.robot.commands.DriveArcadeC;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.command.Subsystem;
/**
 *
 */
public class DrivebaseS extends Subsystem {

    private WPI_TalonSRX driveLeft = null;
    private WPI_TalonSRX driveLeftBack = null;
    private WPI_TalonSRX driveRight = null;
    private WPI_TalonSRX driveRightBack = null;
    private DifferentialDrive differentialDrive = null;
    private SpeedControllerGroup leftSpeedControllerGroup = null;
    private SpeedControllerGroup rightSpeedControllerGroup = null;
    
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	setDefaultCommand(new DriveArcadeC());
    }
    
    public DrivebaseS() {
    	
    	driveLeft = new WPI_TalonSRX(RobotMap.DRIVEBASE_LEFT_TALON_CAN_ID);
    	driveLeftBack = new WPI_TalonSRX(RobotMap.DRIVEBASE_LEFT_BACK_TALON_CAN_ID);
    	driveRight = new WPI_TalonSRX(RobotMap.DRIVEBASE_RIGHT_TALON_CAN_ID);
    	driveRightBack = new WPI_TalonSRX(RobotMap.DRIVEBASE_RIGHT_BACK_TALON_CAN_ID);
    	leftSpeedControllerGroup = new SpeedControllerGroup(driveLeft, driveLeftBack);
    	rightSpeedControllerGroup = new SpeedControllerGroup(driveRight, driveRightBack);
    	differentialDrive = new DifferentialDrive(leftSpeedControllerGroup, rightSpeedControllerGroup);
    	
    	
    	driveLeft.setNeutralMode(NeutralMode.Brake);
    	driveRight.setNeutralMode(NeutralMode.Brake);
    	driveLeftBack.setNeutralMode(NeutralMode.Brake);
    	driveRightBack.setNeutralMode(NeutralMode.Brake);
    	
    	driveLeft.setSafetyEnabled(false);
    	driveRight.setSafetyEnabled(false);
    	driveLeftBack.setSafetyEnabled(false);
    	driveRightBack.setSafetyEnabled(false);
    	
    	
    }
    
    public void arcadeDrive(double moveSpeed,double rotateSpeed) {  	
    	differentialDrive.arcadeDrive(-moveSpeed, rotateSpeed);  
    }
    
    public double getEncoderCount() {
    	return driveRight.getSensorCollection().getQuadraturePosition();    	
    }
    
    public double getDistanceTraveled() {
    	return (getEncoderCount() / (4096 / (6 * Math.PI)));    	
    }
    
    public void resetEncoder() {

    	driveRight.getSensorCollection().setQuadraturePosition(0, 500); 
    	driveRight.getSensorCollection().setQuadraturePosition(0, 500);
    	
    //	System.out.println("Encoder reset to " + driveRight.getSensorCollection().getQuadraturePosition)));
    	
    	System.out.println( Integer.toString(driveRight.getSensorCollection().getQuadraturePosition()));   
    }
    
}

