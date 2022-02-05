package main.java.io.analu.Orientacao_a_Objetos.bytebank;

public class CriaConta {
    public static void main(String[] args) {
        //coloca a nova conta na variavel primeiraConta do tipo Conta
        Conta primeiraConta = new Conta(); //instanciação
        primeiraConta.saldo = 200;
        System.out.println(primeiraConta.saldo);

        primeiraConta.saldo += 100;
        System.out.println(primeiraConta.saldo);

        Conta segundaConta = new Conta();
        segundaConta.saldo = 50;

        System.out.println("primeira conta tem "+ primeiraConta.saldo);
        System.out.println("segunda conta tem "+ segundaConta.saldo);

        segundaConta.agencia = 146;

        System.out.println(primeiraConta.agencia);
        System.out.println(primeiraConta.numero);

        System.out.println(segundaConta.agencia);

        segundaConta.agencia = 146;
        System.out.println("agora a segunda conta está na agencia " + segundaConta.agencia);

        if(primeiraConta == segundaConta) {
            System.out.println("mesma conta");
        } else {
            System.out.println("contas diferentes");
        }

        System.out.println(primeiraConta);
        System.out.println(segundaConta);
    }
}
