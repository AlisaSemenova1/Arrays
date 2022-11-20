import java.util.concurrent.ThreadLocalRandom;

public class SumOfElements {
    public static void main(String[] args) {
        int[] sumArray = new int[7];
        int index;
        int sum = 0;
        for (int i = 0; i < sumArray.length; i++) {
            index = ThreadLocalRandom.current().nextInt(21);
            sumArray[i] = index;
            sum += index;
            System.out.println(index);
        }
        System.out.println("Сумма : " + sum);
    }
}
