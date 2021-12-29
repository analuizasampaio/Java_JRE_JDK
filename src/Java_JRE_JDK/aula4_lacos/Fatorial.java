package Java_JRE_JDK.aula4_lacos;

public class Fatorial {
    public static void main(String[] args) {

        int fatorial = 1;

        for (int i = 1; i<=10; i++){
            fatorial = fatorial * i;
            System.out.println("fatoria de "+ i + "! = " + fatorial);

        }

    }
}
