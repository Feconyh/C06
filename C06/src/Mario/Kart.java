package Mario;

public class Kart {
    String nome;
    Piloto piloto;
    Motor motor;

    public Kart(){
        motor = new Motor();
    }

    void pular(){
        System.out.println("Pulo");
    }
    void soltarTurbo(){
        System.out.println("Turbo");
    }
    void fazerDrift(){
        System.out.println("Drift");
    }

}
