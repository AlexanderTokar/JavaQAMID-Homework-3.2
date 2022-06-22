public class BmiService {
    public double calculate (double height, double weight) {
        double squareHeight = height * height;
        return weight / squareHeight;
    }
}
