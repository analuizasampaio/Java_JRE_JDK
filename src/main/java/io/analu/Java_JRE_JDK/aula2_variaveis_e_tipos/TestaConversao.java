package main.java.io.analu.Java_JRE_JDK.aula2_variaveis_e_tipos;

public class TestaConversao {
    public static void main (String[] args){
        double salario = 1270.85;
        int valor = (int) salario;

        System.out.println(valor);

        //int 32 bit max dois bilhoes

        //long: 64bit tem que colocar o L no final
        long numeroGrande = 32432423523L;

        //short: 16bit
        short valorPequeno = 2131;

        //byte: 1byte
        byte b = 127;

        //float 32bit
        float pontoFlutuante = 3.14f;


    }
}
