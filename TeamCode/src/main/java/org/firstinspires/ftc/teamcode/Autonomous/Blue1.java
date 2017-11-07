package org.firstinspires.ftc.teamcode.Autonomous;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;

import org.firstinspires.ftc.teamcode.MasterOp;

/**
 * Created by Zachary Clauson on 10/28/2017.
 */

public class Blue1 extends OpMode{
    MasterOp mo = new MasterOp();
    public int v_state=0;
    @Override
    public void init() {
        mo.init(hardwareMap);
    }

    @Override
    public void loop() {

        switch (v_state){
            case 0:
                mo.resetEncoders();
                mo.shutdownAllMotors();

                break;
            case 1:
                mo.motor7.setPower(1);
                if (mo.motor7.getCurrentPosition() > 100){

                }
        }

    }
}
