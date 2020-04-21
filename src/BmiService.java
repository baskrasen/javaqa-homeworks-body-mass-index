public class BmiService {
    public double calculate( double BodyMass, double height) {
        double BodyMassIndex = BodyMass / (height * height);
        return (double) BodyMassIndex; }
}