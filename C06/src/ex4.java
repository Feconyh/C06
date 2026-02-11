import java.util.Scanner;

public class ex4 {
    public static void main(String[] arg) {
        int numAluno;
        Scanner entrada = new Scanner(System.in);
        numAluno = entrada.nextInt();
        entrada.close();

        switch (numAluno) {
            case 10,15:
            case 20:
                System.out.println("Sala I-16");
                break;
            case 30:
                System.out.println("Sala I-22");
                break;
            default:
                System.out.println("Sei la, karai");
        }
    }
}
