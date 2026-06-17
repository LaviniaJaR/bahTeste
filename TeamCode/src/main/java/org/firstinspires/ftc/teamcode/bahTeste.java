package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp(name = "Teste")
public class bahTeste extends OpMode {

    private DcMotor motor;

    @Override
    public void init() {

        motor = hardwareMap.get(DcMotor.class, "backLeft");

    }

    @Override
    public void loop() {

        motor.setPower(1);

    }
}
