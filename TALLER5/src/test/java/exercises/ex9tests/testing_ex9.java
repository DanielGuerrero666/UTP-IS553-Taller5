package exercises.ex9tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import exercises.ex9.DiamondGenerator;

public class testing_ex9{
    
    @DisplayName("Fail_Test: Atrapando 'DiamondException'")
    @ParameterizedTest()
    @CsvSource(
        {
            "Error: Numero invalido, -1",
            "Error: Numero invalido, -10", 
            "Error: Numero invalido, -234" 
        }
    )
    void testingDetectException(String expectedMsg, Integer invalidValue){
        DiamondGenerator testInvalidDiamnodLines = new DiamondGenerator(invalidValue);

        assertEquals(expectedMsg, testInvalidDiamnodLines.generator());
    }
}
