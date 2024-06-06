public class CondicionaisSimples {
public static void main(String[] args) {
    double saldo = 25.0;
    double saldoSolicitado = 17.0;

    if(saldoSolicitado < saldo)
        saldo = saldo - saldoSolicitado;

    System.out.println("Saldo atual: R$ " + saldo);    

    
    }
}
