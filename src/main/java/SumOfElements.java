import java.util.concurrent.ThreadLocalRandom;

public class SumOfElements {
    public static void main(String[] args) {
        int[] sumArray = new int[7];
        int elementOfArray;
        int sum = 0;
        for (int i = 0; i < sumArray.length; i++) {
            elementOfArray = ThreadLocalRandom.current().nextInt(21);
            sumArray[i] = elementOfArray;
            sum += elementOfArray;
            System.out.println(elementOfArray);
        }
        System.out.println("Сумма : " + sum);
    }
}
