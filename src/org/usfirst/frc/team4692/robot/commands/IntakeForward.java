package org.usfirst.frc.team4692.robot.commands;

import org.usfirst.frc.team4692.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class IntakeForward extends Command {
	public IntakeForward() {
		requires(Robot.intake);
	}
	@Override
	protected void initialize() {
	}
	@Override
	protected void execute() {
		Robot.intake.spinInwards(-.7);
	}
	@Override
	protected boolean isFinished() {
		return false;
	}
	@Override
	protected void end() {
		Robot.intake.setBothMotors(0);
	}
	@Override
	protected void interrupted() {
		end();
	}
}
