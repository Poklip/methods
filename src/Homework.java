public class Homework {

    //Задача №1.
    public static String figureOutIsLeap (int year) {
        String answer;
        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            answer = year + " - високосный год.";
        } else {
            answer = year + " - не високосный год.";
        }
        return answer;
    }

    //Задача №2.
    public static String defineClientPhone (int clientDeviceYear, int operationSystem) {
        String OS;
        String version;
        if (operationSystem == 0) {
            OS = "iOS";
        } else if (operationSystem == 1) {
            OS = "Android";
        } else {
            return "Ваша операционная система не поддерживавет наше приложение.";
        }
        if (clientDeviceYear < 2015) {
            version = "облегченную";
        } else {
            version = "обычную";
        }
        String appVersion = "Установите " + version + " версию приложения для " + OS + " по ссылке.";
        return appVersion;
    }

    //Задача №3.
    public static int calculateDeliveryTime (int deliveryDistance) {
        byte days = 1;
        if (deliveryDistance >= 20 && deliveryDistance < 60) {
            days ++;
        } else if (deliveryDistance >= 60 && deliveryDistance < 100) {
            days += 2;
        } else if (deliveryDistance >= 100){
            days += 29;
        }
        return days;
    }

    //Задача №4.
    public static void isThereADouble (String letters) {
        StringBuilder soMuchLetters = new StringBuilder();
        for (int letter = 0; letter < letters.length(); letter ++) {
            char currentLetter = letters.charAt(letter);
            if (letters.lastIndexOf(currentLetter) != letters.indexOf(currentLetter) && (new String(soMuchLetters).indexOf(currentLetter) == -1)) {
                System.out.println("Дубль найден: " + currentLetter);
                return;
            }
        }
        System.out.println("Дублей нет.");
    }

    //Ответы в консоль.
    public static void main(String[] args){
        System.out.println(figureOutIsLeap(400));

        System.out.println(defineClientPhone(2019, 1));

        System.out.println("На доставку потребуется дней: " + calculateDeliveryTime(90) + ".");

        isThereADouble("arveyytbuim");

    }
}
