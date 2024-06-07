
public class CaixaEletronico {
public static void main(String[] args) {
    double saldo = 25.0;
    double saldoSolicitado = 28.0;

    if(saldoSolicitado < saldo) {
        saldo = saldo - saldoSolicitado;
        System.out.println("Saldo atual: R$ " + saldo);    
}
    else 
    System.out.println("Saldo insuficiente");

    
    }
}
