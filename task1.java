// Вычислить n-ое треугольного число(сумма чисел от 1 до n), а так же n! (произведение чисел от 1 до n)

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
       Scanner num1 = new Scanner(System.in);
       System.out.print("Введите число "); 
       int num = num1.nextInt();
       num1.close();
       int result1 = 0;
       int result2 = 1;
       for(int i = 1; i <= num; i++) {
            result1 += i;
            result2 *= i;
       }
       System.out.printf("Треугольное число %d \n", result1);
       System.out.printf("n! %d", result2);
    }
}
