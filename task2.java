// К калькулятору из предыдущего дз добавить логирование.

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.*;

public class task2 {
    public static void main(String[] args) throws IOException {
        Logger logger = Logger.getLogger(task2.class.getName());
        FileHandler fh = new FileHandler("log.txt");
        logger.addHandler(fh);
        SimpleFormatter sFormat = new SimpleFormatter(); 
        fh.setFormatter(sFormat);
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите первое число ");
        int num1 = scan.nextInt();
        System.out.print("Введите знак ");
        char mark = scan.next().charAt(0);
        System.out.print("Введите второе число ");
        int num2 = scan.nextInt();
        scan.close();
        if (mark == '+') {
            logger.log(Level.INFO, "Числа были сложены");
            System.out.println(num1 + num2);
        }
        else if (mark == '-') {
            logger.log(Level.INFO, "Числа были вечеты");
            System.out.println(num1 - num2);
        }
        else if (mark == '*') {
            logger.log(Level.INFO, "Числа были умножены");
            System.out.println(num1 * num2);
        }
        if (mark == '/') {
            logger.log(Level.INFO, "Числа были поделены");
            System.out.println(num1 / num2);
        }
    }
}

