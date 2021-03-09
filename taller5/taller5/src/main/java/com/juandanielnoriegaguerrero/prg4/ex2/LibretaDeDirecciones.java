// LibretaDeDirecciones, JavaSE-11, 05/03/2021 //

package com.juandanielnoriegaguerrero.prg4.ex2;

import java.util.Scanner;
import com.juandanielnoriegaguerrero.prg4.ex1.RegistroLibreta;

public class LibretaDeDirecciones{
    private RegistroLibreta[] libreta = new RegistroLibreta[100];
    private Integer indexEntrada = 0;

    public RegistroLibreta[] getLibreta() {
        return libreta;
    }

    public void setLibreta(RegistroLibreta[] libreta) {
        this.libreta = libreta;
    }

    public static void añadirEntrada(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Complete la informacion del registro de la siguiente forma,"+
             "'Nombre' 'Dirección' 'Número de telefono' 'Correo electronico'");
        RegistroLibreta entrada = new RegistroLibreta(scan.next(), scan.next(), scan.next(), scan.next());
    }


}
