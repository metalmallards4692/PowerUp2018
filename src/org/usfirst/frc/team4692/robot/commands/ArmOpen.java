package org.usfirst.frc.team4692.robot.commands;

import org.usfirst.frc.team4692.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class ArmOpen extends Command {

	public ArmOpen() {
        requires(Robot.arm);
    }
    protected void initialize() {
    	Robot.arm.openArm();
    }
    protected void execute() {
    	Robot.arm.openArm();
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
