package org.usfirst.frc.team4692.robot.commands;

import org.usfirst.frc.team4692.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class IntakeBackward extends Command {
	public IntakeBackward() {
		requires(Robot.intake);
	}
	@Override
	protected void initialize() {
	}
	@Override
	protected void execute() {
		Robot.intake.spinOutwards(.7);
	}
	@Override
	protected boolean isFinished() {
		return false;
	}
	@Override
	protected void interrupted() {
		end();
	}

}
