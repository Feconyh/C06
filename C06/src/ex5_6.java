import java.util.Scanner;
import java.util.Random;

public class ex5_6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Random rand = new Random();
        int x;
        int y;
        for(int i = 0; i < 10; i++){
            x = rand.nextInt(4)-1;
            System.out.println(x);
        }
        /*
        do{
            x = rand.nextInt(10)+1;
            System.out.println("Qual o numero gerado?");
            y = entrada.nextInt();
            if(y < x){
                System.out.println("Você disse um numero menor");
            }else{
                System.out.println("Você disse um numero maior");
            }
            continue;
        }while(y != x);
        System.out.println("Ganhou");
         */
    }
}
