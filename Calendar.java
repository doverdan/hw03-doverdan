
public class Calendar {
    // Starting the calendar on 1/1/1900
    static int dayOfMonth = 1;
    static int month = 1;
    static int year = 1900;
    static int dayOfWeek = 2;
    static int nDaysInMonth = 31;

    public static void main(String args[]) {

        int ChosenYear = Integer.parseInt(args[0]);
        while (year <= ChosenYear) {
            advance();
            if (year == ChosenYear) {
                if (dayOfWeek == 1) {
                    System.out.println(dayOfMonth + "/" + month + "/" + year + " Sunday");
                } else {
                    System.out.println(dayOfMonth + "/" + month + "/" + year);
                }

            }
        }

    }

    private static void advance() {
        dayOfMonth++;
        dayOfWeek++;
        if (dayOfWeek > 7)
            dayOfWeek = 1;
        nDaysInMonth = nDaysInMonth(month, year);
        if (dayOfMonth > nDaysInMonth) {
            dayOfMonth = 1;
            month++;
            if (month > 12) {
                month = 1;
                year++;
            }
        }
    }

    private static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;
                }
                return false;
            }
            return true;
        } else {
            return false;
        }
    }

    private static int nDaysInMonth(int month, int year) {
        if (month == 2) {
            if (isLeapYear(year)) {
                return 29;
            }
            return 28;
        }
        if (month == 4 || month == 6 || month == 9 || month == 11) {
            return 30;
        } else {
            return 31;
        }
    }

}
