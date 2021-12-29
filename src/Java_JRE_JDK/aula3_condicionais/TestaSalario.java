package Java_JRE_JDK.aula3_condicionais;

public class TestaSalario {
    public static void main(String[] args) {

        boolean foiPromovido = true;
        double salario;

        if(foiPromovido) {
             salario = 4200.0;
        } else {
            salario = 3800.0;
        }

        System.out.println(salario);
    }

}
