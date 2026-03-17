package br.inatel.cdg;

public class Main {
    public static void main(String[] args) {
        Conta c1 = new Conta();

        c1.deposita(220);
        c1.sacar(100);
        System.out.println(c1.getSaldo());

        c1.cliente.setNome("Nomi");
        System.out.println(c1.cliente.getNome());
        
        c1.cliente.setCpf(9090);
        System.out.println(c1.cliente.getCpf());

    }
}
