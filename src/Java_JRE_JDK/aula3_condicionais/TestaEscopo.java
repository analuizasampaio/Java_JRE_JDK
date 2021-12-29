package Java_JRE_JDK.aula3_condicionais;

public class TestaEscopo {
    public static void main(String[] args) {
        System.out.println("testando condicionais");

        int idade = 18;
        int quantidadePessoas = 3;
        //boolean acompanhado = quantidadePessoas >=2;


        boolean acompanhado;

        if (quantidadePessoas >= 2) {
            acompanhado = true;
        } else {
            acompanhado = false;
        }


        if (idade >= 18 && acompanhado) {
            System.out.println("Seja bem vindo");
        } else {

            System.out.println("infelizmente voce nao pode entrar");
        }
    }
}
