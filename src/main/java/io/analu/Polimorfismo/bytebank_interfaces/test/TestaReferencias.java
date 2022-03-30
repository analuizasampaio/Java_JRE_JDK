package main.java.io.analu.Polimorfismo.bytebank_interfaces.test;

import main.java.io.analu.Polimorfismo.bytebank_encapsulado.ControleBonificacao;
import main.java.io.analu.Polimorfismo.bytebank_encapsulado.EditorVideo;
import main.java.io.analu.Polimorfismo.bytebank_encapsulado.Gerente;

public class TestaReferencias {
    public static void main(String[] args) {
        Gerente g1 = new Gerente();
        g1.setNome("Isabella");
        String nome = g1.getNome();
        g1.setSalario(5000.0);

//        Funcionario f = new Funcionario();
//        f.setSalario(2000.0);

        EditorVideo ev = new EditorVideo();
        ev.setSalario(2500.0);

        ControleBonificacao controle = new ControleBonificacao();
        controle.registra(g1);
//        controle.registra(f);
        controle.registra(ev);

        System.out.println(controle.getSoma());

    }
}
