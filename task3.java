import java.util.Objects;
import java.util.Scanner;

// В калькулятор добавьте возможность отменить последнюю операцию.

public class task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите первое число ");
        int a = scan.nextInt();
        System.out.print("Введите второе число ");
        int b = scan.nextInt();

        while (true) {
            System.out.print("Введите оператор (+, -, *, /): ");
            switch (scan.nextLine()) {
                case ("+"):
                    System.out.println(a + " + " + b + " = " + (a + b));
                    System.out.print("Отменить последнюю операцию: y/n? --> ");
                    if (Objects.equals(scan.nextLine(), "y")){
                        continue;
                    }
                    return;
                case ("-"):
                    System.out.println(a + " - " + b + " = " + (a - b));
                    System.out.print("Отменить последнюю операцию: y/n? --> ");
                    if (Objects.equals(scan.nextLine(), "y")){
                        continue;
                    }
                    return;
                case ("*"):
                    System.out.println(a + " * " + b + " = " + (a * b));
                    System.out.print("Отменить последнюю операцию: y/n? --> ");
                    if (Objects.equals(scan.nextLine(), "y")){
                        continue;
                    }
                    return;
                case ("/"):
                    System.out.println(a + " / " + b + " = " + (a / b));
                    System.out.print("Отменить последнюю операцию: y/n? --> ");
                    if (Objects.equals(scan.nextLine(), "y")){
                        continue;
                    }
                    return;
    }
    scan.close();
    }
    }   
}