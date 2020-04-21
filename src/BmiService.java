public class BmiService {
    public double calculate(double bodyMass, double height) {
        double bodyMassIndex = bodyMass / (height * height);
        return bodyMassIndex;
    }
}
