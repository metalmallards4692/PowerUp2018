package org.usfirst.frc.team4692.robot.commands;

import org.usfirst.frc.team4692.robot.Robot;

import com.ctre.phoenix.motorcontrol.ControlMode;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

public class driveforward extends Command {
	
	Timer driveTimer = new Timer();
    public driveforward() {
        requires(Robot.drivetrain);
    }
    protected void initialize() {
    	driveTimer.start();
    }
    protected void execute() {
    	Robot.drivetrain.set(ControlMode.PercentOutput, .5, .5);
    }
    protected boolean isFinished() {
        return (driveTimer.get()>2.0);
    }
    protected void end() {
    	Robot.drivetrain.set(ControlMode.PercentOutput, 0, 0);
    }
    protected void interrupted() {
    }
}