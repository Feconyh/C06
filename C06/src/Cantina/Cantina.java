package Cantina;

public class Cantina {
    String nome;
    Salgado[] salgados = new Salgado[10];

    void addSalgado(Salgado novoSalgado){

        for(int i = 0; i < 10; i++){
            if(salgados[i] == null){
                salgados[i] = novoSalgado;
                break;
            }
        }

    }
    void mostraInfo(){
        for(Salgado sl : salgados){
            if(sl != null){
                System.out.println(sl.nome);
            }
        }
    }
}
