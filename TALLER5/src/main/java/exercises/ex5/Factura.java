/*
    Factura, JavaSE-11, 09/03/2021 
*/
package exercises.ex5;

import java.util.Scanner;

public class Factura extends Precio{
    private static String emisor;
    private static String cliente;

    // Constructor

    public Factura(String emisor, String cliente) {
        this.setEmisor(emisor);
        this.setCliente(cliente);
    }

    // Setters & Getters

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        Factura.cliente = cliente;
    }

    public String getEmisor() {
        return emisor;
    }

    public void setEmisor(String emisor) {
        Factura.emisor = emisor;
    }

    // Métodos
    
    public static void imprimirFactura(){
        Scanner scan = new Scanner(System.in);
        System.out.println("\nIngrese el precio del producto: ");
        Precio x = new Precio();
        x.setPesos(scan.nextDouble());

        System.out.println(" \n======FACTURA=====");
        System.out.println("Emisor de la factura: "+emisor);
        System.out.println("Cliente facturado: "+cliente);
        System.out.println("Precio total: "+x.getPesos()+" Pesos");
    }
}
