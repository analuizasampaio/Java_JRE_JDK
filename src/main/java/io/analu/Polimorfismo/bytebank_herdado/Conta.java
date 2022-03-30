package main.java.io.analu.Polimorfismo.bytebank_herdado;

public abstract class Conta {
    protected double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    private static int total;  //static coloca o atributo da classe, não do Objeto

    //construtor
    public Conta(int agencia, int numero){
        total++;
        this.agencia = agencia;
        this.numero = numero;

        System.out.println("estou criando uma conta " + numero);
    }

    //metodo da classe
    //em um metodo estatico não podemos acessar um atributo de estancia(objeto). ex this.saldo
    public static int getTotal() {
        return Conta.total;
    }

    /**
 * saldo
 */

    //metodo getter pro saldo
    public double getSaldo(){
      return this.saldo;
    };

    //setter é a modificação

    public abstract void deposita(double valor);

    public boolean saque(double valor){
        if(this.saldo >= valor){
            this.saldo -= valor;
            return true;
        }else{
            return false;
        }
    }

    public boolean transfere( double valor, Conta destino){

        if(this.saldo >= valor){
            this.saldo -= valor;
            destino.deposita(valor);
            return true;
        }else{
            return false;
        }
    }
/**
 * numero
 */

    public int getNumero(){
      return this.numero;
    }

    public void setNumero(int numero){
        this.numero = numero;
    }

    public int getAgencia() {
        return this.agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public Cliente getTitular() {
        return this.titular;
    }
}
