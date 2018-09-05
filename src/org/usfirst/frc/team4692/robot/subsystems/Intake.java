package org.usfirst.frc.team4692.robot.subsystems;

import org.usfirst.frc.team4692.robot.Robot;
import org.usfirst.frc.team4692.robot.RobotMap;
import org.usfirst.frc.team4692.robot.commands.IntakeStop;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.command.Subsystem;

public class Intake extends Subsystem {
	private  WPI_TalonSRX IntakeLeftMotor;
	private  WPI_TalonSRX IntakeRightMotor;

	@Override
	public void initDefaultCommand() {
		setDefaultCommand(new IntakeStop());
	}
	public Intake() {
		IntakeLeftMotor = new WPI_TalonSRX(RobotMap.INTAKELEFTMOTOR.value);
		IntakeRightMotor = new WPI_TalonSRX(RobotMap.INTAKERIGHTMOTOR.value);
		Robot.initTalon(IntakeLeftMotor);
		Robot.initTalon(IntakeRightMotor);
	}
	public void spinInwards(double output) {
		IntakeLeftMotor.set(output);
		IntakeRightMotor.set(-output);
	}
	public void spinOutwards(double output) {
		IntakeLeftMotor.set(output);
		IntakeRightMotor.set(-output);
	}
	public void setBothMotors(double output) {
		IntakeLeftMotor.set(output);
		IntakeRightMotor.set(output);
	}
	
	
}

