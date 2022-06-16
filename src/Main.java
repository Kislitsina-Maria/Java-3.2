public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 56; // Указать вес в кг.
        double high = 1.73; // Указать рост в м.
        double index = service.calculate(weight, high);
        System.out.printf("Индекс масссы тела: %.2f", index);

    }
}
