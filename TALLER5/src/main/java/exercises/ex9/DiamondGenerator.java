/*
    DiamonGenerator, JavaSE-11, 10/03/2021 
*/

package exercises.ex9;

public class DiamondGenerator {
    private static Integer n;

    // Constructor

    public DiamondGenerator(Integer n){
        DiamondGenerator.n = n;
    }

    // Métodos

    public String generator(){
        String result="";

        try {
            detectException(n);

            for(int i = 1; i <= n; i++){
                espaciado(n - i);
                asteriscos(2*i);
                System.out.println();
            }
        
            for(int i = 1; i < n; i++){
                espaciado(i);
                asteriscos(2*n - 2*i);
                System.out.println();
            }
            result="";
        } catch (DiamondException e) {
            result = "Error: "+e.getMessage();
        }
        return result;
    }
    
    public static void espaciado(Integer limit){
        for(int i=0;i<=limit;i++){
            System.out.print(" ");
        }
    }

    public static void asteriscos(Integer limit){
        for(int i=1;i<limit;i++){
            System.out.print("*");
        }
    }

    public static void detectException(Integer vr) throws DiamondException{
        if(vr<0){
            throw new DiamondException("Numero invalido");
        }
    }


}
