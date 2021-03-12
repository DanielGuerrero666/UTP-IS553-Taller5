package exercises.ex3;

import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        System.out.println("\nIngrese los datos del estudiante: ");
        Scanner scan = new Scanner(System.in);
        Estudiante alumno = new Estudiante(scan.next(), scan.next(), scan.next(), scan.next(), scan.next());
        System.out.println(alumno.nombre+" "+alumno.codigo+" "+alumno.numeroDeTelefono+" "+alumno.correoElectronico+" "+alumno.institucion);

        
        EstudianteDeInformatica alumno2 = new EstudianteDeInformatica(scan.next(), scan.next(), scan.next(), scan.next(), scan.next(),
             scan.next(), scan.next());

        alumno2.agregarLenguaje();
        alumno2.verLenguajesDominados();
    }
}
