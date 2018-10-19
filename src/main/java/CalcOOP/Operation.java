package CalcOOP;

import java.util.Scanner;

public class Operation {


    private String operator;
    private Scanner scanner = new Scanner(System.in);

    //Геттер
    public String getOperator() {
        return operator;
    }

    //Сеттер
    public void setOperator(String operator) {
        this.operator = operator;
    }

    //Ввод с клавиатуры

    public void inputOperator() {
        System.out.print("Выберите операцию (+,-,*,/): ");

        //Проверка, что введен поддерживаемый оператор
        while (true) {
            operator = scanner.next();
            if (!(operator.equals("+")) && !(operator.equals("-")) && !(operator.equals("*")) && !(operator.equals("/"))) {
                System.out.print("Такой операции нет! Выберите другую (+,-,*,/): ");
                scanner = new Scanner(System.in);


            } else break;


        }


    }
}
