package main.java.io.analu.Java_JRE_JDK.aula2_variaveis_e_tipos;

public class TestaCaracteres {

    public static void main(String[] args){

        //char guarda um único caractere de 16bits

        char letra = 'a';
        System.out.println(letra);

        // char é uma variável do tipo numérico equivalente àquele short
        // mas ele contém apenas valores positivos

        char valor = 66;
        System.out.println(valor);

         valor = (char) (valor + 1);
        System.out.println(valor);

        String palavra = "analu vai ser foda em Java!!!";
        System.out.println(palavra);


    }

}
