import java.util.Scanner;

public class shiv {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int size = sc.nextInt();

        int[] array = new int[size];

        System.out.println("Enter array elements:");

        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }

        if (size % 2 != 0) {
            System.out.println("The middle element is:");
            System.out.println(array[size / 2]);
        } else {
            System.out.println("The middle elements are:");
            System.out.println(array[(size / 2) - 1] + " & " + array[size / 2]);
        }

        sc.close();
    }
}