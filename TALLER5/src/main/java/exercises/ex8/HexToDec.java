package exercises.ex8;

public class HexToDec{
    private static String hex;
    
    public HexToDec(String hex){
        this.hex = hex;
    }

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
