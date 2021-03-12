/*
    MyMath, JavaSE-11, 10/03/2021 
*/

package exercises.ex7;

import java.util.Collections;
import java.util.List;

public final class MyMath implements Extremos<Integer>{

    // Métodos(Interfaz)
    
    @Override
    public Integer min(List<Integer> a){
        Collections.sort(a);
        return a.get(0);
    }

    @Override
    public Integer max(List<Integer> a){
        Collections.sort(a);
        return a.get((a.size()-1));
    }
    
}
