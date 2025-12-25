package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.ctre.phoenix6.hardware.TalonFX; 

public class Intake extends SubsystemBase {
  // Hocanın istediği 1 ID'li motor
  private final TalonFX motor = new TalonFX(1); 

  public Intake() {}

  // Motoru %50 hızla çalıştıran metod
  public void calistir() {
    motor.set(0.5); 
  }
}