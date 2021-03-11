package exercises.ex8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese un numero hexadecimal valido: ");        
        HexToDec hexadecimal = new HexToDec(scan.next());
        hexadecimal.decimalConvert();
    }
}
