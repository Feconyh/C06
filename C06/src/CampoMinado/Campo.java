package CampoMinado;

public class Campo {
    int[][] campo = new int[2][2];
    Bomba bombas;

    public Campo(){
        bombas = new Bomba();
    }

    void grade() {
        campo[bombas.x][bombas.y] = 1;
        System.out.println(bombas.x+" "+bombas.y);
    }
}