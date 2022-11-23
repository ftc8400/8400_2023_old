package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

@Autonomous(name = "Warehouse (Blocks to Java)", preselectTeleOp = "Strafe")
public class Warehouse extends LinearOpMode {

  private DcMotor right_front;
  private DcMotor right_back;
  private DcMotor left_back;
  private DcMotor left_front;

  /**
   * This function is executed when this Op Mode is selected from the Driver Station.
   */
  @Override
  public void runOpMode() {
    right_front = hardwareMap.get(DcMotor.class, "right_front");
    right_back = hardwareMap.get(DcMotor.class, "right_back");
    left_back = hardwareMap.get(DcMotor.class, "left_back");
    left_front = hardwareMap.get(DcMotor.class, "left_front");

    // Put initialization blocks here.
    right_front.setDirection(DcMotorSimple.Direction.REVERSE);
    right_back.setDirection(DcMotorSimple.Direction.REVERSE);
    waitForStart();
    if (opModeIsActive()) {
      right_back.setPower(0.5);
      right_front.setPower(0.5);
      left_back.setPower(0.5);
      left_front.setPower(0.5);
      sleep(1000);
      right_back.setPower(0);
      right_front.setPower(0);
      left_back.setPower(0);
      left_front.setPower(0);
      sleep(100);
      right_back.setPower(-0.5);
      right_front.setPower(-0.5);
      left_back.setPower(-0.5);
      left_front.setPower(-0.5);
      sleep(1000);
      right_back.setPower(0);
      right_front.setPower(0);
      left_back.setPower(0);
      left_front.setPower(0);
      sleep(100);
      right_back.setPower(-0.5);
      right_front.setPower(0.5);
      left_back.setPower(0.5);
      left_front.setPower(-0.5);
      sleep(750);
      right_back.setPower(0);
      right_front.setPower(0);
      left_back.setPower(0);
      left_front.setPower(0);
      sleep(100);
      right_back.setPower(0.5);
      right_front.setPower(0.5);
      left_back.setPower(-0.5);
      left_front.setPower(-0.5);
      sleep(400);
      right_back.setPower(0);
      right_front.setPower(0);
      left_back.setPower(0);
      left_front.setPower(0);
      sleep(100);
      right_back.setPower(0.5);
      right_front.setPower(0.5);
      left_back.setPower(0.5);
      left_front.setPower(0.5);
      sleep(2000);
      right_back.setPower(0);
      right_front.setPower(0);
      left_back.setPower(0);
      left_front.setPower(0);
      sleep(100);
      right_back.setPower(-0.5);
      right_front.setPower(-0.5);
      left_back.setPower(0.5);
      left_front.setPower(0.5);
      sleep(300);
      right_back.setPower(0);
      right_front.setPower(0);
      left_back.setPower(0);
      left_front.setPower(0);
    }
  }

  /**
   * Describe this function...
   */
  private void do_something6() {
  }

  /**
   * Describe this function...
   */
  private void do_something5() {
  }

  /**
   * Describe this function...
   */
  private void do_something7() {
  }

  /**
   * Describe this function...
   */
  private void do_something8() {
  }

  /**
   * Describe this function...
   */
  private void do_something9() {
  }

  /**
   * Describe this function...
   */
  private void do_something10() {
  }

  /**
   * Describe this function...
   */
  private void do_something11() {
  }

  /**
   * Describe this function...
   */
  private void do_something12() {
  }

  /**
   * Describe this function...
   */
  private void do_something13() {
  }

  /**
   * Describe this function...
   */
  private void do_something14() {
  }

  /**
   * Describe this function...
   */
  private void do_something15() {
  }

  /**
   * Describe this function...
   */
  private void do_something16() {
  }
}
