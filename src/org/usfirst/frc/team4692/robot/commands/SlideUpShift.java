package org.usfirst.frc.team4692.robot.commands;

import org.usfirst.frc.team4692.robot.Robot;
import edu.wpi.first.wpilibj.command.Command;

public class SlideUpShift extends Command {
		  public SlideUpShift() {
		        requires(Robot.slideshift);
		    }
		    protected void initialize() {
		    	Robot.slideshift.slideShiftUp();
		    }
		    protected void execute() {
		    	//Robot.subcompressor.startComp();
		    	Robot.slide.slideUp();
		    }

		@Override
		protected boolean isFinished() {
			return false;
		}
		protected void end() {
	    	Robot.slideshift.slideShiftUp(); 
	    }

}
