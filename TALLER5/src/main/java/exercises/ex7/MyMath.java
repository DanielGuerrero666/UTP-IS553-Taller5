package exercises.ex7;

import java.util.Collections;
import java.util.List;

public final class MyMath implements Extremos{

    @Override
    public Integer min(List a){
        Collections.sort(a);
        return (Integer) a.get(0);
    }

    @Override
    public Integer max(List a){
        Collections.sort(a);
        return (Integer) a.get((a.size()-1));
    }
    
}
