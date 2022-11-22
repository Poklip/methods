public class Homework {

    public static String figureOutIsLeap (int year) {
        String answer;
        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            answer = year + " - високосный год.";
        } else {
            answer = year + " - не високосный год.";
        }
        return answer;
    }

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

    public static void main(String[] args){
        System.out.println(figureOutIsLeap(300));

        System.out.println(defineClientPhone(2010, 1));

    }
}
