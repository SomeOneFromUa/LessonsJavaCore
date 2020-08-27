package Homework4.set;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Computer> computers = new TreeSet<>(Arrays.asList(
                new Computer("PC1", 2019, 8, 2000, "w1000", Type.HDD, 1000, MadeIn.INDIA, "i5", 4, 2.4, MadeIn.KOREA),
                new Computer("PC2", 2009, 6, 1000, "wh500", Type.HDD, 500, MadeIn.CHINA, "core duo", 2, 2, MadeIn.INDIA),
                new Computer("PC3", 2015, 8, 3000, "sd500", Type.SSD, 750, MadeIn.CHINA, "i7", 4, 2.1, MadeIn.USA),
                new Computer("PC4", 2009, 4, 5000, "hd500", Type.HDD, 500, MadeIn.INDIA, "i3", 2, 2.5, MadeIn.KOREA),
                new Computer("PC5", 2011, 16, 3500, "sd1000", Type.SSD, 1000, MadeIn.KOREA, "i7", 8, 2.3, MadeIn.KOREA),
                new Computer("PC6", 2014, 6, 2000, "w2000", Type.HDD, 2000, MadeIn.INDIA, "FX200", 2, 2.5, MadeIn.CHINA),
                new Computer("PC7", 2012, 8, 2500, "s250", Type.SSD, 1000, MadeIn.INDIA, "i5", 4, 2.4, MadeIn.KOREA),
                new Computer("PC8", 2019, 12, 1500, "w1000", Type.HDD, 250, MadeIn.CHINA, "i3", 4, 2.1, MadeIn.USA),
                new Computer("PC9", 2008, 4, 800, "hd500", Type.HDD, 500, MadeIn.USA, "dual core cpu", 2, 2.4, MadeIn.USA),
                new Computer("PC10", 2005, 4, 500, "w500", Type.HDD, 500, MadeIn.USA, "some cpu", 2, 1.5, MadeIn.USA),
                new Computer("PC11", 2015, 8, 3000, "sd500", Type.SSD, 500, MadeIn.KOREA, "i7", 4, 3.5, MadeIn.KOREA),
                new Computer("PC12", 2009, 6, 1800, "sd500", Type.SSD, 500, MadeIn.INDIA, "i3", 4, 2.2, MadeIn.USA),
                new Computer("PC13", 2010, 8, 2000, "w1000", Type.HDD, 1000, MadeIn.CHINA, "i5", 4, 2.3, MadeIn.KOREA),
                new Computer("PC14", 2014, 2, 1500, "w1000", Type.HDD, 1000, MadeIn.CHINA, "i3", 2, 2.5, MadeIn.KOREA),
                new Computer("PC15", 2008, 6, 2000, "w2000", Type.HDD, 2000, MadeIn.INDIA, "dual core", 2, 2.4, MadeIn.KOREA),
                new Computer("PC16", 2018, 16, 4000, "w1000", Type.SSD, 10000, MadeIn.USA, "i7", 8, 2.2, MadeIn.KOREA),
                new Computer("PC17", 2009, 4, 1200, "w1000", Type.HDD, 1000, MadeIn.USA, "Pentium4", 2, 2.0, MadeIn.CHINA),
                new Computer("PC18", 2020, 8, 2100, "w1000", Type.HDD, 1000, MadeIn.KOREA, "i5", 4, 2.5, MadeIn.KOREA),
                new Computer("PC19", 2017, 12, 2500, "w750", Type.SSD, 750, MadeIn.INDIA, "i3", 4, 2.4, MadeIn.INDIA),
                new Computer("PC1", 2008, 4, 1000, "w500", Type.HDD, 500, MadeIn.USA, "dual core", 2, 2.4, MadeIn.KOREA)
        ));
        //1. Знайти всі комп'ютери які мають рік випуску більше ніж 2010
        TreeSet<Computer> after2010 = new TreeSet<>();
        for (Computer computer : computers) {
            if (computer.getYear() > 2010) {
                after2010.add(computer);
            }
        }
        System.out.println(after2010);
//2. Знайти всі комп'ютери які мають рік випуску більше ніж 2010
//та країну виробник Китай
        System.out.println("after 2010 and hard drive made in china");
        for (Computer computer : computers) {
            if (computer.getYear() > 2010 && computer.getHardDrive().getMadeIn() == MadeIn.CHINA) {
                System.out.println(computer);
            }
        }
        System.out.println("---------------------------------------------------");
//3. Знайти всі комп'ютери які мають рік випуску більше ніж 2010
//та країну виробник дисків не Китай
        System.out.println("after 2010 and hard drive wasn't made in china");
        for (Computer computer : computers) {
            if (computer.getYear() > 2010 && computer.getHardDrive().getMadeIn() != MadeIn.CHINA) {
                System.out.println(computer);
            }
        }
        System.out.println("-----------------------------");

//4. Знайти всі комп'ютери які мають жорсткий диск більше 500гб
        System.out.println("hard drive with more then 500gb memory");
        for (Computer computer : computers) {
            if (computer.getHardDrive().getMemory() > 500) {
                System.out.println(computer);
            }
        }
        System.out.println("-----------------------------");
//5. Знайти всі комп'ютери які мають жорсткий ссд диск більше 500гб та процессор і7
        System.out.println("hard drive with more then 500gb memory and i7 core");
        for (Computer computer : computers) {
            if (computer.getHardDrive().getMemory() > 500 && computer.getCpu().getType().equals("i7")) {
                System.out.println(computer);
            }
        }
        System.out.println("-----------------------------");
//6. Знайти всі комп'ютери які мають жорсткий ссд диск більше 500гб
//та процессор і7 посортувати за ціною
        System.out.println("hard drive with more then 500gb memory and i7 core and sorted by cost");
        TreeSet<Computer> result = new TreeSet<>();
        for (Computer computer : computers) {
            if (computer.getHardDrive().getMemory() > 500 && computer.getCpu().getType().equals("i7")) {
                result.add(computer);
            }
        }
        for (Computer computer : result) {
            System.out.println(computer);
        }
        System.out.println("-----------------------------");
    }
}
