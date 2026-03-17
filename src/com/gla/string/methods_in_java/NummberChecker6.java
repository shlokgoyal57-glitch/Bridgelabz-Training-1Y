package methods_in_java;

import java.util.Scanner;
import java.util.Arrays;

public class NummberChecker6 {
        public static int[] factorsArray(int n) {
            int count = 0;
            // First loop to count number of factors
            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    count++;
                }
            }

            int[] factors = new int[count];
            int index = 0;

            // Second loop to store factors in the array
            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    factors[index++] = i;
                }
            }

            return factors;
        }
        public static int greatestFactor(int[] factors) {
            return factors[factors.length - 1]; // last element is greatest
        }
        public static int sumOfFactors(int[] factors) {
            int sum = 0;
            for (int f : factors) {
                sum += f;
            }
            return sum;
        }
        public static long productOfFactors(int[] factors) {
            long product = 1;
            for (int f : factors) {
                product *= f;
            }
            return product;
        }
        public static long productOfCubes(int[] factors) {
            long product = 1;
            for (int f : factors) {
                product *= Math.pow(f, 3); // cube of each factor
            }
            return product;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int num = sc.nextInt();

            int[] factors = factorsArray(num);
            System.out.println("Factors of " + num + ": " + Arrays.toString(factors));
            System.out.println("Greatest factor: " +greatestFactor(factors));
            System.out.println("Sum of factors: " + sumOfFactors(factors));
            System.out.println("Product of factors: " +productOfFactors(factors));
            System.out.println("Product of cubes of factors: " +productOfCubes(factors));

            sc.close();
        }
}