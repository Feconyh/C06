package Cantina;

public class Main {
    public static void main(String[] args) {
        Cantina c1 = new Cantina();
        Salgado s1 = new Salgado();
        Salgado s2 = new Salgado();

        c1.nome = "Cantina.Cantina do Inatel";
        s1.nome = "pastel";
        c1.addSalgado(s1);

        s2.nome = "pizza";
        c1.addSalgado(s2);

        c1.mostraInfo();

    }
}