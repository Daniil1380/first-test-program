import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    public void sum_simplePositiveExample_success() {
        //подготовительные входные данные
        int first = 5;
        int second = 5;


        //запуск самого метода
        int result = calculator.sum(first, second);


        //сверка результатов
        assertEquals(10, result);
    }

    @Test
    public void multiply_twoPositiveNumbers() {
        double a = 1000000000000000.0;
        double b = 0.0000000000000000000001;


        double result = calculator.multiply(a, b);


        System.out.println(result);
    }


}
