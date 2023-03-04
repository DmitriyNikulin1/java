// Реализовать простой калькулятор (+ - / *)

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите первое число ");
        int num1 = scan.nextInt();
        System.out.print("Введите знак ");
        char mark = scan.next().charAt(0);
        System.out.print("Введите второе число ");
        int num2 = scan.nextInt();
        scan.close();
        if (mark == '+') {
            System.out.println(num1 + num2);
        }
        else if (mark == '-') {
            System.out.println(num1 - num2);
        }
        else if (mark == '*') {
            System.out.println(num1 * num2);
        }
        if (mark == '/') {
            System.out.println(num1 / num2);
        }
    }
}
