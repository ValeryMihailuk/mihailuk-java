import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите число больше 7: ");
        int inputCheckNumber = input.nextInt();
        if (inputCheckNumber > 7) {
            System.out.println("Привет");
        } else {
            System.out.println("Введено неверное число");
        }
    }
}
