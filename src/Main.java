public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");

        byte a = 10;
        System.out.println("Значение переменной a с типом byte равно " + a);

        short b = 15000;
        System.out.println("Значение переменной b с типом short равно " + b);

        int c = -1000000;
        System.out.println("Значение переменной c с типом int равно " + c);

        long d = 10000000000L;
        System.out.println("Значение переменной d с типом long равно " + d);

        float e = 15.456789f;
        System.out.println("Значение переменной e с типом float равно " + e);

        double f = 20.123456789;
        System.out.println("Значение переменной f с типом double равно " + f);

        //System.out.println("Задача 2");

        float g = 27.12f;
        long h = 987678965549L;
        byte j = 2;
        short k = 786;
        boolean l = 3 < 2;
        short x = 569;
        short m = -159;
        int v = 27897;
        byte n = 67;

        System.out.println("Задача 3");

        byte NumberOfStudentsKlass1 = 23;
        byte NumberOfStudentsKlass2 = 27;
        byte NumberOfStudentsKlass3 = 30;

        int paperQuantity = 480;

        int PaperPerPerson = paperQuantity / (NumberOfStudentsKlass1 + NumberOfStudentsKlass2 + NumberOfStudentsKlass3);

        System.out.println("На каждого ученика рассчитано " + PaperPerPerson + " листов бумаги");

        System.out.println("Задача 4");

        byte machineProductivity = 16 / 2;
        int operationTime1 = 20;
        int bottle1 = operationTime1 * machineProductivity;
        int operationTime2 = 60 * 24;
        int bottle2 = machineProductivity * operationTime2;
        int operationTime3 = 60 * 24 * 3;
        int bottle3 = machineProductivity * operationTime3;
        int operationTime4 = 60 * 24 * 30;
        int bottle4 = machineProductivity * operationTime4;

        System.out.println("За " + operationTime1 + " минут машина произвела бутылок " + bottle1 + " штук");
        System.out.println("За сутки машина произвела бутылок " + bottle2 + " штук");
        System.out.println("За 3 дня машина произвела бутылок " + bottle3 + " штук");
        System.out.println("За месяц машина произвела бутылок " + bottle4 + " штук");

        System.out.println("Задача 5");

        byte PaintCanes = 120;
        byte PaintCanesWhite = 2;
        byte PaintCanesBrown = 4;
        int PaintCanesForRoom = PaintCanesBrown + PaintCanesWhite;
        int Rooms = PaintCanes / PaintCanesForRoom;
        int PaintCanesWhiteTotal = PaintCanesWhite * Rooms;
        int PaintCanesBrownTotal = PaintCanesBrown * Rooms;

        System.out.println("В школе, где " + Rooms + " классов, нужно " + PaintCanesWhiteTotal + " банок белой краски и " + PaintCanesBrownTotal + " банок коричневой краски");

        System.out.println("Задача 6");

        byte bananasNumber = 5;
        byte bananasWeight = 80;
        int milkQuantity = 200;
        double milkWeight = (105.00 / 100.00);
        byte iceCreamNumber = 2;
        byte iceCreamWeight = 100;
        byte eggsWeight = 70;
        byte eggsNumber = 4;
        int bananasWeightTotal = bananasWeight * bananasNumber;
        //System.out.println("Вес бананов " + bananasWeightTotal + " граммов");
        double milkWeightTotal = milkWeight * milkQuantity;
        //System.out.println("Вес молока " + milkWeightTotal + " граммов");
        int iceCreamWeightTotal = iceCreamWeight * iceCreamNumber;
        //System.out.println("Вес мороженого пломбир " + iceCreamWeightTotal + " граммов");
        int eggsWeightTotal = eggsWeight * eggsNumber;
        //System.out.println("Вес яиц " + eggsWeightTotal + " граммов");

        double breakfastWeight = bananasWeightTotal + milkWeightTotal + iceCreamWeightTotal + eggsWeightTotal;
        System.out.println("Вес спорт-завтрака " + breakfastWeight + " граммов");
        double breakfastWeight2 = breakfastWeight / 1000;
        System.out.println("Вес спорт-завтрака " + breakfastWeight2 + " кг");

        System.out.println("Задача 7");

        int weightLeft = 7 * 1000;
        int dayNumber1 = weightLeft / 250;
        int dayNumber2 = weightLeft / 500;

        System.out.println("Если каждый день худеть на 250 грамм, то потребуется " + dayNumber1 + " дней");
        System.out.println("Если каждый день худеть на 500 грамм, то потребуется " + dayNumber2 + " дней");

        System.out.println("Задача 8");

        int MashaSalaryNow = 67760;
        int DenisSalaryNow = 83690;
        int KristinaSalaryNow = 76230;

        int MashaSalaryNowTotal = MashaSalaryNow * 12;
        int DenisSalaryNowTotal = DenisSalaryNow * 12;
        int KristinaSalaryNowTotal = KristinaSalaryNow * 12;

        int MashaSalaryNew = MashaSalaryNow + (MashaSalaryNow / 10);
        int DenisSalaryNew = DenisSalaryNow + (DenisSalaryNow / 10);
        int KristinaSalaryNew = KristinaSalaryNow + (KristinaSalaryNow / 10);

        int MashaSalaryNewTotal = MashaSalaryNew * 12;
        int DenisSalaryNewTotal = DenisSalaryNew * 12;
        int KristinaSalaryNewTotal = KristinaSalaryNew * 12;

        System.out.println("Маша теперь получает " + MashaSalaryNew + " рублей. Годовой доход вырос на " +(MashaSalaryNewTotal - MashaSalaryNowTotal) + " рублей");
        System.out.println("Денис теперь получает " + DenisSalaryNew + " рублей. Годовой доход вырос на " +(DenisSalaryNewTotal - DenisSalaryNowTotal) + " рублей");
        System.out.println("Кристина теперь получает " + KristinaSalaryNew + " рублей. Годовой доход вырос на " +(KristinaSalaryNewTotal - KristinaSalaryNowTotal) + " рублей");



    }
}