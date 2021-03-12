package exercises.ex6tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import exercises.ex6.ListaReales;

public class testing_ex6 {

    @DisplayName("Obtener el minimo valor de la lista")
    @ParameterizedTest()
    @CsvSource(
        {
            "0"
        }
    )
    void testingObtenerMinimo(Integer expectedMinimo){
        ListaReales testList = new ListaReales();
        testList.generarListaDefault(10);

        assertEquals(expectedMinimo, testList.obtenerMinimo());
    }

    @DisplayName("Obtener el maximo valor de la lista")
    @ParameterizedTest()
    @CsvSource(
        {
            "9"
        }
    )
    void testingObtenerMaximo(Integer expectedMaximo){
        ListaReales testList = new ListaReales();
        testList.generarListaDefault(10);

        assertEquals(expectedMaximo, testList.obtenerMaximo());
    }

    @DisplayName("Obtener la media de la lista")
    @ParameterizedTest()
    @CsvSource(
        {
            "4"
        }
    )
    void testingCalcularMedia(Integer expectedMedia){
        ListaReales testList = new ListaReales();
        testList.generarListaDefault(10);
        testList.setN(10);

        assertEquals(expectedMedia, testList.calcularMedia());
    }

    @DisplayName("Obtener el promedio de la lista")
    @ParameterizedTest()
    @CsvSource(
        {
            "4"
        }
    )
    void testingCalcularPromedio(Integer expectedPromedio){
        ListaReales testList = new ListaReales();
        testList.generarListaDefault(10);
        testList.setN(10);

        assertEquals(expectedPromedio, testList.calcularPromedio());
    }

    @DisplayName("Obtener suma de elementos de la lista")
    @ParameterizedTest()
    @CsvSource(
        {
            "45"
        }
    )
    void testingCalcularSuma(Integer expectedSum){
        ListaReales testList = new ListaReales();
        testList.generarListaDefault(10);

        assertEquals(expectedSum, testList.calcularSumar());
    }
}
