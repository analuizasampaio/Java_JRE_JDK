package main.java.io.analu.Orientacao_a_Objetos.bytebank;

public class TestaMetodo {
    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.saldo = 100;
        conta.deposita(12);

        System.out.println(conta.saldo);

        boolean retorno = conta.saque(20);
        if(!retorno){
            System.out.println("saldo insuficiente");
            System.out.println("Saldo atual: R$"+conta.saldo);
        }else{
            System.out.println("Transferencia realizada");
            System.out.println("Saldo atual: R$"+conta.saldo);
        }

        Conta outraConta = new Conta();
        outraConta.deposita(1000);

        outraConta.transfere(300, conta);
        System.out.println(outraConta.saldo);

        System.out.println(conta.saldo);

    }
}
