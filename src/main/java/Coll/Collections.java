package Coll;

import java.io.*;
import java.util.*;
import java.util.Collections;


public class Collections {
    public static void main(String[] args) throws IOException {

        File file = new File("src\\main\\java\\Collections\\Collections.txt");
        int max;
        int min;
        String emax ="";
        String tmin = "";

        System.out.println("\n Список слов из файла \n");
        Scanner scanner = new Scanner(file);

        List<String> array = new ArrayList<String>();

        while (scanner.hasNext()) {
            array.add(scanner.next());

        }
        System.out.print(array);
        System.out.println("\n\n В алфавитном порядке \n");

        java.util.Collections.sort(array);
        System.out.println(array);

        System.out.println("\n\n Число повторений \n");
        for (int i = 0; i < array.size(); i++) {
            System.out.println(array.get(i) + " Число повторений: " + Collections.frequency(array, array.get(i)));

        }


        System.out.println("\n Слова с наибольшим и наименьшим количеством повторений \n");
        max = 0;
        for (int e = 0; e < array.size(); e++) {
            if (Collections.frequency(array, array.get(e)) > max) {
                max = Collections.frequency(array, array.get(e));
                emax = array.get(e);

            }

        }
        System.out.println("элемент с наибольшим числом повторений = " + emax + " число повторений: " + max);

        min = 1;
        for (int t = 0; t < array.size(); t++) {
            if (Collections.frequency(array, array.get(t)) <= min) {
                min = Collections.frequency(array, array.get(t));
                tmin = array.get(t);

            }

        }

        System.out.println("элемент с наименьшим числом повторений = " + tmin + " число повторений: " + min);
       }

}
