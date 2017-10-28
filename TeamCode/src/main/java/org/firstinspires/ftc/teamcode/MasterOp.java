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
    public DcMotor motor1;
    public DcMotor motor2;
    public DcMotor motor3;
    public DcMotor motor4;
    public DcMotor motor5;
    public DcMotor motor6;

    public Servo servo1;
    public Servo servo2;

    public ColorSensor color1;

    public HardwareMap HM;

    public void AddMotor(DcMotor motor, String motorname){
        //method for adding motor
        motor= HM.dcMotor.get(motorname);
        motor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        motor.setPower(0);
        motor.setDirection(DcMotorSimple.Direction.FORWARD);
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
        AddMotor(motor2,"motor2");

        //motor3 = leftFront
        AddMotor(motor3,"motor3");

        //motor4 = rightFront
        AddMotor(motor4,"motor4");

        //motor5 = bottomArm
        AddMotor(motor5,"motor5");

        //motor6 = topArm
        AddMotor(motor6,"motor6");

        //servo1=claw
        servo1= HM.servo.get("servo");
        servo1.setPosition(0);

        //servo2= colorSensorArm
        servo2 = HM.servo.get("servo2");
        servo2.setPosition(0);

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
