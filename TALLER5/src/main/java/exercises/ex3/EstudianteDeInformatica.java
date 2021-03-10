// EstudianteDeInformatica, JavaSE-11, 09/03/2021 

package exercises.ex3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EstudianteDeInformatica extends Estudiante{
    private static List<String> lenguajesDominados = new ArrayList<>();
    private String modeloDeComputador;
    private String especializacion;

    public EstudianteDeInformatica(String nombre, String codigo, String numeroDeTelefono, String correoElectronico, String institucion, 
        String modeloDeComputador, String especializacion){

            super(nombre, codigo, numeroDeTelefono, correoElectronico, institucion);
            setModeloDeComputador(modeloDeComputador);
            setEspecializacion(especializacion);
        }

    //Setters & Getters

    public void setModeloDeComputador(String modeloDeComputador){
        this.modeloDeComputador = modeloDeComputador;
    }

    public String getModeloDeComputador(){
        return modeloDeComputador;
    }

    public void setEspecializacion(String especializacion){
        this.especializacion = especializacion;
    }

    public String getEspecializacion(){
        return especializacion;
    }

    // Métodos

    public static void agregarLenguaje(){
        Scanner scan = new Scanner(System.in);
        String lenguaje = scan.next();
        lenguajesDominados.add(lenguaje);
    }

    public static void verLenguajesDominados(){
        for(String lenguaje : lenguajesDominados){
            System.out.println(lenguaje);
        }
    }

    
}