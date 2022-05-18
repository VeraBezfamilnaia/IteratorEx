public class Main {
    public static void main(String[] args) {
        for (int currNumber : new Randoms(90, 100)) {
            System.out.println("Случайное число: " + currNumber);
            if (currNumber == 100) {
                System.out.println("Выпало число 100, давайте на этом закончим");
                break;
            }
        }
    }
}
