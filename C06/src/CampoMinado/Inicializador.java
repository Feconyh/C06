package CampoMinado;

import java.util.Scanner;

public class Inicializador {
    Campo campo;
    public Inicializador(){ campo = new Campo();}

    void start(){
        campo.grade();

        int x,y;
        while(true){
            Scanner input = new Scanner(System.in);
            x = input.nextInt();
            y = input.nextInt();
            if(campo.campo[x][y] == 1){
                input.close();
                System.out.println("BOOM");
                break;
            }
        }
    }
}
