package org.usfirst.frc.team4692.robot.subsystems;

import org.usfirst.frc.team4692.robot.Robot;
import org.usfirst.frc.team4692.robot.RobotMap;
import org.usfirst.frc.team4692.robot.commands.IntakeStop;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.command.Subsystem;

public class Intake extends Subsystem {
	private  WPI_TalonSRX IntakeLeftMotor;
	private  WPI_TalonSRX IntakeLeftMotorFollower;
	private  WPI_TalonSRX IntakeRightMotor;
	private  WPI_TalonSRX IntakeRightMotorFollower;

	@Override
	public void initDefaultCommand() {
		// TODO Auto-generated method stub
		setDefaultCommand(new IntakeStop());

	}
	public Intake() {
		IntakeLeftMotor = new WPI_TalonSRX(RobotMap.INTAKELEFTMOTOR.value);
		IntakeLeftMotorFollower = new WPI_TalonSRX(RobotMap.INTAKELEFTMOTORFOLLOWER.value);
		IntakeRightMotor = new WPI_TalonSRX(RobotMap.INTAKERIGHTMOTOR.value);
		IntakeRightMotorFollower = new WPI_TalonSRX(RobotMap.INTAKERIGHTMOTORFOLLOWER.value);
		Robot.initTalon(IntakeLeftMotor);
		Robot.initTalon(IntakeLeftMotorFollower);
		Robot.initTalon(IntakeRightMotor);
		Robot.initTalon(IntakeRightMotorFollower);
		IntakeLeftMotorFollower.follow(IntakeLeftMotor);
		IntakeRightMotorFollower.follow(IntakeRightMotor);
		
		
		
	}
	public void spinInwards(double output) {
		IntakeLeftMotor.set(-output);
		IntakeRightMotor.set(-output);
	}
	public void spinOutwards(double output) {
		IntakeLeftMotor.set(-output);
		IntakeRightMotor.set(-output);
	}
	public void setBothMotors(double output) {
		IntakeLeftMotor.set(output);
		IntakeRightMotor.set(output);
	}
	
	
}

