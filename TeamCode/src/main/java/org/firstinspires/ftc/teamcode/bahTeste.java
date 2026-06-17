package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp(name = "Teste")
public class bahTeste extends OpMode {

    private DcMotor intake;

    @Override
    public void init() {

        intake = hardwareMap.get(DcMotor.class, "intake");


    }

    @Override
    public void loop() {

        if (gamepad1.left_trigger > 0.5 ) {
            intake.setPower(1);
        } else {
            intake.setPower(0);
        }
    }
}
