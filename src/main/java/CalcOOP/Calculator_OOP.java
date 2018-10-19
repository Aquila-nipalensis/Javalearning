package CalcOOP;

import java.util.InputMismatchException;

public class Calculator_OOP {
    public static void main(String[] args) throws ArithmeticException {
        Number number_1 = new Number();
        Number number_2 = new Number();
        Operation oper = new Operation();

        //Вводим первое число, проверяем, что введено число
        while (true) {
            try {
                number_1.inputNumber();
                break;
            } catch (InputMismatchException e) {
                System.out.print("Введено не число! повторите ввод: ");
            }
        }
        //Вводим оператор
        oper.inputOperator();

        //Вводим второе число, проверяем что введено число
        while (true) {
            try {
                number_2.inputNumber();
                break;
            } catch (InputMismatchException e) {
                System.out.print("Введено не число! повторите ввод: ");
            }
        }

        //Выполняем операцию и выводим на экран результат
        try {
            System.out.printf("%.4f", execute(number_1, number_2, oper));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }


    }

    //Метод для вычислений
    public static float execute(Number number_1, Number number_2, Operation oper) {
        if (oper.getOperator().equals("+")) {
            return number_1.getNumber() + number_2.getNumber();


        } else if (oper.getOperator().equals("-")) {
            return number_1.getNumber() - number_2.getNumber();


        } else if (oper.getOperator().equals("*")) {
            return number_1.getNumber() * number_2.getNumber();


        } else if
                (oper.getOperator().equals("/")) {
            if (number_2.getNumber() == 0) {
                throw new ArithmeticException("Деление на ноль запрещено!");


            } else
                return number_1.getNumber() / number_2.getNumber();


        } else {

            throw new InputMismatchException("Такой операции нет! Выберите другую (+,-,*,/): ");
        }
    }
}
