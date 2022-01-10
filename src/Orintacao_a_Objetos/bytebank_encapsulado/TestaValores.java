package Orintacao_a_Objetos.bytebank_encapsulado;

public class TestaValores {
    public static void main(String[] args) {
        Conta conta = new Conta(01110, 4002);
        Conta conta2 = new Conta(01110, 148756);
        Conta conta3 = new Conta(01110, 32659);

        System.out.println(Conta.getTotal());

    }
}
