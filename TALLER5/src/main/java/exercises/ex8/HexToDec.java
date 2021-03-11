package exercises.ex8;

import java.util.Scanner;

public class HexToDec{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        try {
            System.out.print("Digite un número hexadecimal: ");
            String hex = scan.next();
            exConvert(hex.toUpperCase());
            System.out.println(Integer.parseInt(hex,16));
        } catch (HexException e) {
            System.out.println("Error: "+e.getMessage());
        }

    }

    public static void exConvert(String vr) throws HexException{
        if(vr.compareTo("G") >= 0){
            throw new HexException("Numero hexadecimal invalido");
        }
    }
}
