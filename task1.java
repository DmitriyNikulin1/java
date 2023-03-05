// Реализуйте алгоритм сортировки пузырьком числового массива (введён вами),
// результат после каждой итерации (после перемещения числа) запишите в лог-файл.

import java.io.IOException;
import java.util.Arrays;
import java.util.logging.*;


public class task1 {
    public static void main(String[] args) throws IOException {
        int[] mas = {5, 2, 1, 3, 9, 0, 4, 6, 8, 7};
        Logger logger = Logger.getLogger(task1.class.getName());
        FileHandler fh = new FileHandler("log.txt");
        logger.addHandler(fh);
        SimpleFormatter sFormat = new SimpleFormatter(); 
        fh.setFormatter(sFormat);
        boolean isSorted = false;
        int buf;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < mas.length-1; i++) {
                if(mas[i] > mas[i+1]){
                    isSorted = false;
 
                    buf = mas[i];
                    logger.log(Level.INFO, "Число было перемещенно");
                    mas[i] = mas[i+1];
                    mas[i+1] = buf;
                }
            }
        }
        System.out.println(Arrays.toString(mas));
    }
}
