package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

/**
 * Created by Zachary Clauson on 10/17/2017.
 */
@TeleOp(name = "MecanumManual", group = "Mecanum Manual")
public class MecanumManual extends OpMode {

    MasterOp mo = new MasterOp();
    @Override
    public void init() {
        mo.init(hardwareMap);
    }

    @Override
    public void loop() {

        double rightpower=gamepad1.right_stick_y;
        double leftpower=gamepad1.left_stick_y;


        mo.motor1.setPower(leftpower);
        mo.motor2.setPower(rightpower);
        mo.motor3.setPower(leftpower);
        mo.motor4.setPower(rightpower);



        if (gamepad1.left_bumper){
            mo.motor2.setPower(1);
            mo.motor3.setPower(1);
        }

        if (gamepad1.right_bumper){
            mo.motor1.setPower(1);
            mo.motor4.setPower(1);
        }

        if (gamepad1.left_trigger>.01){
            mo.motor1.setPower(-gamepad1.left_trigger);
            mo.motor4.setPower(-gamepad1.left_trigger);
        }

        if (gamepad1.right_trigger >.01){
            mo.motor2.setPower(-gamepad1.right_trigger);
            mo.motor3.setPower(-gamepad1.right_trigger);
        }

        if (gamepad1.dpad_right){
            mo.motor1.setPower(1);
            mo.motor2.setPower(-1);
            mo.motor3.setPower(-1);
            mo.motor4.setPower(1);
        }

        if (gamepad1.dpad_left){
            mo.motor1.setPower(-1);
            mo.motor2.setPower(1);
            mo.motor3.setPower(1);
            mo.motor4.setPower(-1);
        }






    }
}
