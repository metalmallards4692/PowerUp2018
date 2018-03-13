/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team4692.robot;

public enum RobotMap {
	//Motor setup
	RIGHT_FOLLOW_MOTOR(24),
	RIGHTMOTOR(25),
	LEFT_FOLLOW_MOTOR(26),
	LEFTMOTOR(27),
	LEFTSLIDEMOTOR(28),
	LEFTSLIDEFOLLOWER(29),
	ELEVATORMOTOR(30),
	INTAKELEFTMOTOR(31),
	INTAKELEFTMOTORFOLLOWER(32),
	INTAKERIGHTMOTOR(33),
	INTAKERIGHTMOTORFOLLOWER(34),
	//Control Mappings
	RIGHT_JOYSTICK(0),
	LEFT_JOYSTICK(1),
	BTNDRIVESHIFTUP(1),
	BTNDRIVESHIFTDOWN(1),
	GAMEPAD(2),
	GAMEPAD_A(1),
	GAMEPAD_Y(4),
	GAMEPAD_L1(5),
	GAMEPAD_R1(6),
	GAMEPAD_BACK(7),
	GAMEPAD_START(8);
	
	public final int value;
	
	RobotMap(int value) {
		this.value = value;
	}
}
