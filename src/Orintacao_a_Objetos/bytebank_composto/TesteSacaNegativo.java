package Orintacao_a_Objetos.bytebank_composto;

public class TesteSacaNegativo {
    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.deposita(100);
        conta.saque(200);

        //impossivel pois o atributo saldo esta privado(encapsulado)
        // System.out.println(conta.saldo);

        //envocar o metodo

        System.out.println(conta.getSaldo());

    }
}
