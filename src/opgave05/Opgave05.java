package opgave05;

import java.util.Scanner;

public class Opgave05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Indtast nypris: ");
        int price = input.nextInt();
        double registrationFee = calculateFee(price);
        System.out.println("En bil der koster " + price + " uden registreringsafgift, skal man betale " +
                registrationFee + " i registreringsafgift.");
    }


    public static double calculateFee(int price) {
        double fee = 0;

        if (price <= 67800) {
            fee = price * 0.25;
        } else if (price <= 210600) {
            // Første 67.800 kr. = 25%
            fee = 67800 * 0.25;
            // Resten = 85%
            fee += (price - 67800) * 0.85;
        } else {
            // Første 67.800 kr. = 25%
            fee = 67800 * 0.25;
            // 67.800 – 210.600 kr. = 85%
            fee += (210600 - 67800) * 0.85;
            // Over 210.600 kr. = 150%
            fee += (price - 210600) * 1.5;
        }

        

        return fee;
    }
}
