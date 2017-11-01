package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.hardware.ColorSensor;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorController;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;
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
    public DcMotor motor5=null;
    public DcMotor motor6=null;

    public Servo servo1=null;
    public Servo servo2=null;

    public ColorSensor color1=null;

    public HardwareMap HM=null;

    public void AddMotor(DcMotor m, String motorname){
        //method for adding motor
        m= HM.dcMotor.get(motorname);
        m.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        m.setPower(0);
        m.setDirection(DcMotorSimple.Direction.FORWARD);
    }
    public void init(HardwareMap hm){
        /*this is saying the Hardware map, made at the top equals any new hardware map
         entered*/
        HM=hm;
        //configuring motors

        //name of motors in configuration files
        //motor1 = leftRear
        motor1 = HM.dcMotor.get("motor1");
        //Whether the motors will track the encoder counts or not
        motor1.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        //initializing the motor power when the init button is pushed on the phone
        motor1.setPower(0);
        //set motors direction
        motor1.setDirection(DcMotorSimple.Direction.REVERSE);

        //motor2 = rightRear
//        AddMotor(motor2,"motor2");
        motor2 =HM.dcMotor.get("motor2");
        motor2.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        motor2.setPower(0);
        motor2.setDirection(DcMotorSimple.Direction.FORWARD);

        //motor3 = leftFront
//        AddMotor(motor3,"motor3");
        motor3 =HM.dcMotor.get("motor3");
        motor3.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        motor3.setPower(0);
        motor3.setDirection(DcMotorSimple.Direction.REVERSE);

        //motor4 = rightFront
//        AddMotor(motor4,"motor4");
        motor4 =HM.dcMotor.get("motor4");
        motor4.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        motor4.setPower(0);
        motor4.setDirection(DcMotorSimple.Direction.FORWARD);
        //motor5 = bottomArm
//        AddMotor(motor5,"motor5");
        motor5 =HM.dcMotor.get("motor5");
        motor5.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        motor5.setPower(0);
        motor5.setDirection(DcMotorSimple.Direction.REVERSE);

        //motor6 = topArm
//        AddMotor(motor6,"motor6");
        motor6 =HM.dcMotor.get("motor6");
        motor6.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        motor6.setPower(0);
        motor6.setDirection(DcMotorSimple.Direction.FORWARD);



        //servo1=claw
        servo1= HM.servo.get("servo1");
        servo1.setPosition(1);

        //servo2= colorSensorArm
        servo2 = HM.servo.get("servo2");
        servo2.setPosition(1);

        //color1 = colorSensor
        color1=HM.colorSensor.get("color1");
        color1.enableLed(false);
    }
    public void setpower(double right, double left){
        //this is for autonomous, it sets motor 1 and 2's power
        motor1.setPower(right);
        motor2.setPower(left);
    }
    public void shutdownAllMotors(){
        motor1.setPower(0);
        motor2.setPower(0);
        motor3.setPower(0);
        motor4.setPower(0);
    }
    public void resetEncoders(){
        motor1.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        motor2.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        motor3.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        motor4.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
    }




}
