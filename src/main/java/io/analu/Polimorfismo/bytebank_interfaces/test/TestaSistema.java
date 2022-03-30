package main.java.io.analu.Polimorfismo.bytebank_interfaces.test;

import main.java.io.analu.Polimorfismo.bytebank_interfaces.Administrador;
import main.java.io.analu.Polimorfismo.bytebank_interfaces.Gerente;
import main.java.io.analu.Polimorfismo.bytebank_interfaces.SistemaInterno;

public class TestaSistema {
    public static void main(String[] args) {
        Gerente g = new Gerente();
        g.setSenha(2222);

        Administrador adm = new Administrador();
        adm.setSenha(3333);

        SistemaInterno si = new SistemaInterno();
        si.autentica(g);
    }
}
