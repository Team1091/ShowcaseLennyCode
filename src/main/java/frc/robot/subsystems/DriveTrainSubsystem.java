package frc.robot.subsystems;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.Victor;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class DriveTrainSubsystem extends SubsystemBase {
    private final DifferentialDrive differentialDrive;
    private final XboxController xboxController;

    public DriveTrainSubsystem(XboxController xboxController) {
        this.xboxController = xboxController;
        differentialDrive = new DifferentialDrive(
                new Victor(0),
                new Victor(1)
        );
    }

    @Override
    public void periodic() {
        double forwardBackwardSpeed = xboxController.getLeftX() * .6;
        double turnSpeed = xboxController.getLeftY() *.6;
        differentialDrive.arcadeDrive(forwardBackwardSpeed, turnSpeed);
    }
}
