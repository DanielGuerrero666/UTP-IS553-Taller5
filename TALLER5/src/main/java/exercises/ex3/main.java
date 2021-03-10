package exercises.ex3;

import java.util.Scanner;
import exercises.ex3.Estudiante;

public class main {
    public static void main(String[] args){

        System.out.println("\nIngrese los datos del estudiante: ");
        Scanner scan = new Scanner(System.in);
        Estudiante alumno = new Estudiante(scan.next(), scan.next(), scan.next(), scan.next(), scan.next());
        System.out.println(alumno.nombre+" "+alumno.codigo+" "+alumno.numeroDeTelefono+" "+alumno.correoElectronico+" "+alumno.institucion);
    }
}
