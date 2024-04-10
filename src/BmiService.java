public class BmiService {
    public int calculate(double HeightMetr, double WeightKg) {
        int BodyMassIndex = (int) (WeightKg / HeightMetr / HeightMetr);
        return BodyMassIndex;
    }
}
