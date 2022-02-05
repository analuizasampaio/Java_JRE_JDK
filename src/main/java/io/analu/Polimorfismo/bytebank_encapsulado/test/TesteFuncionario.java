package main.java.io.analu.Polimorfismo.bytebank_encapsulado.test;

import main.java.io.analu.Polimorfismo.bytebank_encapsulado.Funcionario;

public class TesteFuncionario {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.setNome("Carlos Perreira");
        funcionario.setCpf("123456789/82");
        funcionario.setSalario(2589.3);

        System.out.println(funcionario.getBonificacao());
    }
}
