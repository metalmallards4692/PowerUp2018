package org.usfirst.frc.team4692.robot.subsystems;

import org.usfirst.frc.team4692.robot.commands.LiftStop;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

	public class Lift extends Subsystem {
	public static DoubleSolenoid lift = new DoubleSolenoid(0,2,3);
	
	@Override
	protected void initDefaultCommand() {
		setDefaultCommand(new LiftStop());
	}
	public void liftUp(){
		lift.set(DoubleSolenoid.Value.kForward);
	}
	public void liftDown(){
		lift.set(DoubleSolenoid.Value.kReverse);
	}
	public void liftStop(){
		lift.set(DoubleSolenoid.Value.kOff);
	}

}
