package org.firstinspires.ftc.teamcode.Autonomous;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.util.Hardware;

import org.firstinspires.ftc.teamcode.MasterOp;

/**
 * Created by Zachary Clauson on 10/21/2017.
 */
@com.qualcomm.robotcore.eventloop.opmode.Autonomous(name = "Autonomous", group = "Autonomous")
public class Autonomous extends OpMode {
    int v_state=0;
    MasterOp mo = new MasterOp();
    @Override
    public void init(){
        mo.init(hardwareMap);
    }

    @Override
    public void loop(){
     switch (v_state){
         case 0:
             mo.motor1.setPower(1);
             mo.motor2.setPower(-1);
             mo.motor3.setPower(-1);
             mo.motor4.setPower(1);
         if (mo.motor1.getCurrentPosition() >1000){
             mo.shutdownAllMotors();
             mo.resetEncoders();
             v_state++;
         }
             break;
         case 1:
             mo.motor1.setPower(-1);
             mo.motor2.setPower(1);
             mo.motor3.setPower(1);
             mo.motor4.setPower(-1);
         if (time==16){
             mo.shutdownAllMotors();
             mo.resetEncoders();

         }
             break;

            default:
            break;
         }
    }
}
