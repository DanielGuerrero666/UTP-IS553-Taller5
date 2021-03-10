// Estadisticas, JavaSE-11, 10/03/2021 
package exercises.ex6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ListaReales implements Estadisticas{
    private static List<Integer> listaDeNumReales = new ArrayList<>();
    private static Integer n;  // Total de elementos de la lista.

    // Métodos

    public static void añadirNumeros(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese un total de datos: ");
        n = scan.nextInt();

        for(int i=0;i<n;i++){
            System.out.print("Digite un numero para la lista: ");
            listaDeNumReales.add(scan.nextInt());
        }
    }


    @Override
    public Integer obtenerMinimo(){
        Collections.sort(listaDeNumReales);
        return listaDeNumReales.get(0);
    }

    @Override
    public Integer obtenerMaximo(){
        Collections.sort(listaDeNumReales);
        return listaDeNumReales.get(listaDeNumReales.size() - 1);
    }

    @Override
    public Integer calcularMedia(){
        Integer media=0;
        for(Integer num : listaDeNumReales){
            media+=num;
        }
        return (media/n);
    }

    @Override
    public Integer calcularPromedio(){
        Integer promedio=0;
        for(Integer num : listaDeNumReales){
            promedio+=num;
        }
        return (promedio/n);
    }

    @Override
    public Integer calcularSumar() {
        Integer Sum=0;
        for(Integer num : listaDeNumReales){
            Sum+=num;
        }
        return (Sum);
    }
}
