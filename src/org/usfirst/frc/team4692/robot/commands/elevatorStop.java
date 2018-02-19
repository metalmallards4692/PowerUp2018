package org.usfirst.frc.team4692.robot.commands;

import org.usfirst.frc.team4692.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class elevatorStop extends Command {
	public elevatorStop() {
		requires(Robot.elevator);
	}
	protected void initialize() {
		Robot.elevator.stop();
	}
	protected void execute() {
		Robot.elevator.stop();
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
