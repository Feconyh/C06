import java.util.Scanner;

public class ex1_2 {
    public static void main(String[] args) {
        int lanche = 0;
        Scanner entrada = new Scanner(System.in);
        for(int i = 0; i <= 2; i++) {
            int numero = entrada.nextInt();
            lanche += numero;
        }
        entrada.close();
        float media = (float)lanche/3;

        System.out.println("Consumido: " + lanche);
        System.out.println("Media: " + media);

    }
}

