package main.java.io.analu.Polimorfismo.bytebank_interfaces.test;

import main.java.io.analu.Polimorfismo.bytebank_interfaces.ContaCorrente;
import main.java.io.analu.Polimorfismo.bytebank_interfaces.ContaPopanca;

public class TestaContas {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(111,111);
        cc.deposita(100.0);

        ContaPopanca cp = new ContaPopanca(222,222);
        cp.deposita(100.0);

        cc.transfere(10.0, cp);
        System.out.println("CC: " + cc.getSaldo());
        System.out.println("CP: " + cp.getSaldo());
    }
}
