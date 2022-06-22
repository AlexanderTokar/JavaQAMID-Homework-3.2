public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double height = 1.8; // Указать рост в метрах
        double weight = 80; // Указать вес в килограммах
        double bmi = service.calculate(height, weight);
        System.out.println("Ваш индекс массы тела = " + bmi);
    }
}
