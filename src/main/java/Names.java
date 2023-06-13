import java.util.Scanner;

public class Names {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите имя: ");
        String inputCheckName = input.nextLine();
        if (inputCheckName.equals("Вячеслав")) {
            System.out.println("Привет, Вячеслав");
        } else {
            System.out.println("Нет такого имени");
        }
    }
}