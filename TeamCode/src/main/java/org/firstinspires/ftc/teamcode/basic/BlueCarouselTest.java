package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.Servo;

@Autonomous(name = "BlueCarouselTest (Blocks to Java)", preselectTeleOp = "Strafe")
public class BlueCarouselTest extends LinearOpMode {

  private DcMotor left_front;
  private DcMotor left_back;
  private DcMotor right_front;
  private DcMotor right_back;
  private DcMotor Intake;
  private Servo BoxTurn;
  private DcMotor Spinner;

  /**
   * Describe this function...
   */
  private void Blue_CAROUSEL_Auto() {
    if (opModeIsActive()) {
      // Put run blocks here.
      left_front.setPower(0.5);
      left_back.setPower(0.5);
      right_front.setPower(0.5);
      right_back.setPower(0.5);
      sleep(500);
      right_back.setPower(0);
      right_front.setPower(0);
      left_back.setPower(0);
      left_front.setPower(0);
      sleep(100);
      Intake.setPower(0.3);
      sleep(350);
      Intake.setPower(0);
      sleep(100);
      BoxTurn.setPosition(0);
      sleep(1000);
      BoxTurn.setPosition(1);
      sleep(1000);
      right_front.setPower(-0.5);
      right_back.setPower(-0.5);
      left_front.setPower(0.5);
      left_back.setPower(0.5);
      sleep(382);
      left_front.setPower(-0.5);
      left_back.setPower(-0.5);
      right_front.setPower(0.5);
      right_back.setPower(0.5);
      sleep(382);
      left_front.setPower(-0.5);
      left_back.setPower(-0.5);
      right_front.setPower(-0.5);
      right_back.setPower(-0.5);
      sleep(500);
      right_back.setPower(0);
      right_front.setPower(0);
      left_back.setPower(0);
      left_front.setPower(0);
      sleep(50);
      right_front.setPower(0.5);
      right_back.setPower(0.5);
      left_front.setPower(-0.5);
      left_back.setPower(-0.5);
      sleep(775);
      right_back.setPower(0);
      right_front.setPower(0);
      left_back.setPower(0);
      left_front.setPower(0);
      sleep(100);
      left_front.setPower(0.5);
      left_back.setPower(0.5);
      right_front.setPower(0.5);
      right_back.setPower(0.5);
      sleep(750);
      right_back.setPower(0);
      right_front.setPower(0);
      left_back.setPower(0);
      left_front.setPower(0);
      sleep(100);
      left_front.setPower(0.5);
      left_back.setPower(-0.5);
      right_back.setPower(0.5);
      right_front.setPower(-0.5);
      sleep(300);
      right_back.setPower(0);
      right_front.setPower(0);
      left_back.setPower(0);
      left_front.setPower(0);
      sleep(100);
      Spinner.setPower(-0.18);
      sleep(2500);
      Spinner.setPower(0);
      sleep(1000);
      left_front.setPower(-0.5);
      left_back.setPower(0.5);
      right_back.setPower(-0.5);
      right_front.setPower(0.5);
      sleep(250);
      right_back.setPower(0);
      right_front.setPower(0);
      left_back.setPower(0);
      left_front.setPower(0);
      sleep(100);
      right_front.setPower(-0.5);
      right_back.setPower(-0.5);
      left_back.setPower(0.5);
      left_front.setPower(0.5);
      sleep(775);
      right_back.setPower(0);
      right_front.setPower(0);
      left_back.setPower(0);
      left_front.setPower(0);
      sleep(100);
      left_front.setPower(0.5);
      left_back.setPower(0.5);
      right_front.setPower(0.5);
      right_back.setPower(0.5);
      sleep(700);
      right_back.setPower(0);
      right_front.setPower(0);
      left_back.setPower(0);
      left_front.setPower(0);
      sleep(100);
      left_back.setPower(-0.5);
      left_front.setPower(0.5);
      right_front.setPower(-0.5);
      right_back.setPower(0.5);
      sleep(750);
      right_back.setPower(0);
      right_front.setPower(0);
      left_back.setPower(0);
      left_front.setPower(0);
    }
  }

  /**
   * This function is executed when this Op Mode is selected from the Driver Station.
   */
  @Override
  public void runOpMode() {
    left_front = hardwareMap.get(DcMotor.class, "left_front");
    left_back = hardwareMap.get(DcMotor.class, "left_back");
    right_front = hardwareMap.get(DcMotor.class, "right_front");
    right_back = hardwareMap.get(DcMotor.class, "right_back");
    Intake = hardwareMap.get(DcMotor.class, "Intake");
    BoxTurn = hardwareMap.get(Servo.class, "Box Turn");
    Spinner = hardwareMap.get(DcMotor.class, "Spinner");

    // Put initialization blocks here.
    right_front.setDirection(DcMotorSimple.Direction.REVERSE);
    right_back.setDirection(DcMotorSimple.Direction.REVERSE);
    waitForStart();
    if (opModeIsActive()) {
      // Put run blocks here.
      left_front.setPower(0.5);
      left_back.setPower(0.5);
      right_front.setPower(0.5);
      right_back.setPower(0.5);
      sleep(800);
      right_back.setPower(0);
      right_front.setPower(0);
      left_back.setPower(0);
      left_front.setPower(0);
      sleep(100);
      right_back.setPower(0.5);
      right_front.setPower(-0.5);
      left_back.setPower(-0.5);
      left_front.setPower(0.5);
      sleep(1350);
      right_back.setPower(0);
      right_front.setPower(0);
      left_back.setPower(0);
      left_front.setPower(0);
      sleep(100);
      BoxTurn.setPosition(0);
      sleep(2000);
      BoxTurn.setPosition(1);
      sleep(2000);
      right_back.setPower(-0.5);
      right_front.setPower(0.5);
      left_back.setPower(0.5);
      left_front.setPower(-0.5);
      sleep(1250);
      right_back.setPower(0);
      right_front.setPower(0);
      left_back.setPower(0);
      left_front.setPower(0);
      sleep(100);
      left_front.setPower(-0.5);
      left_back.setPower(-0.5);
      right_front.setPower(-0.5);
      right_back.setPower(-0.5);
      sleep(800);
      left_front.setPower(0.5);
      left_back.setPower(-0.5);
      right_front.setPower(-0.5);
      right_back.setPower(0.5);
      sleep(620);
      right_back.setPower(0);
      right_front.setPower(0);
      left_back.setPower(0);
      left_front.setPower(0);
      sleep(100);
      right_front.setPower(0.5);
      right_back.setPower(0.5);
      left_front.setPower(0.5);
      left_back.setPower(0.5);
      sleep(2250);
      right_back.setPower(0);
      right_front.setPower(0);
      left_back.setPower(0);
      left_front.setPower(0);
      sleep(100);
      right_back.setPower(0.5);
      right_front.setPower(-0.5);
      left_front.setPower(0.5);
      left_back.setPower(-0.5);
      sleep(350);
      left_back.setPower(0);
      left_front.setPower(0);
      right_back.setPower(0);
      right_front.setPower(0);
      sleep(100);
      left_front.setPower(0.5);
      left_back.setPower(0.5);
      right_front.setPower(0.5);
      right_back.setPower(0.5);
      sleep(110);
      left_front.setPower(-0.5);
      left_back.setPower(-0.5);
      right_front.setPower(0.5);
      right_back.setPower(0.5);
      sleep(300);
      left_back.setPower(0);
      left_front.setPower(0);
      right_back.setPower(0);
      right_front.setPower(0);
      sleep(100);
      left_back.setPower(0.5);
      left_front.setPower(0.5);
      right_back.setPower(0.5);
      right_front.setPower(0.5);
      sleep(200);
      left_back.setPower(0);
      left_front.setPower(0);
      right_back.setPower(0);
      right_front.setPower(0);
      sleep(100);
      Spinner.setPower(-0.18);
      sleep(2500);
      Spinner.setPower(0);
      sleep(100);
      left_back.setPower(0);
      left_front.setPower(0);
      right_back.setPower(0);
      right_front.setPower(0);
      sleep(100);
      right_back.setPower(0);
      right_front.setPower(0);
      left_back.setPower(0);
      left_front.setPower(0);
      sleep(100);
      left_back.setPower(-0.5);
      left_front.setPower(-0.5);
      right_back.setPower(0.5);
      right_front.setPower(0.5);
      sleep(600);
      left_back.setPower(0);
      left_front.setPower(0);
      right_back.setPower(0);
      right_front.setPower(0);
      sleep(100);
      left_back.setPower(-0.5);
      left_front.setPower(-0.5);
      right_back.setPower(-0.5);
      right_front.setPower(-0.5);
      sleep(200);
      left_back.setPower(0);
      left_front.setPower(0);
      right_back.setPower(0);
      right_front.setPower(0);
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
  private void do_something6() {
  }

  /**
   * Describe this function...
   */
  private void do_something7() {
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
    left_front.setPower(0.5);
    left_back.setPower(0.5);
    right_front.setPower(0.5);
    right_back.setPower(0.5);
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
  private void Turn_r2() {
    right_front.setPower(1);
    right_back.setPower(1);
    left_front.setPower(-1);
    left_back.setPower(-1);
    sleep(775);
  }

  /**
   * Describe this function...
   */
  private void Back_to_WareHouse_R() {
    left_back.setPower(0.5);
    left_front.setPower(-0.5);
    right_front.setPower(0.5);
    right_back.setPower(-0.5);
    sleep(300);
    right_back.setPower(0);
    right_front.setPower(0);
    left_back.setPower(0);
    left_front.setPower(0);
    sleep(200);
    left_front.setPower(-0.5);
    left_back.setPower(-0.5);
    right_front.setPower(-0.5);
    right_back.setPower(-0.5);
    sleep(3000);
    right_back.setPower(0);
    right_front.setPower(0);
    left_back.setPower(0);
    left_front.setPower(0);
  }

  /**
   * Describe this function...
   */
  private void Back_to_WareHouse_B() {
    left_back.setPower(-0.5);
    left_front.setPower(0.5);
    right_front.setPower(-0.5);
    right_back.setPower(0.5);
    sleep(300);
    right_back.setPower(0);
    right_front.setPower(0);
    left_back.setPower(0);
    left_front.setPower(0);
    sleep(200);
    left_front.setPower(-0.5);
    left_back.setPower(-0.5);
    right_front.setPower(-0.5);
    right_back.setPower(-0.5);
    sleep(3000);
    right_back.setPower(0);
    right_front.setPower(0);
    left_back.setPower(0);
    left_front.setPower(0);
  }

  /**
   * Describe this function...
   */
  private void do_something8() {
  }

  /**
   * Describe this function...
   */
  private void do_something5() {
  }

  /**
   * Describe this function...
   */
  private void Turn_L() {
    left_front.setPower(1);
    left_back.setPower(1);
    right_front.setPower(-1);
    right_back.setPower(-1);
    sleep(775);
  }

  /**
   * Describe this function...
   */
  private void Carousel() {
    Spinner.setPower(0.18);
    sleep(2250);
    Spinner.setPower(0);
  }

  /**
   * Describe this function...
   */
  private void Carousel2() {
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

  /**
   * Describe this function...
   */
  // TODO: Enter the correct return type for function named do_something3
  private UNKNOWN_TYPE do_something3() {
  }

  /**
   * Describe this function...
   */
  // TODO: Enter the correct return type for function named do_something4
  private UNKNOWN_TYPE do_something4() {
  }

  /**
   * Describe this function...
   */
  // TODO: Enter the correct return type for function named do_something2
  private UNKNOWN_TYPE do_something2() {
  }

  /**
   * Describe this function...
   */
  // TODO: Enter the correct return type for function named do_something
  private UNKNOWN_TYPE do_something() {
  }

  /**
   * Describe this function...
   */
  private void do_something12() {
  }

  /**
   * Describe this function...
   */
  private void do_something11() {
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

  /**
   * Describe this function...
   */
  private void do_something17() {
  }

  /**
   * Describe this function...
   */
  private void do_something10() {
  }

  /**
   * Describe this function...
   */
  private void do_something13() {
  }

  /**
   * Describe this function...
   */
  private void do_something9() {
  }

  /**
   * Describe this function...
   */
  private void do_something14() {
  }

  /**
   * Describe this function...
   */
  private void do_something18() {
  }

  /**
   * Describe this function...
   */
  private void do_something19() {
  }
}
