package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.Servo;

@Autonomous(name = "Park (Blocks to Java)", preselectTeleOp = "Strafe")
public class Park extends LinearOpMode {

  private DcMotor right_front;
  private DcMotor right_back;
  private DcMotor left_front;
  private DcMotor left_back;
  private DcMotor Spinner;
  private DcMotor Intake;
  private Servo BoxTurn;

  /**
   * This function is executed when this Op Mode is selected from the Driver Station.
   */
  @Override
  public void runOpMode() {
    right_front = hardwareMap.get(DcMotor.class, "right_front");
    right_back = hardwareMap.get(DcMotor.class, "right_back");
    left_front = hardwareMap.get(DcMotor.class, "left_front");
    left_back = hardwareMap.get(DcMotor.class, "left_back");
    Spinner = hardwareMap.get(DcMotor.class, "Spinner");
    Intake = hardwareMap.get(DcMotor.class, "Intake");
    BoxTurn = hardwareMap.get(Servo.class, "Box Turn");

    // Put initialization blocks here.
    right_front.setDirection(DcMotorSimple.Direction.REVERSE);
    right_back.setDirection(DcMotorSimple.Direction.REVERSE);
    waitForStart();
    if (opModeIsActive()) {
      // Put run blocks here.
      left_front.setPower(0.5);
      left_back.setPower(0.5);
      right_back.setPower(0.5);
      right_front.setPower(0.5);
      sleep(2500);
      right_back.setPower(0);
      right_front.setPower(0);
      left_back.setPower(0);
      left_front.setPower(0);
    }
  }

  /**
   * Describe this function...
   */
  private void PARKING_PROGRAM() {
    left_front.setPower(0.5);
    left_back.setPower(0.5);
    right_back.setPower(0.5);
    right_front.setPower(0.5);
    sleep(1500);
    right_back.setPower(0);
    right_front.setPower(0);
    left_back.setPower(0);
    left_front.setPower(0);
  }

  /**
   * Describe this function...
   */
  private void Stop() {
    right_back.setPower(0);
    right_front.setPower(0);
    left_back.setPower(0);
    left_front.setPower(0);
  }

  /**
   * Describe this function...
   */
  private void Straight() {
    left_front.setPower(1);
    left_back.setPower(1);
    right_front.setPower(1);
    right_back.setPower(1);
    sleep(1000);
  }

  /**
   * Describe this function...
   */
  private void Strafe_L() {
    left_back.setPower(1);
    left_front.setPower(-1);
    right_front.setPower(1);
    right_back.setPower(-1);
    sleep(1000);
  }

  /**
   * Describe this function...
   */
  private void Strafe_R() {
    left_back.setPower(-1);
    left_front.setPower(1);
    right_front.setPower(-1);
    right_back.setPower(1);
    sleep(1000);
  }

  /**
   * Describe this function...
   */
  private void Back() {
    left_front.setPower(-1);
    left_back.setPower(-1);
    right_front.setPower(-1);
    right_back.setPower(-1);
    sleep(1000);
  }

  /**
   * Describe this function...
   */
  private void Turn_L() {
    right_front.setPower(1);
    right_back.setPower(1);
    left_front.setPower(-1);
    left_back.setPower(-1);
    sleep(500);
  }

  /**
   * Describe this function...
   */
  private void Turn_R() {
    left_front.setPower(1);
    left_back.setPower(1);
    right_front.setPower(-1);
    right_back.setPower(-1);
    sleep(500);
  }

  /**
   * Describe this function...
   */
  private void Carousel() {
    Spinner.setPower(0.18);
    sleep(1000);
    Spinner.setPower(0);
  }

  /**
   * Describe this function...
   */
  private void Intake2() {
    Intake.setPower(0.3);
    sleep(1000);
    Intake.setPower(0);
  }

  /**
   * Describe this function...
   */
  private void Box() {
    BoxTurn.setPosition(0);
  }
}
