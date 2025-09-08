package opgave03;
import java.util.Scanner;
public class Opgave03 {

    public static String weekDay(int dag){
        if (dag == 0){
            return "Monday";
        } else if(dag == 1){
            return "Tuesday";
        } else if(dag == 2){
            return "Wednesday";
        } else if(dag == 3){
            return "Thursday";
        } else if(dag == 4){
            return "Friday";
        } else if(dag == 5){
            return "Saturday";
        } else if(dag == 6){
            return "Sunday";
        }
        return "That is not a valid day";
    }
    public static void main(String[] args) {
        /*for (int i = 0; i < 7; i++) {
            System.out.println(weekDay(i));
        }*/
        while (true) {
            
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number (0-6): ");
        int day = scanner.nextInt();

        System.out.println(weekDay(day));
        }
    }
}
