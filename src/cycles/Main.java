package cycles;

public class Main {

    public static void main(String[] args) {
        task3();
    }


    // ЦИКЛЫ. УРОК 2
    // Домашнее задание -1
    // Задача 1

    public static void task1() {
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
    public static void task2() {
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
    public static void task3() {
        int population = 12_000_000;
        int birthRatePerYearPer1000People = 17;
        int deathRatePerYearPer1000People = 8;
        for (int year = 0; year <= 10; year++) {
            int populationIncreasePerYear = (birthRatePerYearPer1000People - deathRatePerYearPer1000People) * (population / 1000);
            population = population + populationIncreasePerYear;

            System.out.printf("Год %d , численность населения составляет %d \n", year, population);

        }


    }


    // Домашнее задание - 2.
    // Задача 1
    public static void task4() {

        double accumulation = 15_000;
        int month = 0;
        while (accumulation <= 12_000_000) {
            accumulation += accumulation * 7 / 100;
            month++;
            String result = String.format("%.2f", accumulation);
            System.out.println("Месяц" + month + " сумма накоплений равна " + result + " руб.");


        }

    }

    // Задача 2.
    public static void task5() {
        double accumulation = 15_000;
        int month = 0;
        while (accumulation <= 12_000_000) {
            accumulation += accumulation * 7 / 100;
            month++;
            if (month % 6 == 0) {

                String result = String.format("%.2f", accumulation);
                System.out.println("Месяц" + month + " сумма накоплений равна " + result + " руб.");

            }
        }

    }

    // Задача 3
    public static void task6() {
        double accumulation = 15_000;
        int month = 0;
        int willAccumulateInMonths = 9 * 12;

        while (month < willAccumulateInMonths) {


            accumulation += accumulation * 7 / 100;
            month++;
            if (month % 6 == 0) {
                String result = String.format("%.2f", accumulation);
                System.out.println("Месяц " + month + " сумма накоплений равна " + result + " руб.");

            }

        }
    }


    // Задача 4

    public static void task7() {
        int friday = 7;
        while (friday < 31) {

            System.out.println("Сегодня пятница " + friday + "-е число. Необходимо подготовить отчёт");
            friday = friday + 7;

        }


    }

    //Домашнее задание 3
    // Задача 1

    public static void task8() {
        int presentTime = 2022;
        int twoHundredYearsBeforeTheCurrentYear = presentTime - 200;
        int oneHundredYearsBeforeThisYear = presentTime + 100;
        for (int i = twoHundredYearsBeforeTheCurrentYear; i < oneHundredYearsBeforeThisYear; i++) {
            if (i % 79 == 0) {
                System.out.println(i);

            }


        }

    }

    // Задание 2.
    public static void task9() {
        for (int i = 1; i < 11; i = i + 1) {
            int a = 2;
            int с = a * i;
            System.out.println(a + "*" + i + "=" + с);


        }

    }


}















