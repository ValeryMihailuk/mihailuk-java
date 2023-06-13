import java.io.PrintStream;
import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("введите размер массива");
        int size = in.nextInt();
        int[] arr = new int[size];
        System.out.println("введите элемент массива");
        for (int i = 0; i < arr.length; i++)
            arr[i] = in.nextInt();
        for (int i = 0; i < arr.length; i++) {
            int a = arr[i] % 3;
            if (a == 0)
                System.out.print("Числа кратные 3" + arr[i] + ", ");
        }
    }
}

