package methods_in_java;
import java.util.Random;
import java.util.Arrays;

class EmployeeBonus {
    public static int[][] generateEmployees(int numEmployees) {
        int[][] empData = new int[numEmployees][2];
        Random rand = new Random();

        for (int i = 0; i < numEmployees; i++) {
            int salary = rand.nextInt(90000) + 10000;
            int years = rand.nextInt(10) + 1;
            empData[i][0] = salary;
            empData[i][1] = years;
        }
        return empData;
    }
    public static double[][] calculateBonus(int[][] empData) {
        int numEmployees = empData.length;
        double[][] newData = new double[numEmployees][2];

        for (int i = 0; i < numEmployees; i++) {
            int oldSalary = empData[i][0];
            int years = empData[i][1];
            double bonus;

            if (years > 5) {
                bonus = oldSalary * 0.05;
            } else {
                bonus = oldSalary * 0.02;
            }

            double newSalary = oldSalary + bonus;
            newData[i][0] = newSalary;
            newData[i][1] = bonus;
        }

        return newData;
    }
    public static void displayTable(int[][] empData, double[][] newData) {
        double totalOldSalary = 0;
        double totalNewSalary = 0;
        double totalBonus = 0;

        System.out.println("Emp\tOld Salary\tYears\tBonus\tNew Salary");
        System.out.println("------------------------------------------------------");
        for (int i = 0; i < empData.length; i++) {
            int oldSalary = empData[i][0];
            int years = empData[i][1];
            double bonus = newData[i][1];
            double newSalary = newData[i][0];

            totalOldSalary += oldSalary;
            totalNewSalary += newSalary;
            totalBonus += bonus;

            System.out.printf("%d\t%d\t\t%d\t%.2f\t%.2f\n", i+1, oldSalary, years, bonus, newSalary);
        }

    }
}