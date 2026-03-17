package Mario;

public class MainMario {
    public static void main(String[] args) {
        Piloto p1 = new Piloto();
        Kart k1 = new Kart();

        Piloto p2 = new Piloto();
        Kart k2 = new Kart();

        k1.piloto = p1;
        k2.piloto = p2;

        k1.motor.cilindradas = "100";
        k1.motor.velocidadeMaxima = 150;
    }
}
