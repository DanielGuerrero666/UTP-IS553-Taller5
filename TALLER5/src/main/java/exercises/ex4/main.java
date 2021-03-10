package exercises.ex4;

public class main {
    public static void main(String[] args) {
        PairOfDice luckys = new PairOfDice();

        luckys.roll();
        System.out.println("Resultado: "+luckys.getDice1()+" y "+luckys.getDice2());
    }
}
