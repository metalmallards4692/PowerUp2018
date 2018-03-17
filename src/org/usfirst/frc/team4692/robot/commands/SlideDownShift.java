package org.usfirst.frc.team4692.robot.commands;

import org.usfirst.frc.team4692.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class SlideDownShift extends Command {

	@Override
	protected boolean isFinished() {
		return false;
	}
	  public SlideDownShift() {
	        requires(Robot.slideshift);
	    }
	    protected void initialize() {
	    	Robot.slideshift.slideShiftDown();
	    }
	    protected void execute() {
	    	//Robot.subcompressor.startComp();
	    	Robot.slideshift.slideShiftDown();
	    }

	    protected void end() {
	    	Robot.slideshift.slideShiftDown();
  }


}
