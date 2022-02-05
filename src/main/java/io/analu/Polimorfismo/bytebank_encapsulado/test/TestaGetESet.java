package main.java.io.analu.Polimorfismo.bytebank_encapsulado.test;

import main.java.io.analu.Polimorfismo.bytebank_encapsulado.Cliente;
import main.java.io.analu.Polimorfismo.bytebank_encapsulado.Conta;

public class TestaGetESet {
    public static void main(String[] args) {
        Conta conta = new Conta(1337,010204);

        //conta.numero= 1337
        conta.setNumero(1337);

        System.out.println(conta.getNumero());

        Cliente ana = new Cliente();
        //conta.titular = ana;
        ana.setNome("Ana Luiza Sampaio");

        conta.setTitular(ana);

        System.out.println(conta.getTitular().getNome());

    }
}
