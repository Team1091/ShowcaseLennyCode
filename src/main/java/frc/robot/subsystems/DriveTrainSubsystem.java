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

        System.out.println("Made");
    }

    @Override
    public void periodic() {
        System.out.println("hi");
        double forwardBackwardSpeed = xboxController.getLeftX() * 0.7;
        double turnSpeed = xboxController.getLeftY() * 0.5;
        differentialDrive.arcadeDrive(forwardBackwardSpeed, turnSpeed);
    }
}
