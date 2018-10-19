import java.util.InputMismatchException;

public class CalcOOP {
    public static void main(String[] args) throws ArithmeticException {
        Peremennaya number_1 = new Peremennaya();
        Peremennaya_2 number_2 = new Peremennaya_2();
        Operator operator = new Operator();


        while (true) {
            try {
                number_1.vvedi();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Вы ввели не число! Попробуйте снова!");
                continue;
            }
        }


        operator.vvedi();




        while (true) {
            try {
                number_2.vvedi();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Вы ввели не число! Попробуйте снова!");
                continue;
            }
        }


        try {
            System.out.printf("%.4f",calculate(number_1,number_2,operator));
        }
        catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }



    }

    public static  float calculate(Peremennaya number_1,Peremennaya_2 number_2,Operator operator){
        if (operator.getOperand_1().equals("+")) {
            return number_1.getPeremennaya1() + number_2.getPeremennaya_2();

        } else if (operator.getOperand_1().equals("-")) {
            return number_1.getPeremennaya1() - number_2.getPeremennaya_2();

        } else if (operator.getOperand_1().equals("*")) {
            return number_1.getPeremennaya1() * number_2.getPeremennaya_2();

        } else if
        (operator.getOperand_1().equals("/")) {
            if (number_2.getPeremennaya_2()==0) {
               throw new ArithmeticException("делить на ноль нельзя");

            } else
                return number_1.getPeremennaya1() / number_2.getPeremennaya_2();

        } else {

            throw new InputMismatchException("введите другой оператор");
        }
    }
}
