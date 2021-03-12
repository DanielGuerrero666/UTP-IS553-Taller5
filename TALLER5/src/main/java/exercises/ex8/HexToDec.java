/*
    HexToDec, JavaSE-11, 10/03/2021 
*/

package exercises.ex8;

public class HexToDec{
    private static String hex;
    
    // Constructor

    public HexToDec(String hex){
        HexToDec.hex = hex;
    }

    // Métodos

    public String decimalConvert(){
        String result="";

        try {
            detectException(hex);
            result = Integer.toString(Integer.parseInt(hex,16));
        } catch (HexException e) {
            result = "Error: "+e.getMessage();
        }
        return result;

    }

    public static void detectException(String vr) throws HexException{
        if(vr.compareToIgnoreCase("G") >= 0){
            throw new HexException("Numero hexadecimal invalido");
        }
    }
}
