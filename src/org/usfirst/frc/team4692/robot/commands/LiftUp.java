package org.usfirst.frc.team4692.robot.commands;

import org.usfirst.frc.team4692.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class LiftUp extends Command {
	public LiftUp() {
		requires(Robot.lift);
	}
	protected void initialize() {
		Robot.lift.liftUp();
	}
	protected void execute() {
		Robot.lift.liftUp();
	}

	@Override
	protected boolean isFinished() {
		return false;
	}
	protected void end() {
		Robot.lift.liftStop();
	}

}
