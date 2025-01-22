public class Main {
    public static void main(String[] args) {

        System.out.println("задача 1");
        byte box1b = 125;
        short box2b = -32765;
        int box4b = 32770;
        long box8bL = -2147483650L;
        float boxPoint4bf = 0.123456f;
        double boxPoint8b = 1.123456789;
        System.out.println("Значение переменной box1b с типом byte равно " + box1b);
        System.out.println("Значение переменной box2b с типом short равно " + box2b);
        System.out.println("Значение переменной box4b с типом int равно " + box4b);
        System.out.println("Значение переменной box8bL с типом long равно " + box8bL);
        System.out.println("Значение переменной boxPoint4bf с типом float равно " + boxPoint4bf);
        System.out.println("Значение переменной boxPoint8b с типом double равно " + boxPoint8b);

        System.out.println("\nзадача 2");
        float box1 = 27.12f;
        long box2 = 987678965549L;
        float box3 = 2.786f;
        short box4 = 569;
        short box5 = -159;
        short box6 = 27897;
        byte box7 = 67;

        System.out.println("\nзадача 3");
        byte lydmilaPavlovna = 23;
        byte annaSergeevna = 27;
        byte ekaterinaAndreevna = 30;
        short paperList = 480;
        int sumChildren = lydmilaPavlovna + annaSergeevna + ekaterinaAndreevna;
        int oneChaild = paperList / sumChildren;
        System.out.println("На каждого ученика рассчитано " + oneChaild + " листов бумаги");

        System.out.println("\nзадача 4");
        byte bottel2minute = 16;
        int bottle1Minute = bottel2minute / 2;
        int bottle20Minute = bottle1Minute * 20;
        int bottleDay = bottle1Minute * (24 * 60);
        int bottleDay3 = bottle1Minute * (24 * 60 * 3);
        int bottleMonth = bottle1Minute * (24 * 60 * 31);
        System.out.println("За 20 минут машина произвела " + bottle20Minute + " штук бутылок");
        System.out.println("За сутки машина произвела " + bottleDay + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + bottleDay3 + " штук бутылок");
        System.out.println("За 1 месяц машина произвела " + bottleMonth + " штук бутылок");

        System.out.println("\nзадача 5");
        byte totalCanPaint = 120;
        byte whitePaint = 2;
        byte brownPaint = 4;
        int totalClassPaint = totalCanPaint / (whitePaint + brownPaint);
        int classPaintWhite = totalClassPaint * whitePaint;
        int classPaintBrown = totalClassPaint * brownPaint;
        System.out.println("В школе, где " + totalClassPaint + " классов, нужно " + classPaintWhite + " банок белой краски и " + classPaintBrown + " банок коричневой краски");

        System.out.println("\nзадача 6");
        byte bananQuantity = 5;
        byte bananWeight = 80;
        int bananWeightTotal = bananQuantity * bananWeight;
        byte milkQuantity = 2;
        byte milkWeight = 105;
        int milkWeightTotal = milkQuantity * milkWeight;
        byte iceQuantity = 2;
        byte iceWeight = 100;
        int iceWeightTotal = iceQuantity * iceWeight;
        byte eggQuantity = 4;
        byte eggWeight = 70;
        int eggWeightTotal = eggQuantity * eggWeight;
        int productTotalGr = bananWeightTotal + milkWeightTotal + iceWeightTotal + eggWeightTotal;
        short grPerKg = 1000;
        float productTotalKg = (float) productTotalGr / grPerKg;
        System.out.println("Вес завтрака в граммах = " + productTotalGr);
        System.out.println("Вес завтрака в килограммах = " + productTotalKg);

        System.out.println("\nзадача 7");
        byte excessWeightKg = 7;
        int excessWeightGr = excessWeightKg * 1000;
        short minLossWeight = 250;
        short maxLossWeight = 500;
        float losingWeightSlow = (float) excessWeightGr / minLossWeight;
        float losingWeightFast =  (float) excessWeightGr / maxLossWeight;
        float losingWeightMedium = (losingWeightSlow + losingWeightFast) / 2;
        System.out.println(losingWeightSlow);
        System.out.println(losingWeightFast);
        System.out.println(losingWeightMedium);

        System.out.println("\nзадача 8");
        int zpMashaMonth = 67760;
        int zpDenisMonth = 83690;
        int zpKristinaMonth = 76230;
        float indexZp = 1.1f;
        float zpMashaIndex = zpMashaMonth * indexZp;
        float zpDenisIndex = zpDenisMonth * indexZp;
        float zpKristinaIndex = zpKristinaMonth * indexZp;
        float increaseZpMashaYear = (zpMashaIndex - zpMashaMonth) * 12;
        float increaseZpDenisYear = (zpDenisIndex - zpDenisMonth) * 12;
        float increaseZpKristinaYear = (zpKristinaIndex - zpKristinaMonth) * 12;
        System.out.println("Маша теперь получает " + zpMashaIndex + " рублей. Годовой доход вырос на " + increaseZpMashaYear + " рублей");
        System.out.println("Денис теперь получает " + zpDenisIndex + " рублей. Годовой доход вырос на " + increaseZpDenisYear + " рублей");
        System.out.println("Кристина теперь получает " + zpKristinaIndex + " рублей. Годовой доход вырос на " + increaseZpKristinaYear + " рублей");
        // почему float выдает в консоль 1 знак после запятой, если данный тип хранит до 7 знаков
    }
}