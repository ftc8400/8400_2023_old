package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.Servo;

@TeleOp(name = "Strafe (Blocks to Java)")
public class Strafe extends LinearOpMode {

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

    // Reverse one of the drive motors.
    // You will have to determine which motor to reverse for your robot.
    // In this example, the right motor was reversed so that positive
    // applied power makes it move the robot in the forward direction.
    right_front.setDirection(DcMotorSimple.Direction.REVERSE);
    // You will have to determine which motor to reverse for your robot.
    // In this example, the right motor was reversed so that positive
    // applied power makes it move the robot in the forward direction.
    right_back.setDirection(DcMotorSimple.Direction.REVERSE);
    waitForStart();
    if (opModeIsActive()) {
      while (opModeIsActive()) {
        // The Y axis of a joystick ranges from -1 in its topmost position
        // to +1 in its bottommost position. We negate this value so that
        // the topmost position corresponds to maximum forward power.
        left_front.setPower(-gamepad1.left_stick_y - gamepad1.right_stick_x);
        right_front.setPower(-gamepad1.left_stick_y + gamepad1.right_stick_x);
        // The Y axis of a joystick ranges from -1 in its topmost position
        // to +1 in its bottommost position. We negate this value so that
        // the topmost position corresponds to maximum forward power.
        left_back.setPower(-gamepad1.left_stick_y + gamepad1.right_stick_x);
        right_back.setPower(-gamepad1.left_stick_y - gamepad1.right_stick_x);
        if (gamepad1.dpad_right) {
          left_front.setPower(1);
          left_back.setPower(1);
          right_front.setPower(-1);
          right_back.setPower(-1);
        } else if (gamepad1.dpad_left) {
          left_front.setPower(-1);
          left_back.setPower(-1);
          right_front.setPower(1);
          right_back.setPower(1);
        }
        // Carousel
        if (gamepad1.dpad_up) {
          Spinner.setPower(0.19);
        } else if (gamepad1.dpad_down) {
          Spinner.setPower(-0.19);
        } else {
          Spinner.setPower(0);
        }
        // Intake
        if (gamepad1.left_bumper) {
          Intake.setPower(-1);
        } else if (gamepad1.right_bumper) {
          Intake.setPower(1);
        } else {
          Intake.setPower(0);
        }
        // Box
        if (gamepad1.a) {
          BoxTurn.setPosition(1);
        } else if (gamepad1.b) {
          BoxTurn.setPosition(0);
        }
        telemetry.addData("LF POW", left_front.getPower());
        telemetry.addData("LB POW", left_front.getPower());
        telemetry.addData("RF POW", right_front.getPower());
        telemetry.addData("RB POW", left_front.getPower());
        telemetry.addData("Intake", Intake.getPower());
        telemetry.addData("Box", BoxTurn.getPosition());
        telemetry.addData("Spin", Spinner.getPower());
        telemetry.update();
      }
    }
  }
}
