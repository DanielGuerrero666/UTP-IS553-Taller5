/*
    testing_ex8, JavaSE-11, 11/03/2021, JUnit4
*/

package exercises.ex8tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import exercises.ex8.HexToDec;

public class testing_ex8 {
    
    @DisplayName("Fail_Test: Atrapando 'HexEception'")
    @ParameterizedTest()
    @CsvSource(
        {
            "Error: Numero hexadecimal invalido, g",
            "Error: Numero hexadecimal invalido, l", 
            "Error: Numero hexadecimal invalido, r" 
        }
    )
    void testingDetectException(String expectedMsg, String invalidValue){
        HexToDec testInvalidHex = new HexToDec(invalidValue);

        assertEquals(expectedMsg, testInvalidHex.decimalConvert());
    }
}
