package main.java.io.analu.Polimorfismo.bytebank_interfaces;

// não pode instanciar (criar objetos) dessa clase, pq é abstrata
public abstract class Funcionario {
    private String nome;
    private String cpf;
    // protected(pouco usado) = as informações  contidas serão públicas apenas para si e para os filhos
    private double salario;

    //metodo sem corpo, não existe implementacao
    //mas todos os filhos são obrigados a implementar o metodo
    public abstract double getBonificacao();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
