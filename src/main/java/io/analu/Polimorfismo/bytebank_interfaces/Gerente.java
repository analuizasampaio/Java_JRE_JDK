package main.java.io.analu.Polimorfismo.bytebank_interfaces;


//Gerente é um Funcionário, Gerente herda da classe Funcionário
public class Gerente extends Funcionario {

    private int senha;

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public boolean autentica(int senha) {
        if(this.senha == senha) {
            return true;
        } else {
            return false;
        }
    }

    //this significa q o atributo está definido na class
    //.super significa q o atributo vem da classe "mãe"

    //getBonificação foi sobrescrita:
    //redefinimos um comportamento previsto na classe mãe através da classe filha
    public double getBonificacao() {
        return super.getSalario();
    }

}
