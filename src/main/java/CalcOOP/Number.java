package CalcOOP;

import java.util.Scanner;

public class Number {

    private float number;

    //Геттер
    public float getNumber() {
        return number;
    }
    //Сеттер
    public void setNumber(float number) {
        this.number = number;
    }
    //Ввод с клавиатуры
    public void inputNumber(){

            System.out.print("введите число: ");

            Scanner scanner = new Scanner(System.in);
            number = scanner.nextFloat();

        }
    }
