package exercises.ex4;

public class Main{
    public static void main(String[] args) {
        PairOfDice luckys = new PairOfDice();

        luckys.roll();
        System.out.println("Resultado: "+luckys.getDice1()+" y "+luckys.getDice2());
    }
}
