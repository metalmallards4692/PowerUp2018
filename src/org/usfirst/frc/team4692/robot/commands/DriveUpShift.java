package org.usfirst.frc.team4692.robot.commands;

//import org.usfirst.frc.team4692.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class DriveUpShift extends Command {
	  public DriveUpShift() {
	        //requires(Robot.driveshift);
	    }
	    protected void initialize() {
	    	//Robot.driveshift.driveShiftUp();
	    }
	    protected void execute() {
	    	//Robot.subcompressor.startComp();
	    	//Robot.driveshift.driveShiftUp();
	    }

	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}
	protected void end() {
    	//Robot.driveshift.driveShiftStop();
    }

}
