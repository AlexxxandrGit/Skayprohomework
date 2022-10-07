package cycles;

public class Main {

    public static void main(String[] args) {
        task19();
    }

    // Циклы. Урок 1.

    public static void task1() {
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }
    }

    public static void task2() {
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }

    }

    public static void task3() {
        for (int i = 0; i <= 17; i = i + 2) {
            System.out.println(i);
        }
    }

    public static void task4() {
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }
    }

    public static void task5() {
        for (int i = 1904; i <= 2096; i++) {
            if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0) {
                System.out.println(i + " год является високосным");
            }

        }

    }

    public static void task6() {
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.println(i);

        }

    }

    public static void task7() {
        for (int i = 1; i <= 512; i = i * 2)
            System.out.println(i);


    }


    public static void task8() {
        int contribution = 29000;
        int accumulation = 0;
        for (int i = 1; i <= 12; i++) {
            accumulation = accumulation + contribution;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + accumulation + "рублей");


        }

    }

    public static void task9() {
        int contribution = 65535;
        int accumulation = 0;
        for (int i = 1; i <= 12; i++) {
            accumulation = accumulation + contribution;
            accumulation = accumulation + accumulation / 100;
            System.out.println(" Месяц " + i + " сумма накоплений равна " + accumulation + " руб.");

        }


    }


    // ЦИКЛЫ. УРОК 2
    // Домашнее задание -1
    // Задача 1

    public static void task10() {
        System.out.println("Домашнее задание - 1");
        System.out.println(" Задание 1");
        System.out.println();
        int contribution = 15000;
        int accumulation = 0;
        int month = 0;
        while (accumulation < 2_459_000) {
            accumulation = accumulation + accumulation / 100;
            accumulation = accumulation + contribution;
            month++;

            System.out.println("Месяц " + month + " сумма накоплений равна " + accumulation + " рублей");

        }

    }


    // Задача 2
    public static void task11() {
        System.out.println("Домашнее задание - 1");
        System.out.println(" Задание 2");
        System.out.println();

        int a = 0;

        while (a < 10) {
            a++;
            System.out.print(" " + a);

        }
        System.out.println();
        int b = 10;
        for (b = 10; b > 0; b--) {
            System.out.print(" " + b);
        }

    }


    // Задача 3
    // Решил при помощи цикла for

    public static void task12() {
        int population = 12_000_000;
        int birthRatePerYearPer1000People = 17;
        int deathRatePerYearPer1000People = 8;
        int totalFertility = birthRatePerYearPer1000People * population / 1000;
        int totalMortality = deathRatePerYearPer1000People * population / 1000;
        int populationChangePerYear = totalFertility - totalMortality;

        for (int i = 1; i < 11; i++) {
            population = population + populationChangePerYear;

            System.out.println("Год " + i + " численность населения составляет " + population);
        }

    }

    // Решил при помощи цикла while

    public static void task13() {
        int population = 12_000_000;
        int birthRatePerYearPer1000People = 17;
        int deathRatePerYearPer1000People = 8;
        int totalFertility = birthRatePerYearPer1000People * population / 1000;
        int totalMortality = deathRatePerYearPer1000People * population / 1000;
        int populationChangePerYear = totalFertility - totalMortality;

        int year = 0;
        while (year < 10) {
            population = population + populationChangePerYear;
            year = year + 1;
            System.out.println("Год " + year + " численность населения составляет " + population);
        }


    }


    // Домашнее задание - 2.
    // Задача 1
    public static void task14() {

        double accumulation = 15_000;
        int month = 1;
        while (accumulation <= 12_000_000) {
            accumulation = (accumulation * 7 / 100) + accumulation;
            month++;
            String result = String.format("%.2f", accumulation);
            System.out.println("Месяц" + month + " сумма накоплений равна " + result + " руб.");


        }

    }

    // Задача 2.
    public static void task15() {
        double accumulation = 15_000;
        int month = 1;
        while (accumulation <= 12_000_000) {
            accumulation = (accumulation * 7 / 100) + accumulation;
            month++;
            if (month % 6 == 0) {

                String result = String.format("%.2f", accumulation);
                System.out.println("Месяц" + month + " сумма накоплений равна " + result + " руб.");

            }
        }

    }

    // Задача 3
    public static void task16() {
        double accumulation = 15_000;
        int month = 1;
        while (month < 108) {


            accumulation = (accumulation * 7 / 100) + accumulation;
            month++;
            if (month % 6 == 0) {
                String result = String.format("%.2f", accumulation);
                System.out.println("Месяц " + month + " сумма накоплений равна " + result + " руб.");

            }

        }
    }


    // Задача 4

    public static void task17() {
        int friday = 7;
        while (friday < 31) {

            System.out.println("Сегодня пятница " + friday + "-е число. Необходимо подготовить отчёт");
            friday = friday + 7;

        }


    }

    //Домашнее задание 3
    // Задача 1

    public static void task18() {
        int totalYearComet = 0;
        while (totalYearComet <= 2022) {
            totalYearComet = totalYearComet + 79;

            if (totalYearComet >= 1822 && totalYearComet <= 2122) {

                System.out.println(totalYearComet);

            }

        }

    }

    // Задание 2.
    public static void task19() {
        for (int i = 1; i < 11; i = i + 1) {
            int a = 2;
            int с = a * i;
            System.out.println(a + "*" + i + "=" + с);


        }

    }


}















