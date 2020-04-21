public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double BodyMassIndex = service.calculate(62, 1.75);
        System.out.println(BodyMassIndex);
    }
}