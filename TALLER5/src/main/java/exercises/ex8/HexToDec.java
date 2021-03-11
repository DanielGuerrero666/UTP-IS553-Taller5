package exercises.ex8;

public class HexToDec{
    private static String hex;
    
    public HexToDec(String hex){
        this.hex = hex;
    }

    public void decimalConvert(){

        try {
            detectException(hex);
            System.out.println(Integer.parseInt(hex,16));
        } catch (HexException e) {
            System.out.println("Error: "+e.getMessage());
        }

    }

    public static void detectException(String vr) throws HexException{
        if(vr.compareToIgnoreCase("G") >= 0){
            throw new HexException("Numero hexadecimal invalido");
        }
    }
}
