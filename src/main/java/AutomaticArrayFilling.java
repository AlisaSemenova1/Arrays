public class AutomaticArrayFilling {
    public static void main(String[] args) {
        int[] automaticArray = new int[100];
        for (int i = 0; i < automaticArray.length; i++) {
            automaticArray[i] = i;
            System.out.println(automaticArray[i]);
        }
    }
}
