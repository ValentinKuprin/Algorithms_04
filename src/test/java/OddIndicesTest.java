import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class OddIndicesTest {


    @Order(1)
    @Test
    public void OddIndicesHappyPath() {

        int[] array = new int[] {-45, 590, 234, 985, 12, 68};
        int[] expectedResult =  {590, 985, 68};

        OddIndices oddIndies = new OddIndices();
        int[] actualResult = oddIndies.OddIndices(array);
        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(2)
    @Test
    public void OddIndicesEmptyArray() {

        int[] array = new int[] {};
        int[] expectedResult =  {};

        OddIndices oddIndies = new OddIndices();
        int[] actualResult = oddIndies.OddIndices(array);
        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(3)
    @Test
    public void OddIndicesOneNumber() {

        int[] array = new int[] {-1};
        int[] expectedResult =  {};

        OddIndices oddIndies = new OddIndices();
        int[] actualResult = oddIndies.OddIndices(array);
        Assertions.assertArrayEquals(expectedResult, actualResult);
    }




}