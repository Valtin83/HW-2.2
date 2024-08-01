public class Main {
    public static void main(String[] args) {
        System.out.println("Задача №1");
        int mouse = 4_766_809;
        byte cat = 67;
        short air = 1500;
        long bottom = -1_678_907_059_087_000L;
        float ship = 8.9856432f;
        double twin = 2.43678596545098;
        System.out.println("Значение переменной mouse типом int равно " + mouse);
        System.out.println("Значение переменной cat типом byte равно " + cat);
        System.out.println("Значение переменной air типом short равно " + air);
        System.out.println("Значение переменной bottom типом long равно " + bottom);
        System.out.println("Значение переменной ship типом float равно " + ship);
        System.out.println("Значение переменной twin типом double равно " + twin);

        System.out.println("Задача №2");
        float a = 27.12f;
        long b = 987_678_965_549L;
        float d = 2.786f;
        short c = 569;
        short e = -159;
        short g = 27897;
        byte h = 67;

        System.out.println("Задача №3");
        byte studentsLP = 23;
        byte studentsAS = 27;
        byte studentsEA = 30;
        int sumStudent = studentsLP + studentsAS + studentsEA;
        short paper = 480;
        int paperStudent = paper / sumStudent;
        System.out.println("На каждого ученика рассчитано " + paperStudent + " листов бумаги.");

        System.out.println("Задача №4");
        byte bottle = 16;
        byte time = 2;
        int oneMinuteBottle = bottle / time;
        byte time20 = 20;
        int efficiency20 = time20 * oneMinuteBottle;
        byte hourMinute = 60;
        byte hourDay = 24;
        int minuteDay = hourDay * hourMinute;
        int efficiencyDay = minuteDay * oneMinuteBottle;
        byte day = 3;
        int efficiency3Day = efficiencyDay * day;
        byte month = 30;
        int efficiencyMonth = efficiencyDay * month;
        System.out.println("За " + time20 + " минут машина произвела " + efficiency20 + " штук бутылок");
        System.out.println("За сутки машина произвела " + efficiencyDay + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + efficiency3Day + " штук бутылок");
        System.out.println("За месяц машина произвела " + efficiencyMonth + " штук бутылок");

        System.out.println("Задача №5");
        byte paint = 120;
        byte whitePaint = 2;
        byte brownPaint = 4;
        int paintClass = whitePaint + brownPaint;
        int classes = paint / paintClass;
        int weighingWhitePaint = classes * whitePaint;
        int weighingBrownPaint = classes * brownPaint;
        System.out.println("В школе, где " + classes + " классов, нужно " + weighingWhitePaint + " банок белой краски и " + weighingBrownPaint + " банок коричневой краски.");

        System.out.println("Задача №6");
        byte bananas = 5;
        byte weight1Banana = 80;
        int weightBananas = bananas * weight1Banana;
        short milk = 200;
        byte partMilk_1 = 100;
        int partMilk = milk / partMilk_1;
        byte weight100 = 105;
        int weightMilk = weight100 * partMilk;
        byte iceCream = 2;
        byte weightIceCream_1 = 100;
        int weightIceCream = weightIceCream_1 * iceCream;
        byte eggs = 4;
        byte weightEgg_1 = 70;
        int weightEggs = eggs * weightEgg_1;
        int weight_g = weightBananas + weightMilk + weightIceCream + weightEggs;
        short kgGr = 1000;
        float weight_kg = (float) weight_g / kgGr;
        System.out.println(weight_g + " гр.");
        System.out.println(weight_kg + " кг.");

        System.out.println("Задача №7");
        byte loseWeight = 7;
        short weightDay1 = 250;
        short weightDay2 = 500;
        float weightDay1Kg = (float) weightDay1 / kgGr;
        float weightDay2Kg = (float) weightDay2 / kgGr;
        int day1 = (int) (loseWeight / weightDay1Kg);
        int day2 = (int) (loseWeight / weightDay2Kg);
        System.out.println("По 250 гр.в день приведёт к результату за " + day1 + "  дней.");
        System.out.println("По 500 гр.в день приведёт к результату за " + day2 + " дней.");

        System.out.println("Задача №8");
        int wagesMasha = 67_760;
        int wagesDen = 83_690;
        int wagesKristina = 76_230;
        float percent10 = 0.1F;
        byte year = 12;
        int annualIncomeMasha = wagesMasha * year;
        int annualIncomeDen = wagesDen * year;
        int annualIncomeKristina = wagesKristina * year;
        int increasedWagesMasha = (int) (wagesMasha * percent10 + wagesMasha);
        int increasedWagesDen = (int) (wagesDen * percent10 + wagesDen);
        int increasedWagesKristina = (int) (wagesKristina * percent10 + wagesKristina);
        int increasedAnnualIncomeMasha = increasedWagesMasha * year;
        int increasedAnnualIncomeDen = increasedWagesDen * year;
        int increasedAnnualIncomeKristina = increasedWagesKristina * year;
        int differenceMasha = increasedAnnualIncomeMasha % annualIncomeMasha;
        int differenceDen = increasedAnnualIncomeDen % annualIncomeDen;
        int differenceKristina = increasedAnnualIncomeKristina % annualIncomeKristina;
        System.out.println("Маша теперь получает " + increasedWagesMasha + " рублей. Годовой доход вырос на " + differenceMasha + " рублей.");
        System.out.println("Денис теперь получает " + increasedWagesDen + " рублей. Годовой доход вырос на " + differenceDen + " рублей.");
        System.out.println("Кристина теперь получает " + increasedWagesKristina + " рублей. Годовой доход вырос на " + differenceKristina + " рублей.");

    }
}