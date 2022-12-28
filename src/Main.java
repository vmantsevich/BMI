public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 76.9;
        double height = 1.8;
        double index = service.calculate(weight, height);
        System.out.println("Ваш индекс массы: "+ index);
    }
}