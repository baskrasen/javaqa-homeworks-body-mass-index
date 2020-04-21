public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double bodyMassIndex = service.calculate(62, 1.75);
        System.out.println(bodyMassIndex);
    }
}
