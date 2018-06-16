import java.util.Scanner;

/**
 * This is a simple calculator and program searching max element in array (I hope :))
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
        //Input action
        System.out.println("What I gonna do?");
        String k = scanner.next();
        float res = 0;
        //Take action for two floats
        switch (k) {
            case '+': res = i + j;
                System.out.printf("Result for action float one and float two is %.4f",res);
                break;
            case '-': res = i - j;
                System.out.printf("Result for action float one and float two is %.4f",res);
                break;
            case '/': res = i / j;
                System.out.printf("Result for action float one and float two is %.4f",res);
                break;
            case '*': res = i * j;
                System.out.printf("Result for action float one and float two is %.4f",res);
                break;
            default: System.out.println("I don't get it");
        }
        scanner.close();
    }
}
