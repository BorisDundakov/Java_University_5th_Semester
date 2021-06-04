package Excel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Excel {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("x: ");
        double x = scanner.nextDouble();
        System.out.print("y: ");
        double y = scanner.nextDouble();
        System.out.print("z: ");
        double z = scanner.nextDouble();
        System.out.print("Function: ");
        String operationType;
        operationType = scanner.next();
        double result = 0;
        List<Double> numbers = new ArrayList();
        numbers.add(x);
        numbers.add(y);
        numbers.add(z);
        Double max = Collections.max(numbers);
        Double min = Collections.min(numbers);


        double [] array_list = new double[3];
        switch (operationType){
            case "SUM":
                result = x + y + z ;
                break;

            case "AVERAGE":
                result = (x + y + z) / 3;
                break;

            case "MIN":
                result = min;
                break;

            case "MAX":
                result = max;
                break;

            default:
                System.out.println("Unsupported function");
                return;
        }
        System.out.printf("Result: %.4f\n" , result);
    }
}


