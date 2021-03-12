package exercises.ex3tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import exercises.ex3.Estudiante;

public class testing_ex3 {

    @DisplayName("Crear objeto 'Estudiante' y verificar datos")
    @ParameterizedTest()
    @CsvSource(
        {
            "Daniel, 1004017400, 333231, daniel.noriega@utp.edu.co, UTP"
        })
    void testingEstudiante(String expectedName, String expectedCode, String expectedNumber, 
        String expectedEmail, String expectedInstitution){
            Estudiante test = new Estudiante(expectedName, expectedCode, expectedNumber,
                 expectedEmail, expectedInstitution);

        assertEquals(expectedName, test.getNombre());
        assertEquals(expectedCode, test.getcodigo());
        assertEquals(expectedNumber, test.getNumeroDeTelefono());
        assertEquals(expectedEmail, test.getCorreoElectronico());
        assertEquals(expectedInstitution, test.getInstitucion());
    }
}
