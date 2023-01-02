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
        System.out.println("Задача 1");
        byte a = 126;
        System.out.println(a);
        short b = 32767;
        System.out.println(b);
        int c = 214748364;
        System.out.println(c);
        long r = 9223372036854775807l;
        System.out.println(r);
        float e = 3.75f;
        System.out.println(e);
        double f = 3.3777777777f;
        System.out.println(f);

    }

    public static void task2 () {
        System.out.println("Задача 2");
        double a = 27.12;
        System.out.println(a);
        long b = 987678965549l;
        System.out.println(b);
        float c = 2.786f;
        System.out.println(c);
        short d = 569;
        System.out.println(d);
        short e =-159;
        System.out.println(e);
        int f = 27897;
        System.out.println(f);
        byte g = 67;
        System.out.println(g);


    }

    public static void task3 () {
        System.out.println("Задача 3");
        byte StudentsOfLyudmilaPalovna = 23;
        byte StudentsOfAnnaSergeevna = 27;
        byte StudentsOfCatherineAndreyevna = 30;
        short TotalNumberOfSheets = 480;
        int NumberOfSheetsPerStudent = TotalNumberOfSheets/(StudentsOfAnnaSergeevna+StudentsOfCatherineAndreyevna+StudentsOfLyudmilaPalovna);
        System.out.println(" На каждого ученика рассчитано "+ NumberOfSheetsPerStudent +" листов бумаги ");
    }

    public static void task4 () {
        System.out.println("Задача 4");
    byte a = 16;
    byte b = 2;
    System.out.println( "Производительность машины для изготовления бутылок " + a + " бутылок за " + b + " минуты" );
    byte c = 20;
    int d = c*(a/b);
    System.out.println( "Производительность машины для изготовления бутылок " + d + " бутылок за " + c + " минуты" );
    short e = 1440;
    int f = e*(a/b);
    System.out.println( "Производительность машины для изготовления бутылок " + f + " бутылок за " + e + " минуты" );
    short g = 1440*3;
    int h = g*(a/b);
    System.out.println( "Производительность машины для изготовления бутылок " + h + " бутылок за " + g + " минуты" );
    int i = 1140*30;
    int u = i*(a/b);
    System.out.println( "Производительность машины для изготовления бутылок " + u + " бутылок за " + i + " минуты" );
    }

    public static void task5 () {
        System.out.println("Задача 5");
        byte a = 120;
        byte b = 4;
        byte c = 2;
        int NumberOfClasses = a/(b+c);
        int TotalWhitePaint = NumberOfClasses*c;
        int TotalBrownPaint = NumberOfClasses*b;
        System.out.println( "В школе, где "+ NumberOfClasses+ " классов, нужно "+ TotalWhitePaint + " банок белой краски и " + TotalBrownPaint + " банок коричневой краски");
    }

    public static void task6 () {
        System.out.println("Задача 6");
    byte banana = 5;
    byte weightBanana = 80;
    short MilkMl = 200;
    short weight100MlMilk = 105;
    short iceCream = 2;
    short weightIceCream = 100;
    byte egg = 4;
    short weight1Egg = 70;
    short kg = 1000;
    int SportsBreakfastWeightInGrams = (banana*weightBanana)+((MilkMl/100)*weight100MlMilk)+(iceCream*weightIceCream)+(egg*weight1Egg);
    float SportsBreakfastWeightInKg = SportsBreakfastWeightInGrams/kg;
    System.out.println( "Спортивный завтрак весом "+ SportsBreakfastWeightInGrams + " грамм");
    System.out.println( "Спортивный завтрак весом "+ SportsBreakfastWeightInKg + " килограмм");
    }


    public static void task7 () {
        System.out.println("Задача 7");
        byte WeightToLoseKg = 7;
        short kg = 1000;
        int WeightInGrams= WeightToLoseKg*kg;
        short WeightForBurningGr1 = 250;
        short WeightForBurningGr2 = 500;
        int numberOfDaysToBurn1 = WeightInGrams/WeightForBurningGr1;
        int numberOfDaysToBurn2 = WeightInGrams/WeightForBurningGr2;
        System.out.println( "В первом случае потребуется "+ numberOfDaysToBurn1 + " дней, для похудения");
        System.out.println( "Во втором случае потребуется "+ numberOfDaysToBurn2 + " дней, для похудения");
    }

    public static void task8 () {
        System.out.println("Задача 8");
    int MashaSSalary = 67760;
    int DenisSSalary = 83690;
    int KristinaSSalary = 76230;
    double SalaryIncrease = 1.1;
    double MashaSSalaryIncrease = MashaSSalary*SalaryIncrease;
    double DenisSSalaryIncrease = DenisSSalary*SalaryIncrease;
    double KristinaSSalaryIncrease = KristinaSSalary*SalaryIncrease;
    byte NumberOfMonthsInAYear = 12;
    double MashaSAnnualIncome = (MashaSSalaryIncrease-MashaSSalary)*NumberOfMonthsInAYear;
    double DenisSAnnualIncome = (DenisSSalaryIncrease-DenisSSalary)*NumberOfMonthsInAYear;
    double KristinaSAnnualIncome = (KristinaSSalaryIncrease-KristinaSSalary)*NumberOfMonthsInAYear;
    System.out.println( "Маша теперь получает "+ MashaSSalaryIncrease + " рублей. Годовой доход вырос на " + MashaSAnnualIncome + " рублей");
    System.out.println( "Денис теперь получает "+ DenisSSalaryIncrease + " рублей. Годовой доход вырос на " + DenisSAnnualIncome + " рублей");
    System.out.println( "Кристина теперь получает "+ KristinaSSalaryIncrease + " рублей. Годовой доход вырос на " + KristinaSAnnualIncome + " рублей");
    }

}