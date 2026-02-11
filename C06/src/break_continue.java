public class break_continue {
    public static void main(String[] args) {
        for(int i = 0; i < 10; i++){
            if(i == 2){
                continue;
            }
            if(i == 5){
                break;
            }
            System.out.println("Aqui óh " + i);
        }
        System.out.println("To laaa ja, fi");

    }

}
/*
 continue volta para o loop laá em cima.
 break sai do loop e boa.
*/
