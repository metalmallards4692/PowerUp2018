package org.usfirst.frc.team4692.robot.commands;

import org.usfirst.frc.team4692.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class IntakeStop extends Command {
	public IntakeStop() {
		requires(Robot.intake);
	}
	@Override
	protected void initialize() {
		Robot.intake.setBothMotors(0);
	}

	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	protected void end() {
		
	}
	@Override
	protected void interrupted() {
		end();
	}
}
