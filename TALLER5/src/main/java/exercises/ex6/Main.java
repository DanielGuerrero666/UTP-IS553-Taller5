package exercises.ex6;

public class Main {
    public static void main(String[] args) {
        ListaReales datos = new ListaReales();
        datos.añadirNumeros();
        System.out.println(datos.obtenerMinimo());
        System.out.println(datos.obtenerMaximo());
        System.out.println(datos.calcularMedia());
        System.out.println(datos.calcularPromedio());
        System.out.println(datos.calcularSumar());
    }
}
