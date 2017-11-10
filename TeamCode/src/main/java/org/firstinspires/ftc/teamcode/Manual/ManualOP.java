package org.firstinspires.ftc.teamcode.Manual;

import android.util.Range;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.teamcode.MasterOp;

/**
 * Created by Zachary Clauson on 10/8/2017.
 */
@TeleOp(name = "ManualOP", group = "ManualOP")
@Disabled
public class ManualOP extends OpMode {
    //instantiating MasterOp class
    MasterOp mo= new MasterOp();
    @Override
    public void init() {
        //initializing all the hardware
        mo.init(hardwareMap);
    }

    @Override
    public void loop() {
        //setting the power equal to the float of the sticks
        double rpower=-gamepad1.right_stick_y;
        double lpower=-gamepad1.left_stick_y;



        //set right motors to right power and set left motors to left power
        mo.motor1.setPower(rpower);
        mo.motor2.setPower(lpower);
        mo.motor3.setPower(rpower);
        mo.motor4.setPower(lpower);
    }
}
