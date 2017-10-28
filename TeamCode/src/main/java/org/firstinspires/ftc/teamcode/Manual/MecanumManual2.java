package org.firstinspires.ftc.teamcode.Manual;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.util.Range;

import org.firstinspires.ftc.teamcode.MasterOp;

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
        float g1RightX= gamepad1.right_stick_x;
        float g1RightY= gamepad1.right_stick_y;

        float  FL= -g1LeftY -g1RightX -g1RightY;
        float  BR=  g1LeftY - g1RightX - g1RightY;
        float  FR=  g1LeftY + g1RightX -g1RightY;
        float  BL= -g1LeftY + g1RightX -g1RightY;

        //this makes it to where the speeds cant get below -1 or above 1
        Range.clip(FL,-1,1);
        Range.clip(BL,-1,1);
        Range.clip(FR,-1,1);
        Range.clip(BR,-1,1);


        mo.motor1.setPower(BL);
        mo.motor2.setPower(BR);
        mo.motor3.setPower(FL);
        mo.motor4.setPower(FR);

        if (gamepad1.right_trigger > .1){
            mo.motor5.setPower(.4);
        }
        if(gamepad1.left_trigger > .1){
            mo.motor5.setPower(-.4);
        }
        if (gamepad1.right_bumper){
            mo.motor6.setPower(.4);
        }
        if (gamepad1.left_bumper){
            mo.motor6.setPower(-.4);
        }


        telemetry.addData("red: ",mo.color1.red());
        telemetry.addData("blue: ",mo.color1.blue());
        telemetry.addData("motor1: ", mo.motor1.getCurrentPosition());
        telemetry.addData("motor2: ", mo.motor2.getCurrentPosition());
        telemetry.addData("motor3: ", mo.motor3.getCurrentPosition());
        telemetry.addData("motor4: ", mo.motor4.getCurrentPosition());








    }
}
