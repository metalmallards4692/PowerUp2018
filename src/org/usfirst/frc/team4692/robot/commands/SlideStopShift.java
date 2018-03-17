package org.usfirst.frc.team4692.robot.commands;

import org.usfirst.frc.team4692.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class SlideStopShift extends Command {
	public SlideStopShift() {
        requires(Robot.slideshift);
    }
    protected void initialize() {
    	Robot.slideshift.slideShiftStop();
    }
    protected void execute() {
    	//Robot.subcompressor.startComp();
    	Robot.slideshift.slideShiftStop();
    }

@Override
protected boolean isFinished() {
	return false;
}
protected void end() {
	Robot.slideshift.slideShiftStop();
}

}
