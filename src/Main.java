public class Main {
    public static void main(String[] args) {
        //Общее
        int i   =   45;
        System.out.println("Значение преременной i c типом int равно: " + i);
        byte num = 23;
        System.out.println("Значение преременной num c типом byte равно: " + num);
        short meaning = 100;
        System.out.println("Значение преременной meaning c типом shot равно: " + meaning);
        long dogWeight = 1000;
        System.out.println("Значение преременной dogWeight c типом int равно: " + dogWeight);
        float catWeight = 78.34f;
        System.out.println("Значение переменной catWeight c типом flot равно: " + catWeight);
        double res = 23.3345;
        System.out.println("Значение переменной res c типом double равно: " + res);
        //Пример

        float num1 = 27.12f;
        System.out.println("Elements num1 равен: " + num1);
        long bananas = 987678965549L;
        System.out.println("Значение bananas равен: " + bananas);
        double weight = 2.786;
        System.out.println("Значение double weight равно: " + weight);
        int a = 569;
        System.out.println("Значение int a равно: " + a);
        short degrees = -159;
        System.out.println("Значение short degrees равно: " + degrees);
        short population = 27897;
        System.out.println("Значение short population равно: " + population);
        byte cat = 67;
        System.out.println("Значение byte cat равно: " + cat);
        //Задача с учителем
        byte teacherStudents1 = 23;
        System.out.println("Количество учеников у Людмилы Павловны: " + teacherStudents1 + " человека");
        byte teacherStudents2 = 27;
        System.out.println("Количество учеников у Анны Сергеевны: " + teacherStudents2 + " человек");
        byte teacherStudents3 = 30;
        System.out.println("Количество учеников у Екатерины Александровны: " + teacherStudents3 + " человек");
        short generalPaper = 480;
        System.out.println("Общее количество купленной бумаги: " + generalPaper + " шт.");
        int generalStudents = teacherStudents1 + teacherStudents2 + teacherStudents3;
        int studentsPaper = generalPaper / generalStudents;
        System.out.println("На каждого ученика рассчитано " + studentsPaper + " листов бумаги");
        //Здача с производительностью завода
        byte machinePerformance1 = 16;
        System.out.println("Производительность машины за 2 минуты составляет: " + machinePerformance1 + " бутылок");
        float machinePerformance2 = machinePerformance1 / 2f;
        System.out.println("Производительность машины за 1 минуту составляет: " + machinePerformance2 + " бутылок");
        float machinePerformance3 = machinePerformance2 * 20f;
        System.out.println("Производительность машины за 20 минут составит: " + machinePerformance3 + " бутылок");
        int dayMinutes = 60 * 24;
        System.out.println("В одних сутках " + dayMinutes + " минут");
        float machinePerformance4 = machinePerformance2 * dayMinutes;
        System.out.println("Производительность машины за 24 часа составит: " + machinePerformance4 + " бутылок");
        float machinePerformance5 = dayMinutes * 3f;
        System.out.println("Производительность машины за 3 дня составит: " + machinePerformance5 + " бутылок");
        float machinePerformance6 = machinePerformance4 * 30f;
        System.out.println("Производительность машины за 1 месяц  составит: " + machinePerformance6 + " бутылок");
        //Задача про ремонт школы
        byte paintGeneral = 120;
        System.out.println("Общее количество краски: " + paintGeneral + " банок");
        float roomGeneral = paintGeneral / 6f;
        System.out.println("Количество классов в школе: " + roomGeneral);
        float paintWhite = roomGeneral * 2f;
        float paintBrown = roomGeneral * 4f;
        System.out.println("В школе, где " + roomGeneral + " классов, нужно " + paintWhite + " банок белой краски и " + paintBrown + " банок коричневой краски.");
        //Задача про спортсменов
        byte bananaWeight = 80;
        byte milkWeight = 105;
        byte iceCreamWeight = 100;
        byte eggWeight = 70;
        int bananaGeneral = bananaWeight * 5;
        int milkGeneral = milkWeight * 2;
        int iceCreamGeneral = iceCreamWeight * 2;
        int eggGeneral = eggWeight * 4;
        int breakfastGrams = bananaGeneral + milkGeneral + iceCreamGeneral + eggGeneral;
        System.out.println("Вес спортивного завтрака в граммах составит: " + breakfastGrams + " грамм");
        float breakfastKg = breakfastGrams / 1000f;
        System.out.println("Вес спортивного питания в килограммах составит: " + breakfastKg);
        //Задача про правила соревнований
        int redWeight = 7;
        int weightGR = redWeight * 1000;
        float weightLoss1 = 250f;
        float weightLoss2 = 500f;
        float dayLoss1 = weightGR / weightLoss1;
        float dayLoss2 = weightGR / weightLoss2;
        System.out.println("Если спортсмен будет терять по 250 грамм веса, то на похудение уйдет " + dayLoss1 + " дней");
        System.out.println("Если спортсмен будет терять по 500 грамм веса, то на похудение уйдет " + dayLoss2 + " дней");
        float daySumm = dayLoss1 + dayLoss2;
        float daySrLoss = daySumm / 2;
        System.out.println("В среднем может понадобится " + daySrLoss + " день для похудения");
        //Задача про штат в большой компании
        int incomeEmp1 = 67760;
        int incomeEmp2 = 83690;
        int incomeEmp3 = 76230;
        float incomeIncrease1 = incomeEmp1 * 1.1f;
        float incomeIncrease2 = incomeEmp2 * 1.1f;
        float incomeIncrease3 = incomeEmp3 * 1.1f;
        float incomeIncreaseYear1 = incomeIncrease1 * 12f;
        float incomeIncreaseYear2 = incomeIncrease2 * 12f;
        float incomeIncreaseYear3 = incomeIncrease3 * 12f;
        float incomeEmpYear1 = incomeEmp1 * 12f;
        float incomeEmpYear2 = incomeEmp2 * 12f;
        float incomeEmpYear3 = incomeEmp3 * 12f;
        float diffrence1 = incomeIncreaseYear1 - incomeEmpYear1;
        float diffrence2 = incomeIncreaseYear2 - incomeEmpYear2;
        float diffrence3 = incomeIncreaseYear3 - incomeEmpYear3;
        System.out.println("Маша теперь получает " + incomeIncrease1 + " рублей. Годовой доход вырос на " + diffrence1 + " рублей");
        System.out.println("Денис теперь получает " + incomeIncrease2 + " рублей. Годовой доход вырос на " + diffrence2 + " рублей");
        System.out.println("Кристина теперь получает " + incomeIncrease3 + " рублей. Годовой доход вырос на " + diffrence3 + " рублей");










    }
}