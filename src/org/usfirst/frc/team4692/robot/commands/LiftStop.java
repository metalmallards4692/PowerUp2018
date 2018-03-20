package org.usfirst.frc.team4692.robot.commands;

import org.usfirst.frc.team4692.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class LiftStop extends Command {

	public LiftStop() {
		requires(Robot.lift);
	}
	protected void initialize() {
		Robot.lift.liftStop();
	}
	protected void execute() {
		Robot.lift.liftStop();
	}

	@Override
	protected boolean isFinished() {
		return false;
	}
	protected void end() {
		Robot.lift.liftStop();
	}

}
