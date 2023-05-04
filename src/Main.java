public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }
        public static void task1 () {
        int a = 1000000000;
        byte b = 15;
        short c = 21530;
        long d = 252313134135211L;
        float f = 23.4f;
        double g = 25.3;
            System.out.println("Задача 1");
            System.out.println("Значение переменной a" + " с типом int равно " + a);
            System.out.println("Значение переменной b" + " с типом byte равно " + b);
            System.out.println("Значение переменной c" + " с типом short равно " + c);
            System.out.println("Значение переменной d" + " с типом long равно " + d);
            System.out.println("Значение переменной f" + " с типом float равно " + f);
            System.out.println("Значение переменной g" + " с типом double равно " + g);
        }
        public static void task2 ()
        {
            System.out.println("Задача 2");
            float a = 27.12f;
            long b = 987678965549L;
            float c = 2.786f;
            short d = 569;
            short f = -159;
            short g = 27897;
            byte h = 67;
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
            System.out.println(d);
            System.out.println(f);
            System.out.println(g);
            System.out.println(h);


        }
        public static void task3 ()
        {
            System.out.println("Задача 3");

            short lP = 23;
            short aS = 27;
            short eA = 30;
            short allPaper = 480;
            int everyOnePaper = allPaper / (lP + aS + eA);
            System.out.println("На каждого ученика рассчитано " + everyOnePaper + " листов бумаги");
        }
        public static void task4 ()
        {
            System.out.println("Задача 4");
            int bottles = 16;
            int time = 2;
            int timePerMin = bottles / time;
            int time1 = 20;
            int time2 = 3600;
            int time3 = 3600 * 3;
            int time4 = 3600 * 30;
            int a = time1 / timePerMin;
            int b = time2 / timePerMin;
            int c = time3 / timePerMin;
            int d = time4 / timePerMin;
            System.out.println("За " + time1 + " минут машина произвела " + a + " штук бутылок");
            System.out.println("За " + time2 + " минут машина произвела " + b + " штук бутылок");
            System.out.println("За " + time3 + " минут машина произвела " + c + " штук бутылок");
            System.out.println("За " + time4 + " минут машина произвела " + d + " штук бутылок");
        }
        public static void task5()
        {
            System.out.println("Задача 5");
            int allBugs = 120;
            int oneWhitePerClass = 2;
            int oneBrownPerClass = 4;
            int allClasses = allBugs / (oneBrownPerClass + oneWhitePerClass);
            float allWhiteClasses = oneWhitePerClass * allClasses;
            float allBrownClasses = oneBrownPerClass * allClasses;
            System.out.println("В школе, где " + allClasses + " классов, нужно " + allWhiteClasses + " банок белой краски и " + allBrownClasses + " банок корочиневой краски");
        }
        public static void task6()
        {
            System.out.println("Задача 7");
            byte weightBanana = 80;
            byte allBananas = 5;
            int allWeightBananas = weightBanana * allBananas;
            int vMilkMl = 200;
            float allWeightMilk = vMilkMl * 1.05f;
            int iceCreamPerPortion = 100;
            byte iceCream = 2;
            byte weightEgg = 70;
            byte allEggs = 4;
            int allWeightEggs = weightEgg * allEggs;
            float allProd = allWeightBananas + allWeightMilk + allWeightEggs + (iceCream * iceCreamPerPortion);
            float allProdkg = allProd / 1000f;
            System.out.println("Общий вес пориции " + allProd + " грамм");
            System.out.println("Общий вес порции " + allProdkg + " килограмм");
        }
        public static void task7 ()
        {
            System.out.println("Задача 7");
            int allWeight = 7;
            float minWeight = 0.25f;
            float maxWeight = 0.5f;
            float maxDays = allWeight / minWeight;
            float minDays = allWeight / maxWeight;
            System.out.println("При похудении на 250 грамм в день, нужно " + maxDays + " дней, а если худеть на 500 грамм в день, то нужно " + minDays + " дней");
        }
        public static void task8 ()
        {
            System.out.println("Задача 8");
            int salaryMasha = 67760;
            int salaryDenis = 83680;
            int salaryKris = 76230;
            float deltaPerYear = 1.1f;
            float nextYearSalaryMasha = salaryMasha * deltaPerYear;
            float nextYearSalaryDenis = salaryDenis * deltaPerYear;
            float nextYearSalaryKris = salaryKris * deltaPerYear;
            float allSalary = salaryDenis + salaryKris + salaryMasha;
            float newSalary = nextYearSalaryDenis + nextYearSalaryKris + nextYearSalaryMasha;
            float differenceBetweenYears = newSalary - allSalary;
            float mashaDiff = nextYearSalaryMasha - salaryMasha;
            float denisDiff = nextYearSalaryDenis - salaryDenis;
            float krisDiff = nextYearSalaryKris - salaryKris;
            System.out.println("Маша теперь получает " + nextYearSalaryMasha + " рублей. Годовой доход вырос на " + mashaDiff + " рублей");
            System.out.println("Денис теперь получает " + nextYearSalaryDenis + " рублей. Годовой доход вырос на " + denisDiff + " рублей");
            System.out.println("Кристина теперь получает " + nextYearSalaryKris + " рублей. Годовой доход вырос на " + krisDiff + " рублей");
            System.out.println("Разница суммарных годовых доходов трех сотрудников составляет " + differenceBetweenYears);
        }
    }
