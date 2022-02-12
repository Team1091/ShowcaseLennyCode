package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DigitalOutput;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class LightsSubsystem extends SubsystemBase {

    private DigitalOutput output;
    private boolean isOn = false;

    public LightsSubsystem() {
        output = new DigitalOutput(0);
    }

    @Override
    public void periodic() {
        output.set(isOn);
    }

    public void setOn(boolean isOn) {
        this.isOn = isOn;
    }

}
