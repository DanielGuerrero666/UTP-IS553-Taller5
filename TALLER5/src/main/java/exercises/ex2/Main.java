package exercises.ex2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        LibretaDeDirecciones lista = new LibretaDeDirecciones();
        lista.añadirEntrada();
        System.out.println("Indique la posicion en la lista que desea eliminar: ");
        lista.borrarEntrada(scan.nextInt());
        lista.verTodasLasEntradas();
        System.out.println("Indique la posicion en la lista que desea actualizar:" );
        lista.actualizacionDeUnaEntrada(scan.nextInt());
        scan.close();
    }
}
