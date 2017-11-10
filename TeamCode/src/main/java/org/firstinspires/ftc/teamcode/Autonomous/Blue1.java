package org.firstinspires.ftc.teamcode.Autonomous;

import com.qualcomm.robotcore.eventloop.opmode.*;

import org.firstinspires.ftc.teamcode.MasterOp;

/**
 * Created by Zachary Clauson on 10/28/2017.
 */
@com.qualcomm.robotcore.eventloop.opmode.Autonomous(name = "ZCBlue1", group = "ZCBlue1")
public class Blue1 extends OpMode{
    MasterOp mo = new MasterOp();
    @Override
    public void init() {
        mo.init(hardwareMap);
    }

    @Override
    public void loop() {
        if (getRuntime()==30){
            mo.shutdownAllMotors();
            mo.v_state=0;

        }

        switch (mo.v_state){
            case 0:
                mo.resetEncoders();
                mo.shutdownAllMotors();
                mo.v_state++;
                break;
            case 1:
                mo.motor7.setPower(.5);
                if (mo.motor7.getCurrentPosition() > 55){
                    mo.servo2.setPosition(.30);
                    mo.shutdownAllMotors();
                    mo.resetEncoders();
                    mo.v_state++;
                }
                break;
            case 2:
                if (mo.color1.blue() > 0){
                    mo.PowerForB(-1 , 200);
                }
                else if (mo.color1.red() > 0){
                    mo.PowerForB(1 , 200);
                }
                break;
            case 3:

            break;


            default:

                break;
        }

    }
}
