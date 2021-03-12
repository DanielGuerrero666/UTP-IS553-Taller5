package exercises.ex7tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import exercises.ex7.MyMath;

public class testing_ex7 {
    
    @DisplayName("Minimo")
    @ParameterizedTest()
    @CsvSource(
        {
            "1"
        }
    )
    void testingMin(Integer expectedMin){
        MyMath testMath = new MyMath();
        List<Integer> testList = new ArrayList<Integer>(List.of(1, 2, 3, 4, 5));

        assertEquals(expectedMin, testMath.min(testList));
    }

    @DisplayName("Maximo")
    @ParameterizedTest()
    @CsvSource(
        {
            "5"
        }
    )
    void testingMax(Integer expectedMax){
        MyMath testMath = new MyMath();
        List<Integer> testList = new ArrayList<Integer>(List.of(1, 2, 3, 4, 5));

        assertEquals(expectedMax, testMath.max(testList));
    }
}
