package org.usfirst.frc.team4692.robot.commands;

import org.usfirst.frc.team4692.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class IntakeBackward extends Command {
	public IntakeBackward() {
		requires(Robot.intake);
	}
	@Override
	protected void initialize() {
		Robot.intake.spinOutwards(1.0);
	}
	@Override
	protected void execute() {
		
	}
	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	protected void interrupted() {
		end();
	}

}
