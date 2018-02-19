package org.usfirst.frc.team4692.robot.commands;

import org.usfirst.frc.team4692.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class SlideStop extends Command {
	
	public SlideStop() {
		requires(Robot.slide);
	}
	@Override
	protected void initialize() { 
	}
	@Override
	protected void execute() {
		Robot.slide.slideStop();
	}

	@Override
	protected boolean isFinished() {
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