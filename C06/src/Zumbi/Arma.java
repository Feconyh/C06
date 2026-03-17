package Zumbi;

public class Arma{
    String nome;
    int poder = 5;
    int resistencia = 10;
    String descricao;

    void mostraInfoArma(){
        System.out.println(nome);
        System.out.println(poder);
        System.out.println(resistencia);
        System.out.println(descricao);
    }
}