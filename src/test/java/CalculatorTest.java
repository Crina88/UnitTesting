import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
     Calculator calculator;
    @BeforeAll
    public static void beforeAll(){
        System.out.println("BeforeAll is executed");
    }

    @BeforeEach
    public void setUp(){
        System.out.println("BeforeEach is executed");
        calculator = new Calculator();
    }
    @Test
    public void checkSum(){
       /* Calculator calculator = new Calculator();*/
        double result = calculator.sum(4.5,2.3);
        Assertions.assertEquals(6.8,result, "rezultat incorect");
    }
    @Test
    public void checkMultiply(){
       /*Calculator calculator = new Calculator();*/
        double result = calculator.multiply(4.0,3.00);
        Assertions.assertEquals(12.00,result);
    }


    @Test
    public void checkSubstracting(){
        int result = calculator.subtracting(10,6);
        Assertions.assertEquals(4,result,"incorect");
    }
    @Test
    public void checkDivisions(){
        double result = calculator.divisions(9,4);
        Assertions.assertEquals(2.25,result,"corect");
    }
    @Test
            public void checkRemainderDivisions(){
        double result = calculator.remainderDivisions(25,6);
        Assertions.assertEquals(1.0,result,"incorect");

    }



}
