package org.usfirst.frc.team4692.robot.commands;

import org.usfirst.frc.team4692.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class ArmClose extends Command {

	public ArmClose() {
        requires(Robot.arm);
    }
    protected void initialize() {
    	Robot.arm.closeArm();
    }
    protected void execute() {
    	Robot.arm.closeArm();
    }
    protected boolean isFinished() {
        return false;
    }
    protected void end() {
    	Robot.arm.stopArm();
    }
    protected void interrupted() {
    }
}
