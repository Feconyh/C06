package Zumbi;

public class Zumbi {
    double vida = 10;
    String nome;

    void mostraVida(){
        System.out.println(vida);;
    }

    boolean transfereVida(Zumbi zumbiAlvo, double quantia) {
        if (this.vida > quantia) {
            this.vida -= quantia;
            zumbiAlvo.vida += quantia;
            return true;
        } else {
            System.out.println("Não posso transferir a quantidade: "
                    + quantia + " pois minha vida é: " + this.vida);
            return false;
        }
    }
}
