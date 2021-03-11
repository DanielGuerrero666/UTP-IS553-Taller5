package exercises.ex9;

public class DiamondGenerator {
    private static Integer n;

    public DiamondGenerator(Integer n){
        this.n = n;
    }

    public static void generator(){

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
        } catch (DiamondException e) {
            System.out.println("Error: "+e.getMessage()); 
        }
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
