package org.usfirst.frc.team4692.robot.commands;

import org.usfirst.frc.team4692.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class elevatorUp extends Command {
	public elevatorUp() {
		requires(Robot.elevator);
	}
	protected void initialize() {
		Robot.elevator.up();
	}
	protected void execute() {
		Robot.elevator.up();
	}

	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}
	protected void end() {
		Robot.elevator.stop();
	}

}
