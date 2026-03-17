package methods_in_java;

    import java.util.Scanner;

    class CalendarUtility {
        public static String getMonthName(int month) {
            String[] months = {"January", "February", "March", "April", "May", "June",
                    "July", "August", "September", "October", "November", "December"};
            return months[month - 1]; // month 1 → index 0
        }
        public static boolean isLeapYear(int year) {
            return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
        }
        public static int getDaysInMonth(int month, int year) {
            int[] days = {31, 28, 31, 30, 31, 30,
                    31, 31, 30, 31, 30, 31};
            if (month == 2 && isLeapYear(year)) {
                return 29;
            }
            return days[month - 1];
        }
        public static int getFirstDayOfMonth(int month, int year) {
            int m = month;
            int y = year;
            if (month < 3) {
                m += 12;
                y -= 1;
            }
            int q = 1;
            int k = y % 100;
            int j = y / 100;

            int h = (q + (13 * (m + 1)) / 5 + k + (k / 4) + (j / 4) + 5 * j) % 7;
            int day = ((h + 6) % 7);
            return day;
        }
        public static void displayCalendar(int month, int year) {
            String monthName = getMonthName(month);
            int daysInMonth = getDaysInMonth(month, year);
            int firstDay = getFirstDayOfMonth(month, year);

            System.out.println("     " + monthName + " " + year);
            System.out.println("Sun Mon Tue Wed Thu Fri Sat");

            for (int i = 0; i < firstDay; i++) {
                System.out.print("    ");
            }
            for (int day = 1; day <= daysInMonth; day++) {
                System.out.printf("%3d ", day);
                if ((day + firstDay) % 7 == 0) {
                    System.out.println();
                }
            }
            System.out.println();
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter month (1-12): ");
            int month = sc.nextInt();
            System.out.print("Enter year: ");
            int year = sc.nextInt();

            displayCalendar(month, year);

        }
    }
