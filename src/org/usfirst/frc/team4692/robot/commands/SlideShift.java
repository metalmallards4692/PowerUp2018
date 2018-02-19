package org.usfirst.frc.team4692.robot.commands;

import edu.wpi.first.wpilibj.command.Command;

public class SlideShift extends Command {
	boolean highGear = false;
	
	public SlideShift(boolean highGear) {
		this.highGear = false;
	}
	
	protected void initialize() {
	}
	
	protected void execute() {
	}
	
	@Override
	protected boolean isFinished() {
		return true;
	}
	
	protected void end() {
	}

	protected void interrupted() {
	}
}
