package methods_in_java;

import java.util.Arrays;

class OTPGenerator {

    // a. Method to generate a 6-digit OTP
    public static int generateOTP() {
        // Generate a number between 100000 and 999999
        return (int) (Math.random() * 900000) + 100000;
    }

    // c. Method to check uniqueness of OTPs
    public static boolean areUnique(int[] otps) {
        for (int i = 0; i < otps.length; i++) {
            for (int j = i + 1; j < otps.length; j++) {
                if (otps[i] == otps[j]) {
                    return false; // duplicate found
                }
            }
        }
        return true; // all unique
    }

    public static void main(String[] args) {
        int[] otpArray = new int[10];
        for (int i = 0; i < otpArray.length; i++) {
            otpArray[i] = generateOTP();
        }

        // Display OTPs
        System.out.println("Generated OTPs: " + Arrays.toString(otpArray));

        // Check uniqueness
        if (areUnique(otpArray)) {
            System.out.println("All OTPs are unique ✅");
        } else {
            System.out.println("There are duplicate OTPs ❌");
        }
    }
}