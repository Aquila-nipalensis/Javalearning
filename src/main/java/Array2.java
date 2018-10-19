import java.util.Random;
import java.util.Arrays;

/**
 *
 * @author Inozemtseva A.A.
 */
public class Array2 {
public static void main(String[] args) {
        Random rand = new Random();
// ввели массив с генерацией случайных чисел
        int massiv[] = new int[20];
        for (int i = 0; i < 20; i++) {
            massiv[i] = rand.nextInt(21) - 10;
        }
        System.out.println(Arrays.toString(massiv));
        // Вычисление максимального и минимального значения, а также индексов для последующей замены по индексам.
        int maximum = -20;
        int indexMax = 0;
        int minimum = 20;
        int indexMin = 0;
        for (int i = 1; i < massiv.length; i++) {
            if (massiv[i] > maximum &&  massiv[i]<0) { //максимальное отрицательное число
                maximum = massiv[i];
                indexMax = i;
            } else if (massiv[i] < minimum && massiv[i]>0) { // минимальное положительное число
                minimum = massiv[i];
                indexMin = i;
            }
        }
        System.out.println("Наибольший отрицательный элемент : " + maximum);
        System.out.println("индекс наибольшего отрицательного элемента: " + indexMax);
        System.out.println("Наименьший положительный элемент: " + minimum);
        System.out.println("индекс наименьшего положительного элемента: " + indexMin);
        massiv[indexMin] = maximum;
        massiv[indexMax] = minimum;
        System.out.println("Второй массив с перестановкой: ");
        System.out.println((Arrays.toString(massiv)));
    }
}
