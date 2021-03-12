package exercises.ex1tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import exercises.ex1.RegistroLibreta;

public class testing_ex1{

    @DisplayName("Crear objeto 'RegistroLibreta' y verificar datos")
    @ParameterizedTest()
    @CsvSource(
        {
            "Daniel, Alamos, 333231, daniel.noriega@utp.edu.co"
        })
    void testingRegistroLibreta(String expectedName, String expectedDirection, String expectedNumber, 
        String expectedEmail){
        RegistroLibreta test = new RegistroLibreta(expectedName, expectedDirection, expectedNumber,
             expectedEmail);
             
        assertEquals(expectedName, test.getNombre());
        assertEquals(expectedDirection, test.getDireccion());
        assertEquals(expectedNumber, test.getNumeroDeTelefono());
        assertEquals(expectedEmail, test.getCorreoElectronico());
    }
}