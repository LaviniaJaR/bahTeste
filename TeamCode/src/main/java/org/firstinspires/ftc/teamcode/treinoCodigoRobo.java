package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.Servo;

public class treinoCodigoRobo extends OpMode {

    private DcMotor motorLeftFront;
    private DcMotor motorLeftBack;
    private DcMotor motorRightFront;
    private DcMotor motorRightBack;
    private DcMotor coleta;
    private Servo servo;

    @Override
    public void init() {

        motorLeftFront = hardwareMap.get(DcMotor.class, "motorLeftFront");
        motorLeftBack = hardwareMap.get(DcMotor.class, "motorLeftBack");
        motorRightFront = hardwareMap.get(DcMotor.class, "motorLeftFront");
        motorRightBack = hardwareMap.get(DcMotor.class, "motorLeftBack");

        coleta = hardwareMap.get(DcMotor.class, "intake");

        motorRightFront.setDirection(DcMotorSimple.Direction.REVERSE);
        motorRightBack.setDirection(DcMotorSimple.Direction.REVERSE);

    }

    @Override
    public void loop() {

        double y = -gamepad1.left_stick_y; // Remember, Y stick is reversed!
        double x = gamepad1.left_stick_x;
        double rx = gamepad1.right_stick_x;

        motorLeftFront.setPower(y + x + rx);
        motorLeftBack.setPower(y - x + rx);
        motorRightFront.setPower(y - x - rx);
        motorRightBack.setPower(y + x - rx);

        if (gamepad1.left_trigger > 0.3) {
            coleta.setPower(1);
        } else {
            coleta.setPower(0);
        }

    }
}
