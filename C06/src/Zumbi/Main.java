package Zumbi;

public class Main {
    public static void main(String[] args) {
        Zumbi z1 = new Zumbi();
        Zumbi z2 = new Zumbi();
        Personagem p1 = new Personagem();


        z1.transfereVida(z2,4);
        z1.mostraVida();
    }
}
