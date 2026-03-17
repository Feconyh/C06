package br.inatel.cdg;

public class Conta {
    private int numero;
    private float saldo;
    private float limite;

    Cliente cliente = new Cliente();

    public Conta() {
        cliente = new Cliente();
    }

    public float getSaldo() {
        return this.saldo;
    }

    public void sacar(float quantia) {
        if (this.saldo > quantia) {
            this.saldo -= quantia;
        }
    }

    public void deposita(float quantia) {
        this.saldo += quantia;
    }
}
