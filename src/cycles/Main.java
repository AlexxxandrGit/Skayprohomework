package cycles;

public class Main {

    public static void main(String[] args) {task11();}

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
        for (int i = 1; i <=12; i++ ) {
            accumulation = accumulation + contribution;
            accumulation = accumulation + accumulation/100;
            System.out.println(" Месяц " + i + " сумма накоплений равна " + accumulation + " руб.");

        }


    }

    // Циклы. Урок 2.
    // Домашнее задание -1
    // Задание 1

    public static void task10() {
        System.out.println("Домашнее задание - 1");
        System.out.println(" Задание 1");
        System.out.println();
        int contribution = 15000;
        int accumulation = 0;
        int month  = 0;
        while (accumulation < 2_459_000) {
            accumulation = accumulation + accumulation / 100;
            accumulation = accumulation + contribution;
            month++;

            System.out.println("Месяц " + month + " сумма накоплений равна " + accumulation + " рублей");

        }

    }

    // Домашнее задание -1
    // Задание 2
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
        for (b=10; b>0; b--){
            System.out.print(" " + b);
        }



    }




    }















