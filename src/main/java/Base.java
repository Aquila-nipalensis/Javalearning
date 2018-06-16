import java.util.Scanner;

/**
 * This is a calculator
 *
 * @author Inozemtseva Anastasia
 * This program prints sum for two float
 */
public class Base {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Input first float
        System.out.println("Give me float one");
        float i = scanner.nextFloat();
        //Input second float
        System.out.println("Give me float two");
        float j = scanner.nextFloat();
        //Take sum for two floats
        float sum = i + j;
        //Print sum
        System.out.println("Summ float one and float two is ");
        System.out.printf("%.4f",sum);

        scanner.close();
    }
}
