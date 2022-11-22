public class Main {
    public static void printSeparator(String args) { //создание метода, который в питоне называется функцией
        System.out.println(args.repeat(10));
    }

    public static void printIssues(int issueCount) {
        System.out.println(issueCount);
    }

    public static int sum (int[] issueArray) { //инт - важная херня, описывает тип возвращаемой переменной
        int sum = 0;
        for (int i : issueArray) {
            sum += i;
        }
        return sum; //возвращение значения
    }

    public static String fu () { //рекурсивные функции нафигк
        return "Как хороша зима летней порою.";
    }

    public static void main(String[] args) {
        int[] issuesByMonths = {4, 6, 7, 9, 2, 5, 12, 3, 7, 10, 6, 7, 1, 8};
        printSeparator("_");
        for (int i = 0; i < issuesByMonths.length; i++) {
            printIssues(issuesByMonths[i]);
            if ((i + 1) % 3 == 0) {
                printSeparator("=");
            }
        }
        printSeparator("_");
        printIssues(sum(issuesByMonths));
        System.out.println(fu());
    }
}