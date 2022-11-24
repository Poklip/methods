import java.util.Arrays;

public class Homework {
    //номер задания
    public static void taskNumber(int number) {
        System.out.println("\nЗадача №" + number + ".");
    }

    //генератор массива на 30 случайных чисел от 10^5 до 2*10^5
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100000) + 100000;
        }
        return arr;
    }

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
        return "Установите " + version + " версию приложения для " + OS + " по ссылке.";
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

    //Задача №5.
    public static void fixName (int[] numberArray) {
        int buffer; //о создании переменных речи не было ¯\_(ツ)_/¯
        for (int i = 0; i < numberArray.length; i++) {
            buffer = numberArray[i];
            numberArray[i] = numberArray[numberArray.length - 1 - i];
            numberArray[numberArray.length - 1 - i] = buffer;
            if (i == numberArray.length / 2) {
                break;
            }
        }
    }

    //Задача №6.
    public static void showDoubles (String letters) {
        StringBuilder soMuchLetters = new StringBuilder();
        for (int letter = 0; letter < letters.length(); letter ++) {
            char currentLetter = letters.charAt(letter);
            if (letters.lastIndexOf(currentLetter) != letters.indexOf(currentLetter) && (new String(soMuchLetters).indexOf(currentLetter) == -1)) {
                soMuchLetters.append(currentLetter);
                System.out.print(currentLetter);
            }
        }
        if (soMuchLetters.isEmpty()) {
            System.out.print("Дублей нет.");
        }
        System.out.println();
    }

    //Задача № 7.
    public static int giveMeSumOfArray(int[] array) {
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        return sum;
    }
    public static void averageSumPerDay (int[] array) {
        System.out.println("Средняя сумма трат за месяц составила " + giveMeSumOfArray(array)/(float) (array.length) + " р.");
    }


    //Ответы в консоль.
    public static void main(String[] args){
        taskNumber(1);
        System.out.println(figureOutIsLeap(400));

        taskNumber(2);
        System.out.println(defineClientPhone(2019, 1));

        taskNumber(3);
        System.out.println("На доставку потребуется дней: " + calculateDeliveryTime(90) + ".");

        taskNumber(4);
        isThereADouble("arveyytbuim");

        taskNumber(5);
        int[] testArray = {4, 6, -2345, 12, 23, 67, -4, 0};
        fixName(testArray);
        System.out.println(Arrays.toString(testArray));

        taskNumber(6);
        showDoubles("abbbcdefghhhhstuwvxyz");

        taskNumber(7);
        averageSumPerDay(generateRandomArray());

    }
}
