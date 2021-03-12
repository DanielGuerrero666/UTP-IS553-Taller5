/*
    LibretaDeDirecciones, JavaSE-11, 08/03/2021
*/
package exercises.ex2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import exercises.ex1.RegistroLibreta;

public class LibretaDeDirecciones{
    private static List<RegistroLibreta> libreta = new ArrayList<>();

    // Métodos

    public void añadirEntrada(){
        Scanner scan = new Scanner(System.in);

        System.out.println("\nComplete la informacion del registro de la siguiente forma "+
             "|| Nombre || Dirección || Número de telefono || Correo electronico ||");

        RegistroLibreta entrada = new RegistroLibreta(scan.next(), scan.next(), scan.next(), scan.next());
        libreta.add(entrada);
    }

    public void borrarEntrada(int index){        
        if(index >= 0 && index < libreta.size()){
            libreta.remove(index);
        }
        else{
            System.out.println("Error: index_out_of_limits");
        }
    }

    public void verTodasLasEntradas(){
        for(RegistroLibreta aux : libreta) {
            System.out.println("|| "+aux.getNombre()+" || "+aux.getDireccion()+" || "+aux.getNumeroDeTelefono()+" || "+
                aux.getCorreoElectronico()+" || ");
        }
    }

    public void actualizacionDeUnaEntrada(int index){      
        RegistroLibreta aux;

        Scanner scan = new Scanner(System.in);
        System.out.println("Que dato desea actualizar: ");
        System.out.println("1) Nombre ");
        System.out.println("2) Direccion ");
        System.out.println("3) Numero telefonico ");
        System.out.println("4) e-mail \n");
        int op = scan.nextInt();


        switch(op){
        case 1:
            System.out.println("\nIngrese un nuevo nombre");
            aux = libreta.get(index);
            aux.setNombre(scan.next());
            libreta.set(index, aux);
            break;
        case 2:
            System.out.println("\nIngrese una nueva direccion");
            aux = libreta.get(index);
            aux.setDireccion(scan.next());
            libreta.set(index, aux);
            break;
        case 3:
            System.out.println("\nIngrese un nuevo numero de telefono");
            aux = libreta.get(index);
            aux.setNumeroDeTelefono(scan.next());
            libreta.set(index, aux);
            break;
        case 4:
            System.out.println("\nIngrese un nuevo correo electronico");
            aux = libreta.get(index);
            aux.setCorreoElectronico(scan.next());
            libreta.set(index, aux);
            break;
        default:
            System.out.println("\nOpcion no valida");
            actualizacionDeUnaEntrada(index);
            break;
        }
    }
}



