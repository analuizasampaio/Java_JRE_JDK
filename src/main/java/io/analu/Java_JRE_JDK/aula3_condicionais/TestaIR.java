package main.java.io.analu.Java_JRE_JDK.aula3_condicionais;

public class TestaIR {
    public static void main(String[] args) {
        double salario = 300.00;

        if(salario < 2600.0) {
            System.out.println("A sua aliquota é de 15%");
            System.out.println("Você pode deduzir R$ 350");
        }

        if(salario < 3750.0) {
            System.out.println("A sua aliquota é de 22,5%");
            System.out.println("Você pode deduzir R$ 636");
        }
    }
}
