package exercises.ex9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Ingrese el numero de lineas del diamante: ");
        DiamondGenerator diamante = new DiamondGenerator(scan.nextInt());
        System.out.println(diamante.generator());;
    }
}
