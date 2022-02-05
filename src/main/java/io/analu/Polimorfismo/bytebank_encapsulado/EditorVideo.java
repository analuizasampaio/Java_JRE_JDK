package main.java.io.analu.Polimorfismo.bytebank_encapsulado;

public class EditorVideo extends Funcionario {

    public double getBonificacao() {
        return super.getBonificacao() + 100;

    }
}
