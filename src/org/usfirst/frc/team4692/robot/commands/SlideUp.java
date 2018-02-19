package org.usfirst.frc.team4692.robot.commands;

import org.usfirst.frc.team4692.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class SlideUp extends Command {
	
	public SlideUp() {
		requires(Robot.slide);
	}
	@Override
	protected void initialize() {
	    	Robot.slide.slideStop();
	    }
	@Override
	protected void execute() {
		Robot.slide.slideUp();
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
