public class ReverseOrder {
    public static void main(String[] args) {
        int[] automaticArray = new int[100];
        int i = 99;
        while (i < automaticArray.length) {
            automaticArray[i] = i;
            System.out.println(automaticArray[i]);
            i--;
            if (i == -1)
                break;

        }
    }
}
