// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int[] arr = new int[7];
        arr[0] = 69;
        arr[1] = -29;
        arr[2] = -92;
        arr[3] = 91;
        arr[4] = 64;
        arr[5] = 62;
        arr[6] = 80;


        int index = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 62) {
                index = i;
                break;
            }

        }
        System.out.println("index " + index);


    }
}