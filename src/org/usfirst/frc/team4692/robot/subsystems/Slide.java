
package org.usfirst.frc.team4692.robot.subsystems;

import org.usfirst.frc.team4692.robot.Robot;
import org.usfirst.frc.team4692.robot.RobotMap;
import org.usfirst.frc.team4692.robot.commands.SlideStop;
//import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.command.Subsystem;

public class Slide extends Subsystem {
	private WPI_TalonSRX LeftSlideMotor;
	//private WPI_TalonSRX LeftSlideFollower; 

	@Override
	protected void initDefaultCommand() {
		setDefaultCommand(new SlideStop());
	}

	public Slide() {
		LeftSlideMotor = new WPI_TalonSRX(RobotMap.LEFTSLIDEMOTOR.value);
		//LeftSlideFollower = new WPI_TalonSRX(RobotMap.LEFTSLIDEFOLLOWER.value);
		Robot.initTalon(LeftSlideMotor);
		//Robot.initTalon(LeftSlideFollower);
		//LeftSlideFollower.follow(LeftSlideMotor);

	}
	@Override
	public void periodic() {
	}
	
	public void slideUp() {
		LeftSlideMotor.set(.5);
	}
	
	public void slideDown() {
		LeftSlideMotor.set(-1.0);
	}
	
	public void slideStop() {
		LeftSlideMotor.set(0);
	}
}