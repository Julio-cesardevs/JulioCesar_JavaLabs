package ex1_conta;

public class Conta {
    // variavel da classe Conta
    double saldo = 10.0;

    public void sacar(double valor) {
        // variavel  do método
        double novoSaldo = saldo - valor;
    }

    public void imprimirSaldo(){
        // disponível em toda classe
        System.out.println(saldo);
        // somente o método sacar conhece  esta variavel
        System.out.println(novaSaldo);// aqui vai dar um erros de escopo, já que a variavel novoSaldo não está global
    }
}
