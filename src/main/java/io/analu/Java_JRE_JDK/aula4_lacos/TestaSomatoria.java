package main.java.io.analu.Java_JRE_JDK.aula4_lacos;

public class TestaSomatoria {
    public static void main(String[] args) {
        int contador = 0;
        int total = 0;

        while(contador<=10){
            total += contador;
            contador++;
        }
        System.out.println(total);
    }
}
