package org.usfirst.frc.team4692.robot.subsystems;

//import org.usfirst.frc.team4692.robot.Robot;
import org.usfirst.frc.team4692.robot.RobotMap;
import org.usfirst.frc.team4692.robot.commands.elevatorStop;


import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.command.Subsystem;

public class Elevator extends Subsystem {
	private  WPI_TalonSRX ElevatorMotor = new WPI_TalonSRX(RobotMap.ELEVATORMOTOR.value);	 

	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		setDefaultCommand(new elevatorStop());
	}
	
	public void up() {
		ElevatorMotor.set(.3);
	}
	public void down() {
		ElevatorMotor.set(-.3);
	}
	public void stop() {
		ElevatorMotor.set(0);
	}

}
