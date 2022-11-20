import java.util.concurrent.ThreadLocalRandom;

public class ArrayOfRandomNumbers {
    public static void main(String[] args) {
        int random[] = new int[10];
        int number;
        for (int i = 0; i < random.length; i++) {
            number = ThreadLocalRandom.current().nextInt(101);
            random[i] = number;
            System.out.println(number);
        }
    }
}