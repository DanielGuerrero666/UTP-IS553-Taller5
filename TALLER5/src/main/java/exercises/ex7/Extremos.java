/*
    Extremos, JavaSE-11, 10/03/2021 
*/

package exercises.ex7;

import java.util.List;

public interface Extremos<T>{
    T min(List<T> a);
    T max(List<T> a);
}
