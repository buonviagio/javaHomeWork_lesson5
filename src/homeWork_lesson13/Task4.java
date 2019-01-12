package homeWork_lesson13;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Task4 {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM d, yyyy HH:mm:ss", new Locale("ua", "UA"));
        String christmas = "01 7, 2019 00:00:00";
        String womensDay = "03 8, 2019 00:00:00";
        String easter = "04 28, 2019 00:00:00";
        String dayOfWork = "05 1, 2019 00:00:00";
        String victoryDay = "05 9, 2019 00:00:00";
        String triniti = "06 16, 2019 00:00:00";
        String constitutionDay = "06 28, 2019 00:00:00";
        String independensDay = "08 24, 2019 00:00:00";
        String defenderDay = "10 14, 2019 00:00:00";
        String catholicChristmas = "12 25, 2019 00:00:00";

        String[] array = {christmas, womensDay, easter, dayOfWork, victoryDay, triniti, constitutionDay, independensDay, defenderDay, catholicChristmas};

        String[] array1 = {"Рождество ", "8 Марта ", "Пасха", "День труда", "День победы", "Троица", "День Конституции", "День независимости", "День защитника", "Католическое Рождество"};

        LocalDateTime[] locDat = new LocalDateTime[10];

        for (int i = 0; i < locDat.length; i++) {
            locDat[i] = LocalDateTime.parse(array[i], formatter);
            System.out.println(array1[i] + " " + locDat[i]);
        }
    }
}
