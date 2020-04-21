public class BmiService {
    public double calculate(double bodyMass, double height) {
        double bodyMassIndex = BodyMass / (height * height);
        return bodyMassIndex;
    }
}
