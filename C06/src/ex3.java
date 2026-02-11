import java.util.Scanner;

public class ex3 {
    public static void main(String[] arg) {
        Scanner entrada = new Scanner(System.in);
        int NP1 = entrada.nextInt();
        int NP2 = entrada.nextInt();

        int NPA = (NP1+NP2)/2;

        if(NPA < 60 && NPA >= 30){
            System.out.println("nota: " + NPA);
            int NP3 = entrada.nextInt();
            int NFA = (NPA+NP3)/2;
            if(NFA >= 50){
                System.out.println("Passou");
            }else{
                System.out.println("Reprovado");
            }
        }else if(NPA >= 60){
            System.out.println("Passou!");
        }else{
            System.out.println("Reprovou");
        }

        entrada.close();

    }
}
