package ua.pp.lazin.io;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

/**
 * @author Ruslan Lazin
 *         1. Создайте программу-утилиту, которая побайтово сравнивает содержимое
 *         двух файлов. И выводящую результат сравнения файлов в следующем формате:
 *         - Результаты сравнения для файлов <имя_файла_1> <имя_файла_2>:
 *         Итог работы программы (если различий не найдено):
 *         - различий не обнаружено
 *         Итог работы программы (если найдены различия):
 *         - размеры файлов: <имя_файла_1> - Х Байт <имя_файла_2> - Y Байт
 *         Первое отличие найдено на: <номер_байта>.
 *         Общее количество отличающихся - <количество_различных_байт> байт.
 *         2. Выполните предыдущее задание, дополнив созданное Вами приложение
 *         возможностью сранения файлов в формате UNICODE. Для задания режима сравнения
 *         воспользуйтесь параметром: /U.
 */
public class FileComparator {
    public static String compareByBytes(String firstFilename, String secondFilename) {

        Path firstPath = Paths.get(firstFilename);
        Path secondPath = Paths.get(secondFilename);
        StringBuilder result = new StringBuilder(
                    "Result of comparision files: " + firstFilename + " , " + secondFilename);

        byte[] firstBytes;
        byte[] secondBytes;

        try {
            firstBytes = Files.readAllBytes(firstPath);
            secondBytes = Files.readAllBytes(secondPath);
        } catch (IOException e) {
            throw new UncheckedIOException("Cannot read files", e);
        }

        long minSize = (firstBytes.length > secondBytes.length) ? secondBytes.length : firstBytes.length;
        long maxSize = (firstBytes.length < secondBytes.length) ? secondBytes.length : firstBytes.length;
//
//        result.append(firstFilename).append(" - ").append(Files.size(firstPath)).append(" byte  ").append(secondFilename);
//        result.append(" - ").append(Files.size(secondPath)).append(" byte\n");


        int i = 0;
        boolean same = true;
        int count = 0;

        while (i < minSize) {
            if (firstBytes[i] != secondBytes[i]) {
                if (same == true) {
                    same = false;
                    result.append("The first difference is found in the ").append(i + 1).append(" symbol\n");
                }
                count++;
            }
            i++;
        }
        if (minSize != maxSize && same) {
            same = false;
            count++;
            result.append("The first difference is found in the ").append(minSize + 1).append(" symbol\n");
        }

        if (same) {
            return "Files are same";
        } else {
            count += maxSize - minSize;
            result.append("The total number of different ").append(count).append(" byte");
            return result.toString();
        }


    }
}
