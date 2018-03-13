package org.usfirst.frc.team4692.robot.commands;

import org.usfirst.frc.team4692.robot.Robot;

import com.ctre.phoenix.motorcontrol.ControlMode;

import edu.wpi.first.wpilibj.command.Command;

public class TankDrive extends Command {
	
	public TankDrive() {
		requires(Robot.drivetrain); 
	}
	
	protected void initialize() {
		
	}
	
	protected void execute() {
		double throttle = (1.0 - Robot.oi.LEFT_JOY.getThrottle()) / -0.7;
	
		Robot.drivetrain.set(ControlMode.PercentOutput, Robot.oi.getLeftJoyY() * throttle, Robot.oi.getRightJoyY() * throttle);
	}
	
	@Override
	protected boolean isFinished() {
		
		return false;
	}
	protected void interrupted() {
		end();
	}
}
