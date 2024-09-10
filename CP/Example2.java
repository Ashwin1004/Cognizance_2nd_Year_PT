import java.util.Scanner;
public class time{

    private static String[] numbers = {
            "zero", "one", "two", "three", "four", "five",
            "six", "seven", "eight", "nine", "ten",
            "eleven", "twelve", "thirteen", "fourteen", "quarter",
            "sixteen", "seventeen", "eighteen", "nineteen", "twenty",
            "twenty one", "twenty two", "twenty three", "twenty four",
            "twenty five", "twenty six", "twenty seven", "twenty eight",
            "twenty nine", "half"};

    public static String timeInWords(int h, int m) {

        String nextHour = (h == 12) ? numbers[1] : numbers[h + 1];
        String currentHour = numbers[h];
        String result;

        if (m == 0) {
            result = currentHour + " o' clock";
        } else if (m == 15) {
            result = "quarter past " + currentHour;
        } else if (m == 30) {
            result = "half past " + currentHour;
        } else if (m == 45) {
            result = "quarter to " + nextHour;
        } else if (m > 0 && m < 30) {
            result = (m == 1 ? "one minute" : numbers[m] + " minutes") + " past " + currentHour;
        } else if (m > 30 && m < 60) {
            result = (60 - m == 1 ? "one minute" : numbers[60 - m] + " minutes") + " to " + nextHour;
        } else {
            result = "";
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hour = scanner.nextInt();
        int minute = scanner.nextInt();
        System.out.println(timeInWords(hour, minute));
        scanner.close();
    }
}
