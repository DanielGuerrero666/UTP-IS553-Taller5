// LibretaDeDirecciones, JavaSE-11, 05/03/2021 //

package exercises.ex2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import exercises.ex1.RegistroLibreta;

public class LibretaDeDirecciones{
    private static List<RegistroLibreta> libreta = new ArrayList<>();
    private Integer indexEntrada = 0;

    public static void main(String[] args) {
        añadirEntrada();
    }

    // Métodos

    public static void añadirEntrada(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Complete la informacion del registro de la siguiente forma,"+
             "'Nombre', 'Dirección', 'Número de telefono', 'Correo electronico'");

        RegistroLibreta entrada = new RegistroLibreta(scan.next(), scan.next(), scan.next(), scan.next());
        libreta.add(entrada);
        scan.close();
    }

    public static void borrarEntrada(){
        Scanner scan = new Scanner(System.in);
        var index = scan.nextInt();
        
        if(index >= 0 && index < libreta.size()){
            libreta.remove(index);
        }
        else{
            System.out.println("Error: index_out_of_limits");
        }
        scan.close();
    }

    public static void verTodasLasEntradas(){
        for(int i=0;i<libreta.size();i++) {
            System.out.println("|| "+libreta[i].getNombre()+" || "+libreta[i].getDireccion()+" || "+libreta[i].getNumeroDeTelefono()+" || "+
                libreta[i].getCorreoElectronico());
        }
    }

}



