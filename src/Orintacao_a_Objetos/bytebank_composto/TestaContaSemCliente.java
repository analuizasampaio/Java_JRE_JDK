package Orintacao_a_Objetos.bytebank_composto;

public class TestaContaSemCliente {
    public static void main(String[] args) {
        Conta contaDoPedro = new Conta();

        //System.out.println(contaDoPedro.saldo);
        System.out.println(contaDoPedro.getSaldo());

        //contaDoPedro.titular.nome = "Pedro";

        //Essa linha deu erro pq tentamos acessar um dado de uma referencia inexistente.
        //não tem cliente atribuido a contaDoPedro
        // Erro: Exception in thread "main" java.lang.NullPointerException
        //System.out.println(contaDoPedro.titular.nome);

        contaDoPedro.titular = new Cliente();
        contaDoPedro.titular.nome = "Pedro";

        System.out.println(contaDoPedro.titular.nome);
    }
}
