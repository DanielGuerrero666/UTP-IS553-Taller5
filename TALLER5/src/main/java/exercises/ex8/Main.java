package exercises.ex8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Ingrese un numero hexadecimal valido: ");        
        HexToDec hexadecimal = new HexToDec(scan.next());
        System.out.println(hexadecimal.decimalConvert()); 
        scan.close();
    }
}
