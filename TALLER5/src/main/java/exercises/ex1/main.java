package exercises.ex1;

public class main{
    public static void main(String[] args) {
        RegistroLibreta liber = new RegistroLibreta("Juan", "direccion", "numeroDeTelefono", "correoElectronico");
        System.out.println(liber.getNombre());
    }
}