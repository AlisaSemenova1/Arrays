public class ReverseOrder {
    public static void main(String[] args) {
        int[] automaticArray = new int[100];
        for (int i = 0; i < automaticArray.length; i++) {
            automaticArray[i] = automaticArray.length - i - 1;
            System.out.println(automaticArray[i]);
        }
    }
}
