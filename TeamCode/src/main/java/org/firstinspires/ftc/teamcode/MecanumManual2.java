package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

/**
 * Created by Zachary Clauson on 10/18/2017.
 */
@TeleOp(name = "MecanumManual2",group = "MecanumManual2")
public class MecanumManual2 extends OpMode {

    MasterOp mo=new MasterOp();

    @Override
    public void init() {
    mo.init(hardwareMap);
    }

    @Override
    public void loop() {

        /*
        Code Created by Maddie, FTC Team 4962, The Rockettes

        URL:https://github.com/MSMHS-Robotics/FTC4962_Examples/blob/master/TeamCode/src/main/java/org/firstinspires/ftc/teamcode/ConceptHolonomicDrive.java


		float gamepad1LeftY = -gamepad1.left_stick_y;
		float gamepad1LeftX = gamepad1.left_stick_x;
		float gamepad1RightX = gamepad1.right_stick_x;

		// holonomic formulas

		float FrontLeft = -gamepad1LeftY - gamepad1LeftX - gamepad1RightX;
		float FrontRight = gamepad1LeftY - gamepad1LeftX - gamepad1RightX;
		float BackRight = gamepad1LeftY + gamepad1LeftX - gamepad1RightX;
		float BackLeft = -gamepad1LeftY + gamepad1LeftX - gamepad1RightX;
        */

        float g1LeftY=-gamepad1.left_stick_y;
        float g1LeftX= gamepad1.left_stick_x;
        float g1RightX= gamepad1.right_stick_y;

        double  FL= -g1LeftY -g1LeftX -g1RightX;
        double  BR=  g1LeftY - g1LeftX - g1RightX;
        double  FR=  g1LeftY + g1LeftX -g1RightX;
        double  BL= -g1LeftY + g1LeftX -g1RightX;

        mo.motor1.setPower(BL);
        mo.motor2.setPower(BR);
        mo.motor3.setPower(FL);
        mo.motor4.setPower(FR);

        telemetry.addData("LeftY:", gamepad1.left_stick_y);
        telemetry.addData("LeftX", gamepad1.left_stick_x);
        telemetry.addData("RightY", gamepad1.right_stick_y);







    }
}
