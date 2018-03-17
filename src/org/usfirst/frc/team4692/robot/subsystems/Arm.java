package org.usfirst.frc.team4692.robot.subsystems;

import org.usfirst.frc.team4692.robot.commands.ArmClose;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Arm extends Subsystem {
	public static DoubleSolenoid arm = new DoubleSolenoid(0,2,3);
	
	@Override
	protected void initDefaultCommand() {
		setDefaultCommand(new ArmClose());
	}
	public void closeArm(){
		arm.set(DoubleSolenoid.Value.kForward);
	}
	public void openArm(){
		arm.set(DoubleSolenoid.Value.kReverse);
	}
	public void stopArm(){
		arm.set(DoubleSolenoid.Value.kOff);
	}
}

