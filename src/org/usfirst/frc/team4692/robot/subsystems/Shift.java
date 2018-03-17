package org.usfirst.frc.team4692.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import org.usfirst.frc.team4692.robot.commands.DriveDownShift;
import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Shift extends Subsystem {
	public static DoubleSolenoid driveShift = new DoubleSolenoid(0,0,1);
	private Compressor compressor = new Compressor();
	
	@Override
	protected void initDefaultCommand() {
		setDefaultCommand(new DriveDownShift());
	}
	public void driveShiftUp(){
		driveShift.set(DoubleSolenoid.Value.kForward);
	}
	public void driveShiftDown(){
		driveShift.set(DoubleSolenoid.Value.kReverse);
	}
	public void driveShiftStop(){
		driveShift.set(DoubleSolenoid.Value.kOff);
	}

}
