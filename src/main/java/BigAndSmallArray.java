public class BigAndSmallArray {
    public static void main(String[] args) {
        int[] arrayLength = {13, 18, 9, 28, 19, 21, 2, 9, 0, 1};
        int sum = 0;
        for (int i = 0; i < arrayLength.length; i++) {
            sum += arrayLength[i];
        }
        System.out.println("Сумма : " + sum);
        if (sum >= 100) {
            System.out.println("Это большой массив.");
        } else {
            System.out.println("Это маленький массив.");
        }
    }
}
