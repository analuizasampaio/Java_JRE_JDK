package main.java.io.analu.Polimorfismo.bytebank_interfaces;

public class ContaPopanca extends Conta {

    public ContaPopanca(int agencia, int conta){
        super(agencia, conta);
    }

    @Override
    public void deposita(double valor) {
        super.saldo += valor;
    }

}
