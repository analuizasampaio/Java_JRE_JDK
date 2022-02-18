package main.java.io.analu.Polimorfismo.bytebank_herdado;

public class ContaCorrente extends Conta{

    public ContaCorrente(int agencia, int conta){

        super(agencia, conta);
    }

    @Override
    public boolean saque(double valor) {
        double valorASacar = valor + 0.2;
        return super.saque(valorASacar);
    }

}
