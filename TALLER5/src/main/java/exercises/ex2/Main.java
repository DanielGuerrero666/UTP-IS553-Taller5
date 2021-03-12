package exercises.ex2;

public class Main {
    public static void main(String[] args) {
        LibretaDeDirecciones lista = new LibretaDeDirecciones();
        Integer index =0;
        lista.añadirEntrada();
        lista.borrarEntrada(index);
        lista.verTodasLasEntradas();
        lista.actualizacionDeUnaEntrada(index);
    }
}
