package WashingMachine;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int programme;
        int temperature = 0;
        int time = 0;

        System.out.print("Pick a programme: ");
        programme = s.nextInt();
        if (programme == 5) {

            System.out.print("Desired temperature: ");
            temperature = s.nextInt();
            System.out.print("Desired time: ");
            time = s.nextInt();
            System.out.print("Temperature: " + temperature + " degrees," + " Time: " + time + " minutes");

        } else if (programme == 4) {
            temperature = 50;
            time = 65;
            System.out.print("Temperature: " + temperature + " degrees," + " Time: " + time + " minutes");

        } else if (programme == 3) {
            temperature = 40;
            time = 98;
            System.out.print("Temperature: " + temperature + " degrees," + " Time: " + time + " minutes");
        } else if (programme == 2) {
            temperature = 90;
            time = 106;
            System.out.print("Temperature: " + temperature + " degrees," + " Time: " + time + " minutes");
        } else if (programme == 1) {
            temperature = 60;
            time = 125;
            System.out.print("Temperature: " + temperature + " degrees," + " Time: " + time + " minutes");
        } else {
            System.out.println("No such programme");
        }
    }
}
