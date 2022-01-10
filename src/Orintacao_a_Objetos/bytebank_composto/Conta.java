package Orintacao_a_Objetos.bytebank_composto;

public class Conta {
    private double saldo;
    int agencia;
    int numero;
    Cliente titular;


    //metodo getter pro saldo
    public double getSaldo(){
      return this.saldo;
    };

    //setter é a modificação

    public void deposita(double valor){
        //this referencia da conta q foi invocada
        this.saldo += valor;
    }

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
}
