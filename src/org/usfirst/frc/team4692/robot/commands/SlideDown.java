package org.usfirst.frc.team4692.robot.commands;

import org.usfirst.frc.team4692.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class SlideDown extends Command {
	
	public SlideDown() {
		requires(Robot.slide);
	}
	@Override
	protected void execute() {
		Robot.slide.slideDown();
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