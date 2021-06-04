package Century;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int year;
        System.out.print("Year: ");
        year = sc.nextInt();

        if(year < 1901){
            System.out.println("Before 20th century");
        }
        else if(year > 2000){
            System.out.println("After 20th century");
        }
        else if (year > 1900 && year < 2000){
            System.out.println("During 20th century");
        }

    }
}
