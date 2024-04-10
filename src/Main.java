//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double Weight = 98;
        double Height = 1.87;
        int BodyMassIndex = service.calculate(Height, Weight);
        System.out.println(BodyMassIndex);
    }
}
