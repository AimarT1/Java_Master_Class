public class MinutesToYearsAndDaysCalculator {
    public static void main(String[] args) {
        printYearsAndDays(525_600);
        printYearsAndDays(1_051200);
        printYearsAndDays(561_600);
        printYearsAndDays(-561_600);
    }

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        }else{
            long hours = minutes / 60;
            long days = hours / 24;
            long years = days / 365;
            long remainingDays = days % 365;
            System.out.println(minutes + " min = " + years + " y and " +  remainingDays + " d");

        }
    }
}
//arvutab minutitest tunnid
//