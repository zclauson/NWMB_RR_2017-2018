package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorController;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.util.Hardware;

/**
 * Created by Zachary Clauson on 6/11/2017.
 */
@Disabled
public class MasterOp {
    public DcMotor motor1=null;
    public DcMotor motor2=null;
    public DcMotor motor3=null;
    public DcMotor motor4=null;
    public HardwareMap HM;

    public DcMotorController controller1;
    public DcMotorController controller2;

    public void init(HardwareMap hm){
        /*this is saying the Hardware map, made at the top equals any new hardware map
         entered*/
        HM=hm;
        //configuring motors

        //name of motors in configuration files
        //motor1 = left rear
        motor1 = HM.dcMotor.get("motor1");
        //Whether the motors will track the encoder counts or not
        motor1.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        //initializing the motor power when the init button is pushed on the phone
        motor1.setPower(0);
        //set motors direction
        motor1.setDirection(DcMotorSimple.Direction.REVERSE);

        //motor2 = right rear
        motor2 = HM.dcMotor.get("motor2");
        motor2.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        motor2.setPower(0);
        motor2.setDirection(DcMotorSimple.Direction.FORWARD);

        //motor3 = left front
        motor3 = HM.dcMotor.get("motor3");
        motor3.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        motor3.setPower(0);
        motor3.setDirection(DcMotorSimple.Direction.REVERSE);

        //motor4 = right front
        motor4 = HM.dcMotor.get("motor4");
        motor4.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        motor4.setPower(0);
        motor4.setDirection(DcMotorSimple.Direction.FORWARD);
    }
    public void setpower(double right, double left){
        //this is for autonomous, it sets motor 1 and 2's power
        motor1.setPower(right);
        motor2.setPower(left);
    }




}
