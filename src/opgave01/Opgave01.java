package opgave01;

import java.util.Scanner;

public class Opgave01 {

    public static final int MINIMUM_AGE = 16;

    public static boolean isOldEnough(int age, float percent) {
         if (percent > 16.5) {
        // Stærk spiritus – kræver 18 år
        return age >= 18;
    } else if (percent > 1.2) {
        // Let alkohol – kræver 16 år
        return age >= 16;
    } else {
        // Under eller lig med 1,2% – ingen aldersgrænse
        return true;
    }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            
        
        System.out.print("Indtast din alder: ");
        int age = scanner.nextInt();
        System.out.print("Indtast alkoholprocenten: ");
        float percent = scanner.nextFloat();


        if (isOldEnough(age, percent)) {
            System.out.println("Du må købe drikken.");
        } else {
            System.out.println("Du må ikke købe drikken.");
        }
    }

    }
}
