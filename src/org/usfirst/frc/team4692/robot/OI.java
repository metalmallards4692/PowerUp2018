/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team4692.robot;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

import org.usfirst.frc.team4692.robot.commands.ArmClose;
import org.usfirst.frc.team4692.robot.commands.ArmOpen;
import org.usfirst.frc.team4692.robot.commands.IntakeBackward;
import org.usfirst.frc.team4692.robot.commands.IntakeForward;
//import org.usfirst.frc.team4692.robot.commands.LiftDown;
//import org.usfirst.frc.team4692.robot.commands.LiftUp;
import org.usfirst.frc.team4692.robot.commands.SlideDown;
import org.usfirst.frc.team4692.robot.commands.SlideDownShift;
import org.usfirst.frc.team4692.robot.commands.SlideUp;
import org.usfirst.frc.team4692.robot.commands.SlideUpShift;
import org.usfirst.frc.team4692.robot.commands.TankDrive;
import org.usfirst.frc.team4692.robot.commands.elevatorDown;
import org.usfirst.frc.team4692.robot.commands.elevatorUp;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

public class OI {
	
	public Joystick gamepad = new Joystick(RobotMap.GAMEPAD.value);
	Button gamepad_back;
	Button gamepad_start;
	Button gamepad_X;
	Button gamepad_B;
	Button gamepad_L1;
	Button gamepad_R1;
	Button gamepad_A;
	Button gamepad_Y;
	Button gamepad_L3;
	Button gamepad_R3;
	Button btnLiftUp;
	Button btnLiftDown;
	JoystickButton btn_R1;
	JoystickButton btn_L1;
	public static final double JOY_DEADZONE = 0.05;
	public final Joystick LEFT_JOY = new Joystick(RobotMap.LEFT_JOYSTICK.value);
	public final Joystick RIGHT_JOY = new Joystick(RobotMap.RIGHT_JOYSTICK.value);
	
	
	public double getLeftJoyX() {
		double raw = LEFT_JOY.getX();
		return Math.abs(raw) < JOY_DEADZONE ? 0.0 : raw;
	}
	public double getLeftJoyY() {
		double raw = LEFT_JOY.getY();
		return Math.abs(raw) < JOY_DEADZONE ? 0.0 : raw;
	}
	public double getRightJoyX() {
		double raw = RIGHT_JOY.getX();
		return Math.abs(raw) < JOY_DEADZONE ? 0.0 : raw;
	}
	public double getRightJoyY() {
		double raw = RIGHT_JOY.getY();
		return Math.abs(raw) < JOY_DEADZONE ? 0.0 : raw;
	}
	public OI() {
		gamepad_back = new JoystickButton(gamepad, RobotMap.GAMEPAD_BACK.value);
		gamepad_start = new JoystickButton(gamepad, RobotMap.GAMEPAD_START.value);
		gamepad_X = new JoystickButton(gamepad, RobotMap.GAMEPAD_X.value);
		gamepad_B = new JoystickButton(gamepad, RobotMap.GAMEPAD_B.value);
		gamepad_L1 = new JoystickButton(gamepad, RobotMap.GAMEPAD_L1.value);
		gamepad_R1 = new JoystickButton(gamepad, RobotMap.GAMEPAD_R1.value);
		gamepad_A = new JoystickButton(gamepad, RobotMap.GAMEPAD_A.value);
		gamepad_Y = new JoystickButton(gamepad, RobotMap.GAMEPAD_Y.value);
		gamepad_L3 = new JoystickButton(gamepad, RobotMap.GAMEPAD_L3.value);
		gamepad_R3 = new JoystickButton(gamepad, RobotMap.GAMEPAD_R3.value);
		btnLiftUp = new JoystickButton(RIGHT_JOY, RobotMap.BTNLIFTUP.value);
		btnLiftDown = new JoystickButton(LEFT_JOY, RobotMap.BTNLIFTDOWN.value);
		btn_R1 = new JoystickButton(LEFT_JOY, RobotMap.BTN_R1.value);
		btn_L1 = new JoystickButton(RIGHT_JOY, RobotMap.BTN_L1.value);
		//Commands
		gamepad_back.whileHeld(new elevatorUp());
		gamepad_start.whileHeld(new elevatorDown());
		gamepad_X.whenPressed(new ArmClose());
		gamepad_B.whenPressed(new ArmOpen());
		gamepad_R1.whileHeld(new SlideUp());
		gamepad_L1.whileHeld(new SlideDown());
		gamepad_A.whileHeld(new IntakeForward());
		gamepad_Y.whileHeld(new IntakeBackward());
		gamepad_L3.whenPressed(new SlideDownShift());
		gamepad_R3.whenPressed(new SlideUpShift());
        //btnLiftUp.whenPressed(new LiftUp());
        //btnLiftDown.whenPressed(new LiftDown());
		btn_R1.whenPressed(new SlideUpShift());
		btn_L1.whenPressed(new SlideDownShift());
		SmartDashboard.putData("TankDrive", new TankDrive());
		SmartDashboard.putData("Slide", new SlideUp());
	}
	public Joystick getGamepad() {
		return gamepad;
	}
	
}
