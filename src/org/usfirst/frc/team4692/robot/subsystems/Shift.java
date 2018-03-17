package org.usfirst.frc.team4692.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import org.usfirst.frc.team4692.robot.commands.SlideStopShift;
import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Shift extends Subsystem {
	public static DoubleSolenoid slideShift = new DoubleSolenoid(0,0,1);
	public static Compressor compressor = new Compressor();
	
	@Override
	protected void initDefaultCommand() {
		setDefaultCommand(new SlideStopShift());
	}
	public void slideShiftUp(){
		slideShift.set(DoubleSolenoid.Value.kForward);
	}
	public void slideShiftDown(){
		slideShift.set(DoubleSolenoid.Value.kReverse);
	}
	public void slideShiftStop(){
		slideShift.set(DoubleSolenoid.Value.kOff);
	}

}
