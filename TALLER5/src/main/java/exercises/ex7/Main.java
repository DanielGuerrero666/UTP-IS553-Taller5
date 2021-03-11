package exercises.ex7;

import java.util.ArrayList;
import java.util.List;

public class Main{
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<Integer>(List.of(4, 5, 6, 7, 2, 3, 1, 4));
        MyMath Matematicas = new MyMath();

        System.out.println(Matematicas.min(a)); 
        System.out.println(Matematicas.max(a)); 

    }
}
