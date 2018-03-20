package org.usfirst.frc.team4692.robot.commands;

import org.usfirst.frc.team4692.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class LiftDown extends Command {

	public LiftDown() {
		requires(Robot.lift);
	}
	protected void initialize() {
		Robot.lift.liftDown();
	}
	protected void execute() {
		Robot.lift.liftDown();
	}

	@Override
	protected boolean isFinished() {
		return false;
	}
	protected void end() {
		Robot.lift.liftStop();
	}

}
