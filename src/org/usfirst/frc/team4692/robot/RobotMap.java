/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team4692.robot;

public enum RobotMap {
	//Motor setup
	LEFTMOTOR(27),
	RIGHTMOTOR(25),
	LEFT_FOLLOW_MOTOR(26),
	RIGHT_FOLLOW_MOTOR(24),
	//Control Mappings
	LEFT_JOYSTICK(1),
	RIGHT_JOYSTICK(0);
	
	public final int value;
	
	RobotMap(int value) {
		this.value = value;
	}
}
