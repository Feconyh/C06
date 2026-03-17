package CampoMinado;

import java.util.Random;

public class Bomba {
    Random rand = new Random();

    int bomba_pos(int range){
        return rand.nextInt(range);
    }
    int x = bomba_pos(2);
    int y = bomba_pos(2);
}