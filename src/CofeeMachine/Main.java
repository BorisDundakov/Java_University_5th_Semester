package CofeeMachine;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Amount: ");
        double amount = s.nextDouble();
        double price;
        double change;
        List<String> Menu = new ArrayList();
        String menu = "1. short espresso\t0.50\n2. long espresso\t0.60 \n3. cappuccino     \t0.85\n4. coffee with milk\t0.90\n5. caffeine-free\t0.60" ;
        System.out.println(menu);
        System.out.print("Your choice: ");
        int choice = s.nextInt();
        if (choice > 5 || choice < 1) {
            System.out.println("Please select from the menu");
            return;
        } else {
            if (choice == 1) {
                price = 0.50;
            } else if (choice == 2 || choice == 5) {
                price = 0.60;
            } else if (choice == 3) {
                price = 0.85;
            } else {
                price = 0.90;
            }
        }
        if (price < amount){
            change = amount - price;
            System.out.println("Preparing your drink...");
            System.out.printf("Change: %.2f\n" , change);
            return;
        }
        else if (price == amount){
            System.out.println("Preparing your drink...");
        }
        else if (price > amount){
            System.out.println("Not enough money");
        }
    }
}
