package Homework5.part1;

import Homework4.set.Computer;
import Homework4.set.MadeIn;
import Homework4.set.Type;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
//        Створити класс Компьютер з полями
//- модель
//- рік випуску
//- об'єм пам'яті
//- ціна
//- Жорсткий диск (Класс з полями)
//  - Модель жорсткого диску
//  - Тип (ссд або хдд (енум))
//  - об'єм жорсткого диску
//  - Країна виробник (Енуми. Китай, Корея, Індія, США)
//- Процессор(Класс)
//  - Тип
//  -кількість ядер
//  -частота
//  -виробник (Енуми ті самі країни)
//Створити список з 20 об'єктів.

        Set<Computer> computerArrayList = new HashSet<>(Arrays.asList(
                new Homework4.set.Computer("PC1", 2019, 8, 3000, "w1000", Homework4.set.Type.HDD, 1000, Homework4.set.MadeIn.INDIA, "i7", 4, 2.4, MadeIn.CHINA),
                new Homework4.set.Computer("PC2", 2009, 6, 1000, "wh500", Homework4.set.Type.HDD, 500, Homework4.set.MadeIn.CHINA, "core duo", 2, 2, Homework4.set.MadeIn.INDIA),
                new Homework4.set.Computer("PC3", 2015, 8, 3000, "sd500", Homework4.set.Type.SSD, 750, Homework4.set.MadeIn.CHINA, "i7", 4, 2.1, Homework4.set.MadeIn.USA),
                new Homework4.set.Computer("PC4", 2009, 4, 5000, "hd500", Homework4.set.Type.HDD, 500, Homework4.set.MadeIn.INDIA, "i3", 2, 2.5, Homework4.set.MadeIn.KOREA),
                new Homework4.set.Computer("PC5", 2011, 16, 3500, "sd1000", Homework4.set.Type.SSD, 1000, Homework4.set.MadeIn.KOREA, "i7", 8, 2.3, Homework4.set.MadeIn.KOREA),
                new Homework4.set.Computer("PC6", 2014, 6, 2000, "w2000", Homework4.set.Type.HDD, 2000, Homework4.set.MadeIn.INDIA, "FX200", 2, 2.5, Homework4.set.MadeIn.CHINA),
                new Homework4.set.Computer("PC7", 2012, 8, 2500, "s250", Homework4.set.Type.SSD, 1000, Homework4.set.MadeIn.INDIA, "i5", 4, 2.4, Homework4.set.MadeIn.KOREA),
                new Homework4.set.Computer("PC8", 2019, 12, 1500, "w1000", Homework4.set.Type.HDD, 250, Homework4.set.MadeIn.CHINA, "i3", 4, 2.1, Homework4.set.MadeIn.USA),
                new Homework4.set.Computer("PC9", 2008, 4, 800, "hd500", Homework4.set.Type.HDD, 500, Homework4.set.MadeIn.USA, "dual core cpu", 2, 2.4, Homework4.set.MadeIn.USA),
                new Homework4.set.Computer("PC10", 2005, 4, 500, "w500", Homework4.set.Type.HDD, 500, Homework4.set.MadeIn.USA, "some cpu", 2, 1.5, Homework4.set.MadeIn.USA),
                new Homework4.set.Computer("PC11", 2015, 8, 3000, "sd500", Homework4.set.Type.SSD, 500, Homework4.set.MadeIn.KOREA, "i7", 4, 3.5, Homework4.set.MadeIn.KOREA),
                new Homework4.set.Computer("PC12", 2009, 6, 1800, "sd500", Homework4.set.Type.SSD, 500, Homework4.set.MadeIn.INDIA, "i3", 4, 2.2, Homework4.set.MadeIn.USA),
                new Homework4.set.Computer("PC13", 2010, 8, 2000, "w1000", Homework4.set.Type.HDD, 1000, Homework4.set.MadeIn.CHINA, "i7", 4, 2.3, Homework4.set.MadeIn.KOREA),
                new Homework4.set.Computer("PC14", 2014, 2, 1500, "w1000", Homework4.set.Type.HDD, 1000, Homework4.set.MadeIn.CHINA, "i3", 2, 2.5, Homework4.set.MadeIn.KOREA),
                new Homework4.set.Computer("PC15", 2008, 6, 2000, "w2000", Homework4.set.Type.HDD, 2000, Homework4.set.MadeIn.INDIA, "dual core", 2, 2.4, Homework4.set.MadeIn.KOREA),
                new Homework4.set.Computer("PC16", 2018, 16, 4000, "w1000", Homework4.set.Type.SSD, 10000, Homework4.set.MadeIn.USA, "i7", 8, 2.2, Homework4.set.MadeIn.KOREA),
                new Homework4.set.Computer("PC17", 2009, 4, 1200, "w1000", Homework4.set.Type.HDD, 1000, Homework4.set.MadeIn.USA, "Pentium4", 2, 2.0, Homework4.set.MadeIn.CHINA),
                new Homework4.set.Computer("PC18", 2020, 8, 2100, "w1000", Homework4.set.Type.HDD, 1000, Homework4.set.MadeIn.KOREA, "i5", 4, 2.5, Homework4.set.MadeIn.KOREA),
                new Homework4.set.Computer("PC19", 2017, 12, 2500, "w750", Homework4.set.Type.SSD, 750, Homework4.set.MadeIn.INDIA, "i3", 4, 2.4, Homework4.set.MadeIn.INDIA),
                new Computer("PC1", 2008, 4, 1000, "w500", Type.HDD, 500, Homework4.set.MadeIn.USA, "dual core", 2, 2.4, MadeIn.KOREA)
        ));
        //Далі
        System.out.println("1-----------------");
//1. Знайти всі комп'ютери які мають рік випуску більше ніж 2010
        computerArrayList.stream().filter(computer -> computer.getYear() > 2010).forEach(computer -> System.out.println(computer));

        System.out.println("2----------------");
//2. Знайти всі комп'ютери які мають рік випуску більше ніж 2010
//та країну виробник Китай
        computerArrayList.stream().filter(computer -> computer.getYear() > 2010 && computer.getCpu().getMadeIn() == MadeIn.CHINA)
                .forEach(computer -> System.out.println(computer));

        System.out.println("3-----------------");
//3. Знайти всі комп'ютери які мають рік випуску більше ніж 2010
//та країну виробник дисків не Китай
        List<Computer> collect = computerArrayList.stream().filter(computer -> computer.getYear() > 2010 && computer.getHardDrive().getMadeIn() != MadeIn.CHINA)
                .collect(Collectors.toList());
        collect.stream().forEach(computer -> System.out.println(computer));

        System.out.println("4-----------------");
//4. Знайти всі комп'ютери які мають жорсткий диск більше 500гб
        computerArrayList.stream().filter(computer -> computer.getHardDrive().getMemory() > 500).forEach(computer -> System.out.println(computer));



        System.out.println("5-----------------");
//5. Знайти всі комп'ютери які мають жорсткий ссд диск більше 500гб та процессор і7
        computerArrayList.stream().filter(computer -> computer.getHardDrive().getMemory() > 500 && computer.getCpu().getType().equalsIgnoreCase("i7"))
                .forEach(computer -> System.out.println(computer));

System.out.println("6-----------------");
//6. Знайти всі комп'ютери які мають жорсткий ссд диск більше 500гб
//та процессор і7 посортувати за ціною\
        computerArrayList.stream().filter(computer -> computer.getHardDrive().getMemory() > 500 && computer.getCpu().getType().equalsIgnoreCase("i7")).sorted((computer, t1) -> computer.getCost() - t1.getCost())
        .forEach(computer -> System.out.println(computer));
    }
}
