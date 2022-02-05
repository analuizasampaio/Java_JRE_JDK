package main.java.io.analu.Orientacao_a_Objetos.bytebank_composto;

public class TestaBanco {
    public static void main(String[] args) {
        Cliente ana = new Cliente();
        ana.nome = "Ana Luiza Sampaio";
        ana.cpf = "444.444.444-44";
        ana.profissao = "programadora";

        Conta contaDaAna = new Conta();
        contaDaAna.deposita(1000);

        //composição: associa a cliente ana a contaDaAna
        contaDaAna.titular = ana;
    }
}
