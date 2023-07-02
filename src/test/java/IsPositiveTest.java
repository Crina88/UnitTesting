import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class IsPositiveTest {


    @Test

    public void checkIsPositiveTrue(){
       IsPositive number = new IsPositive();
       boolean result = number.isPositive(3.5);
       Assertions.assertTrue(result);


   }
   @Disabled
    @Test

    public void checkIsPositiveFalse() {
        IsPositive number = new IsPositive();
        boolean result = number.isPositive(-4.7);
        Assertions.assertFalse(result,"ai dat-o in bara");
    }
    @ParameterizedTest
    @ValueSource(doubles = {1.5,4.6,8.9,Double.MAX_VALUE})
    public void checkIsPositiveParametrized(double numberFromValues){
        IsPositive numberToCheck = new IsPositive();
        boolean result = numberToCheck.isPositive(numberFromValues);
        Assertions.assertTrue(result);
    }

    //tema ex 1

    @ParameterizedTest
    @ValueSource (ints = {-6,-4,-6,Integer.MIN_VALUE})
    public void checkIsNegativeParametrizet(int numberFromValues){
     IsNegative number = new IsNegative();
     boolean result = number.isNegative(numberFromValues);
     Assertions.assertTrue(result);
    }



    }
