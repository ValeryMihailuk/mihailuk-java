import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите число больше 7: ");
        int inputCheckNumber = input.nextInt();
        if (inputCheckNumber > 7) {
            System.out.println("Привет");
        } else if (inputCheckNumber == 7) {
            System.out.println("Необходимо ввести число большее 7");
        } else {
            System.out.println("Введено число меньше 7");
        }
    }
}