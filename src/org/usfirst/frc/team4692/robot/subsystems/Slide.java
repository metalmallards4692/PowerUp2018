
package org.usfirst.frc.team4692.robot.subsystems;

import org.usfirst.frc.team4692.robot.Robot;
import org.usfirst.frc.team4692.robot.RobotMap;
import org.usfirst.frc.team4692.robot.commands.SlideStop;
//import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.command.Subsystem;

public class Slide extends Subsystem {
	private WPI_TalonSRX LeftSlideMotor = new WPI_TalonSRX(RobotMap.LEFTSLIDEMOTOR.value);
	private WPI_TalonSRX LeftSlideFollower  = new WPI_TalonSRX(RobotMap.LEFTSLIDEFOLLOWER.value);

	@Override
	protected void initDefaultCommand() {
		setDefaultCommand(new SlideStop());
	}

	public void slide() {
		LeftSlideMotor = new WPI_TalonSRX(RobotMap.LEFTSLIDEMOTOR.value);
		LeftSlideFollower = new WPI_TalonSRX(RobotMap.LEFTSLIDEFOLLOWER.value);
		Robot.initTalon(LeftSlideMotor);
		Robot.initTalon(LeftSlideFollower);
		LeftSlideFollower.follow(LeftSlideMotor);

	}
	@Override
	public void periodic() {
	}
	
	public void slideUp() {
		LeftSlideMotor.set(.3);
	}
	
	public void slideDown() {
		LeftSlideMotor.set(-.3);
	}
	
	public void slideStop() {
		LeftSlideMotor.set(0);
	}
}