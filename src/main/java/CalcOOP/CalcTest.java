import CalcOOP.Calculator_OOP;
import org.junit.Assert;
import org.junit.Test;
import CalcOOP.Number;
import CalcOOP.Operation;



//JUnit test
public class CalcTest extends Calculator_OOP {


    @Test
    public void Add() {


        System.out.println("Тест на сложение");
        Number number1 = new Number();
        number1.setNumber(2);
        Number number2 = new Number();
        number2.setNumber(2);
        Operation oper = new Operation();
        oper.setOperator("+");
        float expResult = 4;


        Assert.assertEquals(expResult, Calculator_OOP.execute(number1,number2,oper), 0.01);

    }


    @Test(expected = ArithmeticException.class)
    public void deleteByZero() {
        System.out.println("Тест на исключение");
        Number number1 = new Number();
        number1.setNumber(2);
        Number number2 = new Number();
        number2.setNumber(0);
        Operation oper = new Operation();
        oper.setOperator("/");


        Calculator_OOP.execute(number1,number2,oper);
    }


    @Test
    public void Div() {
        System.out.println("тест на деление");
        Number number1 = new Number();
        number1.setNumber(2);
        Number number2 = new Number();
        number2.setNumber(2);
        Operation oper = new Operation();
        oper.setOperator("/");
        float expResult = 1;


        Assert.assertEquals(expResult, Calculator_OOP.execute(number1,number2,oper), 0.01);
    }


    @Test
    public void Mult() {
        System.out.println("тест на умножение");
        Number number1 = new Number();
        number1.setNumber(2);
        Number number2 = new Number();
        number2.setNumber(20);
        Operation oper = new Operation();
        oper.setOperator("*");
        float expResult = 400;


        Assert.assertEquals(expResult, Calculator_OOP.execute(number1, number2, oper), 0.01);
    }


    @Test
    public void Sub() {
        System.out.println("тест на вычитание");
        Number number1 = new Number();
        number1.setNumber(2);
        Number number2 = new Number();
        number2.setNumber(20);
        Operation oper = new Operation();
        oper.setOperator("*");
        float expResult = 400;


        Assert.assertEquals(expResult, Calculator_OOP.execute(number1, number2, oper), 0.01);
    }
}
