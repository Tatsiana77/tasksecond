import by.epam.task01.entity.CustomArray;
import by.epam.task01.exception.CustomArrayException;
import by.epam.task01.service.CustomArrayService;
import by.epam.task01.service.impl.CustomArrayServiceImpl;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertThrows;

public class TestCustomArrayService {
    private final CustomArrayService service = new CustomArrayServiceImpl();
    CustomArray lineArray;
    CustomArray emptyArray;
    CustomArray nullArray;
    CustomArray equalPositiveArray;
    CustomArray equalNegativeArray;


    @BeforeMethod
    public void setUp() {
        lineArray = new CustomArray(-5, 7, 8, 3, 5, 9, -8, -7, 0, 10);
        emptyArray = new CustomArray();
        equalPositiveArray = new CustomArray(9,9,9,9,9,9,9,9,9,9,9,9);
        equalNegativeArray = new CustomArray(-9,-9,-9,-9,-9,-9,-9,-9,-9,-9,-9,-9);
    }


    @Test
    void sumOfArrayElementsTest() throws CustomArrayException {
        long actualSum = service.sumOfElements(lineArray);
        long expectedSum = 22;
        assertEquals(actualSum, expectedSum);
    }

    @Test
    void sumOfEmptyArrayElementsTest() throws CustomArrayException {
        long actualSum = service.sumOfElements(emptyArray);
        long expectedSum = 0;
        assertEquals(actualSum, expectedSum);
    }

    @Test
    void sumOfNullArrayElementsTest() throws CustomArrayException {
        long actualSum = service.sumOfElements(nullArray);
        long expectedSum = 0;
        assertEquals(actualSum, expectedSum);
    }


    @Test
    void minNumOfArrayTest() throws CustomArrayException {
        int actualMin = service.findMin(lineArray);
        int expectedMin = -8;
        assertEquals(actualMin, expectedMin);
    }

    @Test
    void minNumbOfPositiveArrayTest() throws CustomArrayException {
        int actualMin = service.findMin(equalPositiveArray);
        int expectedMin = 9;
        assertEquals(actualMin, expectedMin);
    }

    @Test
    void minNumOfNegativeArrayTest() throws CustomArrayException {
        int actualMin = service.findMin(equalNegativeArray);
        int expectedMin = -9;
        assertEquals(actualMin, expectedMin);
    }

    @Test
    void minNumOfEmptyArrayTest() {
        assertThrows(CustomArrayException.class, () -> service.findMin(emptyArray));
    }

    @Test
    void minNumOfNullArrayTest() {
        assertThrows(CustomArrayException.class, () -> service.findMin(nullArray));
    }

    @Test
    void maxNumOfLineArrayTest() throws CustomArrayException {
        int actualMax = service.findMax(lineArray);
        int expectedMax = 10;
        assertEquals(actualMax, expectedMax);
    }

    @Test
    void maxNumOfPositiveArrayTest() throws CustomArrayException {
        int actualMax = service.findMax(equalPositiveArray);
        int expectedMax = 9;
        assertEquals(actualMax, expectedMax);
    }

    @Test
    void maxNumOflNegativeArrayTest() throws CustomArrayException {
        int actualMax = service.findMax(equalNegativeArray);
        int expectedMax = -9;
        assertEquals(actualMax, expectedMax);
    }

    @Test
    void maxNumOfEmptyArrayTest() {
        assertThrows(CustomArrayException.class, () -> service.findMax(emptyArray));
    }

    @Test
    void maxNumberOfNullArrayTest() {
        assertThrows(CustomArrayException.class, () -> service.findMax(nullArray));
    }


}
